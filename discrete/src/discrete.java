/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
public class discrete {
    int m;
    int n;
    int answer;
    
    public int fun(int m, int n){
        
        if (m==0){
            answer =  2*n;
        }else if(m>=1 && n==0){
            answer = 0;
        }else if(m>=1 && n==1){
            answer = 2;
        }else if(m>=1 && n>=2){
            answer = fun(m-1,fun(m,n-1));
        
       
    }
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        discrete attempt = new discrete();
        
       System.out.print( attempt.fun(3,3));
    }
    
        
        
    }

