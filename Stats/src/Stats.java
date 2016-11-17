/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
import java.text.DecimalFormat;
import java.util.*;
public class Stats {

    //main instructions
    public static void main(String[] args) {
        //initialize variables
        int n;
        double mean,stDev;
        // create new scanner object to take input from user
        Scanner scan= new Scanner(System.in);
        //prompt user
        System.out.println("Please enter the number of values you would like to input: ");
        //get input and store
        n=scan.nextInt();
        //initialize array using input from user
        double[] userArr= new double[n];
        //loop through inputs adding to array
        for(int i =0;i<userArr.length;i++){
            System.out.println("Please enter value "+ Integer.toString(i+1)+" : ");
            userArr[i]= scan.nextDouble();
            
        }
        //run helper functions
        mean=mean(userArr);
        stDev=stDev(mean(userArr),userArr);
        // print results to console
        System.out.print(" The mean is: ");
        System.out.printf("%.2f", mean);
        System.out.println("");
        System.out.print(" The standard Deviation is: ");
        System.out.printf("%.2f", stDev);

        
    }
    // helper function to take in the array and output the mean
    static double mean(double[] userIn){
        double sum=0;
        double mean;
        for(int i=0; i<userIn.length;i++){
            sum+=userIn[i];
        }
        mean=sum/userIn.length;
        return mean;
    } 
    //helper function to input the array and the computered mean and then cal st Deviation
    static double stDev(double avg, double[] userIn){
        double sumDelta=0;
        double stDev;
        for( int j=0;j<userIn.length;j++){
            sumDelta+= (userIn[j]-avg) * (userIn[j]-avg);
            
        }
        stDev=Math.sqrt(sumDelta/(userIn.length-1));
        return stDev;
    }

}
