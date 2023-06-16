package com.mycompany.mavenproject1;

public class Matrix {
    
    private int rows;
    private int columns;
    private int[][] matrix;
    
    public Matrix(int row, int col){ // CONSTRUCTOR for Matrix class
        this.rows = row;
        this.columns = col;
        this.matrix = new int[row][col];
    }
    
    public int getRows(){   // 2.1
        return this.rows;
    }
    
    public int getColumns(){    // 2.2
        return this.columns;
    }
    
    public void setElement(int i, int j, int element){  // 2.3        
        matrix[i][j] = element;
    }
    
    public int getElement(int i, int j){
        return this.matrix[i][j];
    }
   
    
    public Matrix addMatrix(Matrix a, Matrix b){    // 2.4
        if((a.rows == b.rows) && (a.columns == b.columns)){     //if both matrices have same number of rows and columns
            Matrix resultMatrix = new Matrix(rows, columns);
            for(int i = 0 ; i < rows ; i++){
                for(int j = 0; j < columns ; j++){
                    resultMatrix.setElement(i,j, (a.getElement(i,j)) + (b.getElement(i,j)));
                }
            }
            return resultMatrix;
        }
        else{
            System.out.print("Matrices cannot be added.");
            return null;
        }
    }
    
    public Matrix product(Matrix a, Matrix b){  // 2.5
        
        if(a.getColumns() == b.getRows()){
            Matrix product = new Matrix(rows, columns);     // if both matrix a has columns equal to matrix b rows
            for(int i = 0 ; i < a.rows ; i++){
                for(int j = 0 ; j < b.columns ; j++){
                    int sum = 0;
                    for(int x = 0; x < a.columns ; x++){
                        sum += a.getElement(i, x) * b.getElement(x, j);
                    }
                    product.setElement(i,j,sum);
                }
            }
        return product;
        }
        else{
            System.out.print("Matrices cannot be multiplied");
            return null;
        }
        
    }

   
    
    
    
    
    

    
    
}
