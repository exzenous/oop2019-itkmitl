package JavaReview;

import javax.swing.*;
import java.util.Calendar;

public class PrintMe extends JLabel implements Runnable {

    String hr,min,sec;
    int count = 0;

    @Override
    public void run() {
        while(true){
            count++;

            sec = String.format("%02d",count%60);
            int min_e = count/60;
            min = String.format("%02d", min_e%60 );
            hr = String.format("%02d", count /3600);;

            this.setText(hr + ":" + min + ":" + sec);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
