package Lab01;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float length;
        while (true) {
            length = input.nextFloat();
            if (length < 0){
                System.out.println("Invalid Input");
            }
            else {
                break;
            }
        }

        System.out.println((length*length));

    }
}
