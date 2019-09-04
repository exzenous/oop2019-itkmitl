package Lab01;

import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float liters;
        while (true) {
            liters = input.nextFloat();
            if (liters < 0){
                System.out.println("Invalid Input");
            }
            else {
                break;
            }
        }
        float totalPrice = liters*30;
        System.out.println(totalPrice);
    }
}
