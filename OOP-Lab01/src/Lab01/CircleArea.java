package Lab01;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        int a = 9, b = 4, c, d;
        c = b++ * ++a;
        d = ++b * a++;
        System.out.println(c);
        System.out.println(d);
    }
}
