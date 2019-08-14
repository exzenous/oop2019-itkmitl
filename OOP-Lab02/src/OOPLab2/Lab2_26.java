package OOPLab2;

import java.util.Scanner;

public class Lab2_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number: ");
        int inputNum = sc.nextInt();
        for (int i = 1;i<=inputNum;i++) {
            if (i%5 == 0) System.out.print("/");
            else System.out.print("|");
        }
    }
}
