package com.mycompany.filehandling;
import java.io.File;  
import java.io.IOException;
import java.io.FileWriter;

public class FileHandling {

    public static void main(String[] args) {
        Person p1 = new Person("Azmi", 20);        
        try{
            File myObj = new File("person.txt");
            
            if(myObj.createNewFile()){
                System.out.println("File created : " + myObj.getName());
            }else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("File couldnt be created i.e an error occured");
            e.printStackTrace();
        }
        
        try{
            FileWriter writeToFile = new FileWriter("person.txt");   
            writeToFile.write("Java sucks and C was a way better language.");
            writeToFile.write("\n" + p1.getName());
            writeToFile.write("\n" + p1.getAge());

            writeToFile.close();
        }
        catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
