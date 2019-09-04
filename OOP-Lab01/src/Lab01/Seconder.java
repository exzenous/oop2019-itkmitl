package Lab01;

import java.util.Scanner;

public class Seconder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hr,min;
        hr = input.nextInt()*3600;
        min = input.nextInt()*60;
        System.out.println("Second: " + (hr+min));
    }
}
