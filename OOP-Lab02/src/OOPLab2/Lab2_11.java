package OOPLab2;

import java.util.Scanner;

public class Lab2_11 {
    public static void main(String[] args){
        Scanner inSalSc = new Scanner(System.in);
        System.out.print("Input your money: ");
        Double inSal = inSalSc.nextDouble();
        System.out.print("Input your Account Type: ");
        char accountType = inSalSc.next().charAt(0);
        if(inSal>=0){
            switch (accountType){
                case 'A':
                    System.out.print("Your total money in one year: " + inSal*1.015);
                    break;
                case 'B':
                    System.out.print("Your total money in one year: " + inSal*1.02);
                    break;
                case 'C':
                    System.out.print("Your total money in one year: " + inSal*1.025);
                    break;
                case 'X':
                    System.out.print("Your total money in one year: " + inSal*1.05);
                    break;
                default:
                    System.out.print("Wrong Account Type");
                    break;
                }
        }
    }
}
