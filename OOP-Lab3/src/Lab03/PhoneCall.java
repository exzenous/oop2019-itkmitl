package Lab03;

public class PhoneCall {
    private String brandName;
    private Boolean hasFM;
    private Boolean hasCamera;
    private double price;
    private int space;

    public void call(String name){
        System.out.println("Calling to " + name);
    }
    public void turnOn(){
        System.out.println("On");
    }
    public void turnOff(){
        System.out.println("Off");
    }

    public static void main(String[] args) {
        PhoneCall p1 = new PhoneCall();
        p1.turnOn();
        p1.call("Peter");
        p1.turnOff();
    }
}
