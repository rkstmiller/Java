/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *Class MagicSquare tests takes in n numbers from the user, builds a 2d array, and tests if matrix is Magic Square
 * @author Ron Miller
 */
public class MagicSquare {
  /**
 *testHorizontal accepts the 2d array and tests the horizontal sums to make sure they are equal.
 * if they are equal it returns the number else it prints false and the program exits
     * @param userin 
     * @param n
     * @return sumArray[0]
 */
    public static int testHorizontal(int[][] userin, int n){
        int[] sumArray = new int[n];
        int temp=0;
        
        for(int i=0;i<n;i++){
            temp=0;
            for(int j=0;j<n;j++){
                temp+=userin[i][j];
                }
            
                sumArray[i]=temp;

                }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n-1;j++){
                    if(sumArray[i]!=sumArray[j]){
                        System.out.println("false");
                        System.exit(0);
                    }
                
            }
            }

        
        
        return sumArray[0];
    }
      /**
 *testVertical accepts the 2d array and tests the vertical sums to make sure they are equal.
 * if they are equal it returns the number else it prints false and the program exits
     * @param userin
     * @param n
     * @return sumArray[0]
 */
    public static int testVertical(int[][] userin, int n){
          int[] sumArray = new int[n];
        int temp=0;
        
        for(int i=0;i<n;i++){
            temp=0;
            for(int j=0;j<n;j++){
                temp+=userin[j][i];
                }
            
                sumArray[i]=temp;

                }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n-1;j++){
                    if(sumArray[i]!=sumArray[j]){
                        System.out.println("false");
                        System.exit(0);
                    }
            }
            }
        return sumArray[0];
    }
      /**
 *testDiagonal accepts the 2d array and tests the Diagonal sums to make sure they are equal.
 * if they are equal it returns the number else it prints false and the program exits
     * @param userin
     * @param n
     * @return 
 */
    public static int testDiagonal(int[][] userin, int n){
        int lDiag=0;
        int rDiag=0;
        for( int i=0;i<n;i++){
            
            lDiag+=userin[i][i];
            rDiag+=userin[i][n-(1+i)]; 
        }
        if(lDiag!=rDiag){
            System.out.print("false");
            System.exit(0);
        }
        return lDiag; 
    }
     /**
 *isUnique accepts an integer array as an argument and validates that each integer is unique
     * @param userin
     * @return boolean
 * 
 */ 
   public static boolean isUnique(int[] userin){
       
       for(int i=0;i<userin.length-1;i++){
          for(int j=i+1;j<userin.length-1;j++){ 
              if(userin[i]==userin[j]){
               return false;
              }
          }
           }
       

        return true;
    }
 /**
 *isSquare accepts an integer array as an argument and validates that it is a squared number
 * @param userin
 * @return boolean 
 */    
   public static boolean isSquare(int[]userin){
       if(Math.sqrt(userin.length)%1!=0){
           return false;
       }
       return true;
   }
 /**
 *toMatrix takes in the 1d array from the user and converts to a 2d Array
     * @param array
     * @return userMatrix 
 */    
   public static int[][] toMatrix(int[] array){
       int n=(int) Math.sqrt(array.length);
       int count=0;
       int[][] userMatrix= new int[n][n];
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               userMatrix[i][j]=array[count];
               if(count<8){
               count++;}
           }
       }
       return userMatrix;
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userInput="";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your list of numbers separated by spaces. type d when ");
        while (scanner.hasNextInt()){
            userInput+=(Integer.toString(scanner.nextInt()))+" ";
            
        }
       
        String[] strArray = userInput.split(" ");
        
        int[] userArray= new int[strArray.length];
        for(int i=0;i<strArray.length;i++){
           userArray[i] = Integer.parseInt(strArray[i]);
        }
        if(isUnique(userArray)&& isSquare(userArray)){
            int[][]userMatrix=toMatrix(userArray);
            int n= (int) Math.sqrt(userArray.length);
            if(testHorizontal(userMatrix,n)== testVertical(userMatrix,n)&& testHorizontal(userMatrix,n)== testDiagonal(userMatrix,n)){
                System.out.print("true");
            }else{
                System.out.print("false");
                System.exit(0);
            }           
        }else{
                System.out.print("false");
                System.exit(0);            
        }

    }   
}
