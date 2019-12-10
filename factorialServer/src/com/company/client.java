package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class client {
    public static void main(String[] args){

        try {

            System.out.println("Client Started");
            Socket soc = new Socket("localhost",9806);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a Number");
            int no = Integer.parseInt(userInput.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(no);
            BufferedReader result = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(result.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
