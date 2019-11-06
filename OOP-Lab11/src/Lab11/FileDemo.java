package Lab11;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout;
            DataOutputStream dout;
            fout = new FileOutputStream("data.dat"); dout = new DataOutputStream(fout); dout.writeInt(124); dout.writeDouble(2.45); dout.writeChar('a'); dout.writeUTF("test");
            dout.close();
            fout.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
