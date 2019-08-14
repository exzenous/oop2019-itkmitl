package OOPLab2;

import java.util.Scanner;

public class Lab2_9 {
    public static void main(String[] args){
        Double salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        salary = sc.nextDouble();
        if(salary>=0) {
            if (salary <= 50000) {
                System.out.print("Your Tax per Year: " + (salary*0.05));
            }
            else {
                System.out.print("Your Tax per Year: " + (salary*0.1));
            }
        }
    }
}
