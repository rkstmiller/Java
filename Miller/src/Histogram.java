
import java.util.Scanner;


   public class Histogram{
	int[] userList = new int[1];
	private int count;
	int userIn;
        
        
	// constructor
     
	public Histogram(){
		int[] userList = new int[1];
		count = 0;
                
	}
	// Add number to array
	public void addUserNum(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value to plot: "); 
		userIn = scan.nextInt();
		
		if(count == userList.length){
			increaseSize();
			
			userList[count] = userIn;
			count ++;
		}
        }
	// increase size of array at entry
	private void increaseSize(){
		int [] temp = new  int [userList.length *2];

		for(int userNum = 0; userNum < userList.length; userNum ++){
			temp[userNum] = userList[userNum];
		}
			userList = temp;
	}
	// print the histogram
        @Override
	public String toString(){
		for( int i = 1; i <= userList.length; i++){
			System.out.print(i + " | " + "\t");
			
			for(int j = 0;j < userList[i]; j++){
				if( userList[i] == i){
					System.out.print("# ");
					System.out.print(" ");
				}
			}
		}
                return "done";
	}
      
    }
}
