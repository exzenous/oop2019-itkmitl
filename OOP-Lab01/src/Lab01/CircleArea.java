package Lab01;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double radius = input.nextDouble();
        if (radius >= 0) {
            Double cirArea = (Math.PI)*(radius*radius);
            System.out.println(cirArea);
        }
        else {
            System.out.println("Error: Entered Minus Radius");
        }
    }
}
