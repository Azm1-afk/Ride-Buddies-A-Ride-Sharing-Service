
package com.mycompany.mavenproject1;
import java.util.Scanner;


public class Mavenproject1 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length and breadth respectively : ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        
        Area newArea1 = new Area(length, breadth);
        
        System.out.print("The area of the quadrilateral is : " + newArea1.returnArea());
        
    }
}