/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
public class RetSum {
	public static int retSum(int number){

    int sum=0;

    int temp=0;

while(number>0){

    

    temp= number % 10;
    number = number/10;
    System.out.println(number);

    sum+=temp;

   }
	return sum;
}
  public static void main(String[] args) {
    
    System.out.println(retSum(2532));
       int temp = 180;

     while ( temp != 80 )
{
  if ( temp > 90 )
  {
    System.out.print( "This porridge is too hot! " );
    // cool down
    temp=temp-(temp>150 ? 100:20);
  } // end if
  else
  {
    if ( temp < 70 )
    {
      System.out.print("This porridge is too cold! ");
      // warm up
      temp = temp + (temp < 50 ? 30 : 20);
    } // end if
  } // end else
} // end while

     if ( temp == 80 )
  System.out.println( "This porridge is just right!" );
  }

 
    
}
