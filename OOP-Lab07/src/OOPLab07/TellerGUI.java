package OOPLab07;

import java.awt.*;
import javax.swing.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel balancePanel,amountPanel,buttonsPanel;
    private JLabel balanceLabel,amountLabel;
    private JTextField balanceTF,amountTF;
    private JButton depositeBtn,withdrawBtn,exitBtn;

    public void init(){
        fr = new JFrame("Teller GUI");

        balancePanel = new JPanel(new GridLayout(1,2));
        balanceLabel = new JLabel("Balance: ");
        balanceTF = new JTextField("6000");
        balanceTF.setEditable(false);
        balancePanel.add(balanceLabel);
        balancePanel.add(balanceTF);

        amountPanel = new JPanel(new GridLayout(1,2));
        amountLabel = new JLabel("Amount: ");
        amountTF = new JTextField();
        amountPanel.add(amountLabel);
        amountPanel.add(amountTF);

        buttonsPanel = new JPanel(new FlowLayout());
        depositeBtn = new JButton("Deposit");
        withdrawBtn = new JButton("Withdraw");
        exitBtn = new JButton("Exit");
        buttonsPanel.add(depositeBtn);
        buttonsPanel.add(withdrawBtn);
        buttonsPanel.add(exitBtn);

        fr.setLayout(new GridLayout(3,1));
        fr.add(balancePanel);
        fr.add(amountPanel);
        fr.add(buttonsPanel);

        fr.setVisible(true);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TellerGUI().init();
    }
}
