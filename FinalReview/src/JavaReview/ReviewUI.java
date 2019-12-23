package JavaReview;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

public class ReviewUI {

    boolean isHit = false;
    Thread t1;
    String[] things = {"Thing 1", "Thing 2","Thing 3"};

    public class OnMouseClick extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            if (!isHit){
                t1.suspend();
                isHit = true;
            }
            else{
                t1.resume();
                isHit = false;
            }
        }
    }

    public void initUI(){
        JFrame fr = new JFrame("Test");
        fr.setLayout(new GridLayout(2,1));
        PrintMe labelTime = new PrintMe();
        labelTime.setFont(new Font("Helvetic", Font.BOLD,50));
        labelTime.addMouseListener(new OnMouseClick());

        t1 = new Thread(labelTime);
        t1.start();
        fr.add(labelTime);

        JComboBox cb = new JComboBox(things);
        cb.addItemListener(new OnItemChange());
        fr.add(cb);

        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public class OnItemChange implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED)
            {
                String item = (String) e.getItem();
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        new ReviewUI().initUI();
    }

}
