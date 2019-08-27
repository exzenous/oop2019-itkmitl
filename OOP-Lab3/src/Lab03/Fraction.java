package Lab03;

public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        return topN + "\\" + btmN;
    }
    public String toFloat(){
        return Double.toString((topN*1.0)/(btmN*1.0));
    }
    public void addFraction(Fraction thisFrac){
        topN = (topN*thisFrac.btmN) + (thisFrac.topN*btmN);
        btmN = btmN*thisFrac.btmN;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 2;
        f1.btmN = 3;

        Fraction f2 = new Fraction();
        f2.topN = 1;
        f2.btmN = 4;

        System.out.println("before " + f1.toFraction());
        System.out.println("before " + f1.toFloat());

        f1.addFraction(f2);

        System.out.println("after " + f1.toFraction());
        System.out.println("after " + f1.toFloat());
    }
}
