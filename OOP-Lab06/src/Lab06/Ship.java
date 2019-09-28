package Lab06;

public class Ship extends Vehicle implements Floatabe {
    public Ship() {
        super(0.0);
    }
    public Ship(double fuel) {
        super(fuel);
    }

    public void move() {
        fl0at();
    }
    public void move(int distance) {
        for (int i=1;i<=distance;i++) {
            fl0at();
        }
    }

    @Override
    public void honk() {
        System.out.println("Shhhhh");
    }
    @Override
    public void startEngine() {
        if (this.getFuel() - 10 >= 10) {
            System.out.println("Engine starts");
            this.setFuel(this.getFuel() - 10);
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine() {
        System.out.println("Engine stops");
    }
    @Override
    public void fl0at() {
        if (this.getFuel() - 50 >= 50) {
            System.out.println("Ship moves");
            this.setFuel(this.getFuel() - 50);
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }

}
