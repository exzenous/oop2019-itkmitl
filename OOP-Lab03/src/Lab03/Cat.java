package Lab03;

public class Cat {
    private String name;
    private String color;
    public double weight;
    public double height;

    private void setWeight(double w){
        weight = w;
    }
    private void setHeight(double h){
        height = h;
    }
    private void setName(String n){
        name = n;
    }
    private void setColor(String c){
        color = c;
    }

    public void upWeight(double w){
        if (w<0) {
            System.out.println("Error");
        }
        else {
            setWeight(weight + w);
        }
    }
    public void downWeight(double w){
        if (w<0) {
            System.out.println("Error");
        }
        else {
            setWeight(weight - w);
        }
    }
    public void upHeight(double h){
        if (h<0) {
            System.out.println("Error");
        }
        else {
            setHeight(height + h);
        }
    }
    public void defineCat(String n, String c){
        name = n;
        color = c;
    }
    public void speak(){
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
    }

    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.defineCat("Tong Kaw","grey");
        kitty.height = 15;
        kitty.weight = 3.5;
        kitty.upWeight(1.2);
        kitty.upHeight(0.5);
        kitty.downWeight(-0.7);
        kitty.speak();
    }
}
