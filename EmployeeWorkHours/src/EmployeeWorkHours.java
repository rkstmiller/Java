/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
*/
import java.util.*;
public class EmployeeWorkHours {
    // takes in number of employees and number of days worked
    //this outputs a sorted 2 dimensional array by  
    private static int [][] employWeekdays(int employees, int days ){
        int[][]companyHours = new int[employees][days];
        for(int i=0;i<employees;i++){
            companyHours[i]=employeeTime(days);
            
        }
        for(int j=0;j<companyHours.length;j++){
        employSort(companyHours);
        }
        return companyHours;
//        
    }
    // This takes a two dimentional array that has a sum of hours worked
    // as the last index in the sub arrays and bubbles the larger sums
    //toward the largest index in the array
        private static int [][] employSort(int [][] Sort ){
        
        for(int i= 0;i<Sort.length-1;i++){
            if(Sort[i][Sort[i].length-1] > Sort[i+1][Sort[i].length-1]){

                int[] temp = Sort[i];
                Sort[i]=Sort[i+1];
                Sort[i+1]=temp;
                
            }
            
        }

        return Sort;
//        
    }
    // this methods takes the number of days worked and prompts the user
   //for their employee number as well as hours worked per day
   // it sums up all of the hours worked and stores that as the last index of the array
   //it stores employee number as first index of the array
    private static  int [] employeeTime(int daysWorked){
        int sum=0;
        Scanner scan = new Scanner(System.in);
        int [] userWeek= new int[daysWorked+2];
        System.out.print("Please enter your employee number: ");
        userWeek[0]=scan.nextInt();
        
        for(int i=1;i<daysWorked+1;i++){
            System.out.print("Please enter your hours for day "+i+" :");
            int dayHours=scan.nextInt();
            userWeek[i]=dayHours;
            sum +=dayHours;
            
        }
        userWeek[userWeek.length-1]=sum;
        return userWeek;
        }
    // this takes in an array and prints the last index of the sub array
    // it prints from the last index of the array to the first
    private static void toString(int[][] allHours){
        for(int i=allHours.length-1;i>0;i--){
            System.out.println("\n Employee "+allHours[i][0]+" worked "+allHours[i][allHours[i].length-1]+" hours this week.");
            
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        toString(employWeekdays(3,3));
    }
    
    
}
