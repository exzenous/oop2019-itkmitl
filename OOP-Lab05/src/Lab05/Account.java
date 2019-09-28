package Lab05;

public class Account {
    protected double balance;
    protected String name;

    public Account (double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double a) {
        if (a > 0) {
            this.balance += a;
            System.out.println(a + " bath is deposited to " + getName());
        }
        else {
            System.out.println("Input number must be a positive integer");
        }
    }
    public void withdraw(double a) {
        if ((a > 0)) {
            if (getBalance() - a >= 0){
                this.balance -= a;
                System.out.println(a + " bath is withdrawn from " + getName());
            }
            else {
                System.out.println("Not Enough Money");
            }
        }
        else {
            System.out.println("Input number must be a positive integer");
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Double getBalance() {
        return balance;
    }
    public void showMyAccount() {
        System.out.println(getName() + " account has " + getBalance() + " bath");
    }
}
