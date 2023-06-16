package com.mycompany.userinput;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter username : ");
        String userName = sc.next();
        
        try{
            FileWriter uWrite = new FileWriter("username.txt");
            
            uWrite.write(userName);
            
            uWrite.close();
            System.out.println("Successfully written to file!");
        }catch(IOException e){
            System.out.println("An unexpected error occured");
            e.printStackTrace();
        }
    }
}