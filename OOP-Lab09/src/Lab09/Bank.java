package Lab09;

public class Bank {
    private Account[] acct;
    private int numAcct;

    public Bank(){
        this.acct = new Account[10];
    }

    public void addAccount(Account ac){
        for (int i = 0 ; i < this.acct.length ; i++) {
            if (i == 0 && this.acct[i] == null) {
                this.acct[i] = ac;
                break;
            }
            else if (this.acct[i] == null && this.acct[i-1] != null) {
                this.acct[i] = ac;
                break;
            }
        }
        setNumAccount(getNumAccount() + 1);
    }
    public Account getAccount(int index) {
        return this.acct[index];
    }

    public int getNumAccount() {
        return numAcct;
    }
    public void setNumAccount(int numAcct) {
        this.numAcct = numAcct;
    }
}
