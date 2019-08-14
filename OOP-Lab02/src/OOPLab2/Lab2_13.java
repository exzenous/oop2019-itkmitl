package OOPLab2;

import java.util.Scanner;

public class Lab2_13 {
    public static void main(String[] args){
        Scanner inMonthSc = new Scanner(System.in);
        System.out.print("Enter Month ID: ");
        byte monthInput = inMonthSc.nextByte();
        switch (monthInput){
            case 2:
                System.out.print("28 days");
                break;
            case 1 : case 3: case 5 : case 7 : case 8 : case 10 : case 12 :
                System.out.print("31 days");
                break;
            case 4 : case 6 : case 9 : case 11 :
                System.out.print("30 days");
                break;
            default:
                System.out.print("Wrong Input");
                break;
        }
    }
}
