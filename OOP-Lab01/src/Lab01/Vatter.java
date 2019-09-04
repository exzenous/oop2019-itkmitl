package Lab01;

import java.util.Scanner;

public class Vatter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float priceNoVat;
        while (true) {
            priceNoVat = input.nextFloat();
            if (priceNoVat < 0){
                System.out.println("Invalid Input");
            }
            else {
                break;
            }
        }
        System.out.println(priceNoVat*1.07);
    }
}
