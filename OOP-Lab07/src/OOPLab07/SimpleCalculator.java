package OOPLab07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator {
    private String[] numNsign = {"7","8","9","+","4","5","6","-","1","2","3","x","0","ac","=","/"};

    private JFrame fr;
    private JPanel buttonsPanel;
    private JButton button;
    private JTextField numDisplay;

    private String currentNumText;
    private Double currentNum = 0.0;
    private String secondNumText;
    private Double secondNum = 0.0;
    private String selectedOp;
    private Boolean isClickedEqual = false;
    private Boolean isReInput = true;
    private Boolean isHitSign = false;

    public void init(){

        fr = new JFrame("Simple Calculator");

        numDisplay = new JTextField("0");
        currentNum = 0.0;
        isClickedEqual = true;
        numDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        fr.add(numDisplay,BorderLayout.NORTH);

        buttonsPanel = new JPanel(new GridLayout(4,4));
        for (int i=0;i<=numNsign.length - 1;i++) {
            button = new JButton(numNsign[i]);
            if (numNsign[i].equals("+") || numNsign[i].equals("-") || numNsign[i].equals("x") || numNsign[i].equals("/")){
                button.addActionListener(new OperationSelected());
            }
            else if (numNsign[i].equals("=") || numNsign[i].equals("ac")){
                button.addActionListener(new NonOperationSelected());
            }
            else {
                button.addActionListener(new NumbersSelected());
            }
            buttonsPanel.add(button);
        }
        fr.add(buttonsPanel,BorderLayout.CENTER);

        fr.pack();
        fr.setVisible(true);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public class OperationSelected implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            selectedOp = ((JButton)(e.getSource())).getText();
            currentNum = Double.parseDouble(numDisplay.getText());

            isHitSign = true;
            isReInput = true;

            System.out.println(currentNum);

        }
    }

    public class NonOperationSelected implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            isReInput = true;

            // Hit Equals Sign
            if ( (((JButton)(e.getSource())).getText()).equals("=") ){

                isClickedEqual = true;
                if (isHitSign) {secondNum = Double.parseDouble(numDisplay.getText());}
                switch (selectedOp){
                    case "+":
                        currentNum += secondNum;
                        break;
                    case "-":
                        currentNum -= secondNum;
                        break;
                    case "x":
                        currentNum *= secondNum;
                        break;
                    case "/":
                        currentNum /= secondNum;
                        break;
                    default:
                        break;
                }
                numDisplay.setText(currentNum.toString());

            }
            // Hit AC Sign
            else {
                isClickedEqual = false;     // Reset All
                numDisplay.setText("0");    // Make to Number 0
                currentNum = Double.parseDouble(numDisplay.getText());      // Reset Current Number to 0
            }

            isHitSign = false;
        }
    }

    public class NumbersSelected implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
//            System.out.println(((JButton)(e.getSource())).getText());

            if ( isReInput ){
                numDisplay.setText( ((JButton)(e.getSource())).getText() ); isReInput = false;
            }
            else {
                numDisplay.setText(numDisplay.getText() + ((JButton)(e.getSource())).getText());
            }
            isClickedEqual = false;
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator().init();
    }
}
