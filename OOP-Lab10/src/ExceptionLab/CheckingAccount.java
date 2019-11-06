package ExceptionLab;

public class CheckingAccount extends Account {
    private double credit;

    public CheckingAccount() {
        super(0,"");
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance,name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0){
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer");
        }
    }
    public Double getCredit() {
        return credit;
    }

    @Override public void withdraw(double a) throws WithdrawException {
        Double totalMoney = getBalance() + getCredit();
        if ((a > 0)) {
            if (getBalance() - a >= 0) {
                this.balance -= a;
                System.out.println(a + " bath is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
            }
            else if (totalMoney - a > 0) {
                Double diffMoney = a - getBalance();
                a -= getBalance();
                super.withdraw(getBalance());
                setCredit(getCredit() - diffMoney);
                System.out.println(a + " bath is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
            }
            else {
//                System.out.println("Not Enough Money");
                throw new WithdrawException("Account " + getName() + " has not enough money");
            }
        }
        else {
            System.out.println("Input number must be a positive integer");
        }
    }

    @Override
    public String toString() {
        return (getName() + " account has " + getBalance() + " bath and " + getCredit() + " credits.");
    }
}
