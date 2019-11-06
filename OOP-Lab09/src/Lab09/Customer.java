package Lab09;

import java.util.ArrayList;

public class Customer {
    private String firstName, lastName;
    private ArrayList acct;
    private int numOfAccount;

//    public Customer (String f, String l, Account a){
//        this.firstName = f;
//        this.lastName = l;
//        this.numOfAccount = 0;
//        this.acct = new Account[5];
//
//    }
    public Customer (String f, String l){
        this.firstName = f;
        this.lastName = l;
        this.acct = new ArrayList();
    }
    public Customer (){
        this("","");
    }

    public void addAccount(Account ac) {
//        for (int i = 0 ; i < this.acct.length ; i++) {
//            if (i == 0 && this.acct[i] == null) {
//                this.acct[i] = ac;
//                break;
//            }
//            else if (this.acct[i] == null && this.acct[i-1] != null) {
//                this.acct[i] = ac;
//                break;
//            }
//        }
        acct.add(ac);
//        setNumOfAccount(getNumOfAccount() + 1);
    }

    public int getNumOfAccount() {
        return this.acct.size();
    }
//    public void setNumOfAccount(int numOfAccount) {
//        this.numOfAccount = numOfAccount;
//    }

    public void setFirstName(String f){
        this.firstName = f;
    }
    public void setLastName(String l){
        this.lastName = l;
    }
//    public void setFirstName(CheckingAccount a){
//        this.acct = a;
//    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public Account getAccount(int index){
//        return this.acct[index];
        return (Account) this.acct.get(index);
    }
//    public Account[] getAcct(){
//        return this.acct;
//    }
    public String toString(){
        if (acct.size() == 0)
            return this.firstName + " " + this.lastName + "doesn’t have account.";
        else
            return "The " + this.firstName + " " + this.lastName + " has " + this.acct.size() + " account(s)";
    }
//    public boolean equals(Customer c){
//        if(firstName.equals(c.getFirstName()) & lastName.equals(c.getLastName())){
//            return true;
//        }else{
//            return false;
//        }
//    }
}
