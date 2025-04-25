package Labreport.L31;

import java.net.*;
import java.io.*;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(12345);
        Socket si = s.accept();
        OutputStream slout = si.getOutputStream();
        DataOutputStream dos = new DataOutputStream(slout);

        dos.writeUTF("Hello from the server!");

        dos.close();
        slout.close();
        si.close();
        s.close();
    }
}