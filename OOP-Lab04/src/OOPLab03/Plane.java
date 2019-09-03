package OOPLab03;

public class Plane extends Vehicle {
    public void showPlaneInfo(){
        String message = "Plane detail is, Fuel is " + this.getFuel() + " liters and Top Speed is " + this.getTopSpeed() + " m/s.";
        System.out.println(message);
    }
    public void setPlaneInfo(int s, String t) {
        this.setFuel(s);
        this.setTopSpeed(t);
    }
    public void fly() {
        if (getFuel() - 200 >= 0) {
            setFuel(getFuel() - 200);
            System.out.println("Fly.");
        }
        else {
            System.out.println("Please add fuel.");
        }
    }
}
