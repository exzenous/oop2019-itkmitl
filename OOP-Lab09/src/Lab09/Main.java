package Lab09;

public class Main {
    public static void main(String[] args) {
//        Bank myBank = new Bank();
//        Account ac1 = new Account(5000,"Sommai");
//        Account ac2 = new Account(3000,"Somchai");
//        Account ac3 = new Account(900,"Somsri");
//        myBank.addAccount(ac1);
//        myBank.addAccount(ac2);
//        myBank.addAccount(ac3);
//
//        System.out.println("Number of Account " + myBank.getNumAccount());
//        myBank.getAccount(0).showAccount();
//        System.out.println("Deposit 500...");
//        myBank.getAccount(0).deposit(500);
//        myBank.getAccount(0).showAccount();
//        System.out.println("Show all accounts");
//
//        System.out.println("==============================");
//        for(int i=0; i<myBank.getNumAccount(); i++){
//            myBank.getAccount(i).showAccount();
//        }

        Customer cust = new Customer("Somsak", "Sriphoomset");
        Account acc1 = new Account(5000.0, "KBANK");
        Account acc2 = new Account(3000.0, "SCB");
        cust.addAccount(acc1);
        cust.addAccount(acc2);
        // ทดลองฝากเงิน ถอนเงินในบญั ชีตา่งๆ
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        //แสดงขอ้มลูของลกูคา้เชน่SomsriBoonjinghas2accounts.
        System.out.println(cust);
        for (int i = 0; i < cust.getNumOfAccount(); i++) { cust.getAccount(i).showAccount(); }


    }
}
