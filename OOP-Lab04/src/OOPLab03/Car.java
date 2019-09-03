package OOPLab03;

public class Car extends Vehicle {
    private String typeEngine;

    public void setTypeEngine(String typeEngine){
        this.typeEngine = typeEngine;
    }
    public String getTypeEngine() {
        return typeEngine;
    }

    public void showCarInfo() {
        String message1 = "Car engine is " + this.getTypeEngine() + ", ";
        System.out.print(message1);
        String message2 = "Fuel is " + this.getFuel() + " liters and Top Speed is " + this.getTopSpeed() + " m/s.";
        System.out.println(message2);
    }
    public void setCarInfo(int s, String t, String y) {
        setFuel(s);
        setTopSpeed(t);
        setTypeEngine(y);
    }
    public void move(){
        if (getFuel() - 50 >= 0) {
            setFuel(getFuel() - 50);
            System.out.println("Move.");
        }
        else {
            System.out.println("Please add fuel.");
        }
    }
}
