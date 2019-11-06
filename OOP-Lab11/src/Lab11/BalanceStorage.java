package Lab11;

import java.io.*;

public class BalanceStorage {

    public static File balanceFile = new File("./balance.dat");

    public static Double getBalance() {

        Double balanceValue = 0.0;

        FileOutputStream fout;
        DataOutputStream dout;

        FileInputStream fin;
        DataInputStream din;

        if (balanceFile.exists()) {
            try {
                fin = new FileInputStream(balanceFile);
                din = new DataInputStream(fin);
                balanceValue = din.readDouble();
                din.close();fin.close();
//                System.out.println("Did Exist");
                return balanceValue;
            }catch (IOException e) { }
        }
        else{
            try {
                fout = new FileOutputStream(balanceFile);
                dout = new DataOutputStream(fout);
                balanceValue = 9000.0;
                dout.writeDouble(balanceValue);
                dout.close();fout.close();
//                System.out.println("Didn't Exist");
                return balanceValue;
            }
            catch (IOException e) { }
        }
        return balanceValue;
    }

    public static void saveBalance(double currentValue) {
        FileOutputStream fout;
        DataOutputStream dout;
        try {
            fout = new FileOutputStream(balanceFile);
            dout = new DataOutputStream(fout);
            dout.writeDouble(currentValue);
            dout.close();fout.close();
        }catch (IOException e) { }
    }
}
