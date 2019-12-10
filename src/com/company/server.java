package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args){

        try {
            ServerSocket ss = new ServerSocket(9806);
            Socket s = ss.accept();
            System.out.println("Connection Established");
            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int number = Integer.parseInt(input.readLine());
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            out.println("Factorial of "+number+" is "+fact(number));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int fact(int no){
        int f=1;
        for(int i=1;i<=no;i++){
            f*=i;
        }
        return f;
    }
}
