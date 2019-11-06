package Lab10;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            double coeffientOne = Double.parseDouble(args[0]);
            double coeffientTwo = Double.parseDouble(args[1]);
            double coeffientThree = Double.parseDouble(args[2]);

            double sqrt = (Math.sqrt(((coeffientTwo*coeffientTwo) - (4*coeffientOne*coeffientThree))));
            double xOne = ((-1*coeffientTwo) + sqrt)/(2*coeffientOne);
            double xTwo = ((-1*coeffientTwo) - sqrt)/(2*coeffientOne);

            System.out.println("x1: " + xOne);
            System.out.println("x2: " + xTwo);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Please enter 3 numbers as a,b,c respectively.");
        }
        catch (NumberFormatException ex) {
            System.out.println("Please enter data in number format only.");
        }

    }
}
