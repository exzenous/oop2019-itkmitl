package OOPLab2;

import java.util.Scanner;

public class Lab2_23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int firstNum = input;

        while (!((input % 3 == 0) | (input % 2 == 0))) {
            input = sc.nextInt();
        }
        System.out.print("Output is " + firstNum);
    }
}
