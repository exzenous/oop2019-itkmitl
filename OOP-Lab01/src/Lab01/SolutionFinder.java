package Lab01;

public class SolutionFinder {
    public static void main(String[] args){
        double a = 4,b = 8,c = 3;
        double inSqrt = (b*b) - (4*a*c);
        double varX1 = (-1*b + Math.sqrt(inSqrt))/(2*a);
        double varX2 = (-1*b - Math.sqrt(inSqrt))/(2*a);
        System.out.println(varX1);
        System.out.println(varX2);
    }
}
