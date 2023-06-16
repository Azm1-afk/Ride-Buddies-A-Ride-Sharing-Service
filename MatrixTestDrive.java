package com.mycompany.mavenproject1;
import java.util.Scanner;


public class MatrixTestDrive {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows and columns for the matrices : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        Matrix matrix1 = new Matrix(row, col);
        Matrix matrix2 = new Matrix(row, col);
        
        int input;
     // TESTING FOR BUGS   
     
     
        System.out.print("Enter elements for the 1st matrix : ");
        
        for(int i = 0 ; i < matrix1.getRows() ; i++){
            for(int j = 0 ; j < matrix1.getColumns() ; j++){
                input = sc.nextInt();
                matrix1.setElement(i,j, input);
            }
        }
        
        System.out.print("Enter elements for the 2nd matrix : ");
        
        for(int i = 0 ; i < matrix2.getRows() ; i++){
            for(int j = 0 ; j < matrix2.getColumns() ; j++){
                input = sc.nextInt();
                matrix2.setElement(i,j, input);
            }
        }
        

        
   
        
        
        


        






        // TEST ENDS HERE



       
        
        
        
    }
}
