package Lab01;

import java.util.Scanner;

public class ScoreMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float stu1,stu2,stu3;

        while (true) {
            stu1 = input.nextFloat();
            if (stu1 < 0 || stu1 > 10){
                System.out.println("Invalid Score");
            }
            else {
                break;
            }
        }
        while (true) {
            stu2 = input.nextFloat();
            if (stu2 < 0 || stu2 > 10){
                System.out.println("Invalid Score");
            }
            else {
                break;
            }
        }
        while (true) {
            stu3 = input.nextFloat();
            if (stu3 < 0 || stu3 > 10){
                System.out.println("Invalid Score");
            }
            else {
                break;
            }
        }

        float meanTotal = (stu1+stu2+stu3)/3;
        System.out.println(meanTotal);
    }

}
