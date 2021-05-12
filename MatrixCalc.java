
package javaprojects;

import java.util.Scanner;


public class MatrixCalc {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); // for input
        
        int m1[][] = {{1,3,4},{2,4,3},{3,4,5}}; // matrix 1
        int m2[][] = {{1,3,4},{2,4,3,},{1,2,4}}; // matrix 2

        int m3[][] = new int[3][3]; // for calculation
       
//        menu
        System.out.println("What you want to do with matrices?\n 1. Addition\n 2. Multiplication");
        System.out.print("Your Choice: ");
        int choice = s.nextInt(); //  input choice
        
        
        switch(choice){
            case 1: // addition
                System.out.println("Addition of matrices: ");
                for(int i = 0; i<3; i++){
                    for(int j = 0; j<3; j++){
                        m3[i][j] = m1[i][j] + m2[i][j];
                        System.out.print(m3[i][j]);
                    }
                        System.out.println(" ");
                }
                break;
            case 2: // multiplication
                System.out.println("Multiplication of matrices: ");
                for(int i = 0; i<3; i++){  // change the row number
                    for(int j = 0; j<3; j++){ // change column 
                        m3[i][j] = 0; // initialization sum as 0
                        for(int k = 0; k<3; k++){ 
                            m3[i][j] += m1[i][k] * m2[k][j];
                        }
                        System.out.print(m3[i][j] + " ");
                    }
                    System.out.println(" "); // changing line
                }
                break;
            default:  System.out.println("INVALID CHOICE PLEASE TRY AGAIN!!");
        }
        
    }
}
