import java.util.*;



public class Miller_A03Q3 {
    
    public static void main(String[] args) {
        
        
        Histogram histogram = new Histogram();
        do{
            histogram.addUserNum();
            
        }while(histogram.userIn > 0 && histogram.userIn < 11);
            
            
            System.out.println(histogram.toString());
          


    
}
    
    
// Histogram
   public static class Histogram{
	int[] userList = new int[1];
	private int count;
	int userIn;
        String histo;
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
		
		if(count <= userList.length){
			
			
                        if(userIn > 0 && userIn <= 10){
                        increaseSize();   
			userList[count] = userIn;
			count ++;
                        }else{
                        System.out.println("Sorry, Your number was either less than 0 or greater than 10");
                        System.out.println(" An entry <0 or entry >10 exits the program");
                        }
		}
        }
	// increase size of array at entry
	private void increaseSize(){
		int [] temp = new int [userList.length +1];

		for(int userNum = 0; userNum < userList.length; userNum ++){
			temp[userNum] = userList[userNum];
		}
			userList = temp;
	}
	// print the histogram
        @Override
	public String toString(){
            
            for(int i = 1; i<11; i++){
                histo += "\n" + i+ "|" + "\t";
                for(int j = 0; j < userList.length;j++){
                    if(userList[j] == i){
                    histo +="#";
                    }
                    
                }
            }
                    
                            

		
               
                return histo;
	}
      
    }
}
