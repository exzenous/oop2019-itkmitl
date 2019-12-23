package Lab11;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import javax.swing.*;

public class TellerGUI {

    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JTextField txt1, txt2;
    private JLabel lbl1, lbl2, lbl3;
    private JButton btn1, btn2, btn3;

    public class DepositSelected implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) throws NumberFormatException{
            try {
                double currentValue = Double.parseDouble(txt1.getText());
                double depositValue = Double.parseDouble(txt2.getText());
                if(depositValue >= 0){
                    double newValue = currentValue + depositValue;
                    txt1.setText(Double.toString(newValue));
                    lbl3.setText("...");
                }
                else{
                    throw new NumberFormatException();
                }
            }
            catch (NumberFormatException e) {
                lbl3.setText("Please Enter Correct Number Format");
            }
        }
    }

    public class WithdrawSelected implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                double currentValue = Double.parseDouble(txt1.getText());
                double withdrawValue = Double.parseDouble(txt2.getText());
                if(withdrawValue >= 0){
                    if (withdrawValue > currentValue){
                        lbl3.setText("You can't withdraw more than your balance.");
                    }
                    else{
                        double newValue = currentValue - withdrawValue;
                        txt1.setText(Double.toString(newValue));
                        lbl3.setText("...");
                    }
                }
                else{
                    throw new NumberFormatException();
                }
            }
            catch (NumberFormatException e) {
                lbl3.setText("Please Enter Correct Number Format");
            }
        }
    }

    public class ExitSelected implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            BalanceStorage.saveBalance(Double.parseDouble(txt1.getText()));
            System.exit(0);
        }
    }

    public void init() {
        // Construct Object

        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        txt1 = new JTextField((BalanceStorage.getBalance()).toString());
        txt2 = new JTextField();
        lbl1 = new JLabel("  Balance");
        lbl2 = new JLabel("  Amount");
        lbl3 = new JLabel("...");
        btn1 = new JButton("Deposit");
        btn1.addActionListener(new DepositSelected());
        btn2 = new JButton("Withdraw");
        btn2.addActionListener(new WithdrawSelected());
        btn3 = new JButton("Exit");
        btn3.addActionListener(new ExitSelected());

        txt1.setEditable(false);

        fr.setLayout(new GridLayout(4, 1));
        p1.setLayout(new GridLayout(1, 2));
        p2.setLayout(new GridLayout(1, 2));
        p3.setLayout(new FlowLayout());

        p1.add(lbl1);
        p1.add(txt1);

        p2.add(lbl2);
        p2.add(txt2);

        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);

        p4.add(lbl3);
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);

        fr.addWindowListener(new PrintOnClose());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 200);
        fr.setVisible(true);
    }

    class PrintOnClose extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            super.windowClosing(e);
            System.out.println("Hit Close!");
        }
    }

    public static void main(String[] args) {
        new TellerGUI().init();
    }

}
