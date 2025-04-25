package Labreport.L32;


import java.net.*;
import java.io.*;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        Socket si = new Socket("localhost", 12345);
        InputStream S1In = si.getInputStream();
        DataInputStream dis = new DataInputStream(S1In);

        String st = dis.readUTF();
        System.out.println(st);

        dis.close();
        si.close();
        S1In.close();
    }
}