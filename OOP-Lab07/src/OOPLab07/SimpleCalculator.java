package OOPLab07;

import java.awt.*;
import javax.swing.*;

public class SimpleCalculator {
    private String[] numNsign = {"7","8","9","+","4","5","6","-","1","2","3","x","0","ac","=","/"};
    private JFrame fr;
    private JPanel buttonsPanel;
    private JButton button;
    private JTextField numDisplay;

    public void init(){
        fr = new JFrame("Simple Calculator");

        numDisplay = new JTextField();
        fr.add(numDisplay,BorderLayout.NORTH);

        buttonsPanel = new JPanel(new GridLayout(4,4));
        for (int i=0;i<=numNsign.length - 1;i++) {
            button = new JButton(numNsign[i]);
            buttonsPanel.add(button);
        }
        fr.add(buttonsPanel,BorderLayout.CENTER);

        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SimpleCalculator().init();
    }
}
