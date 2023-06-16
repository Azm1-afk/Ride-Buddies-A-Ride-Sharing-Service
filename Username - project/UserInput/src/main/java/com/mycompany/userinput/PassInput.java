package com.mycompany.userinput;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PassInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter password : ");
        String pWord = sc.next();
        
        try{
            FileWriter pWrite = new FileWriter("password.txt");
            
            pWrite.write(pWord);
            
            pWrite.close();
            System.out.println("Successfully written to file!");
        }catch(IOException e){
            System.out.println("An unexpected error occured");
            e.printStackTrace();
        }
    }
}