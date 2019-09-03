package OOPLab03;

public class Vehicle {
    private int fuel;
    private String topSpeed;

    protected void setFuel(int fuel) {
        this.fuel = fuel;
    }
    protected int getFuel() {
        return fuel;
    }

    protected void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }
    protected String getTopSpeed() {
        return topSpeed;
    }

    public void showInfo() {
        String message = "Fuel is " + this.getFuel() + " liters and Top Speed is " + this.getTopSpeed() + " m/s.";
        System.out.println(message);
    }
}
