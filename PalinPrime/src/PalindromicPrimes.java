/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ron Miller
 */

import java.util.*;
 

public class PalindromicPrimes {
    // print all palindromic prime numbers at a maximum of 10 per line
    public static void printPalin(int num){
        int count=0;
            for(int i=0;i<num*num*num;i++){
                if(isPrime(i) && isPalin(i)){
                    count++;
                    if(count==num+1){
                        break;
                    }
                    if(count%10==0){
                        System.out.print(i+"\n");  
                    }else{
                        System.out.print(i+"\t");
                    }
                }
        }
    }

    
    
// This method checks to see if number is prime and return boolean    
    private static boolean isPrime(int num) {
        if (num % 2 == 0 && num !=2){
            return false;
        }
        if(num==2){
            return true;
        }
        
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
  } 
// This Method tests to see if a number is a palindrome and returns boolean 
    public static boolean isPalin(int num){
        String numString= Integer.toString(num);
        char[] numArr=new char[numString.length()];
        char[] revArr= new char[numString.length()];
        int stringLeng=numString.length();
        for(int i=0;i<numString.length();i++){
            numArr[i]=numString.charAt(i);
//            System.out.println("numArr"+numArr[i]); for testing
        }
        for(int i=0;i<numString.length();i++){
            stringLeng--;
            revArr[i]= numString.charAt(stringLeng);
//            System.out.println("revArr"+revArr[i]); for testing
        }

        if(Arrays.equals(revArr,numArr)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
//        System.out.println(isPrime(111)); for testing
//        System.out.println(isPalin(111)); for testing
        printPalin(10);// test for n=10
        printPalin(100);//test for n=100
        
    }
    
}
