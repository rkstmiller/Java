package algo;

public class isUnique {
	// Checks every character against all other characters runtime O(n^2)
	// checks a string if all characters and unique
	// if all unique prints and returns true else prints and returns false
	static boolean isUnique1(String str){
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					System.out.println("false: "+str.charAt(j));
					return false;
				}
				
			}
		}
		System.out.println("true");
		return true;
	}
	//This is assuming ASII characters are used and is O(n)
	// first checks string for length over 128(max unique ASCII char)
	// This converts character to ASCII int and stores at that index
	// for each character it looks up the index of the array for existence
	// if exists it is a duplicate
	static boolean isUnique2(String str){
		if(str.length()>128){
			System.out.println("false: too many characters to be Unique");
			return false;
		}
		boolean[] duplicate = new boolean[128];
		for(int i=0;i<str.length();i++){
			int index = str.charAt(i);
			if(duplicate[index]==true){
				System.out.println("false: "+str.charAt(i));
				return false;
			}else{
				duplicate[index]=true;
			}
		}
		System.out.print("true");
		return true;
		
	}

	public static void main(String[] args) {
		isUnique1("RonaldMiller");// false l
		isUnique1("ronaldMixer");// false r
		isUnique2("RonaldMiller");//false l
		isUnique2("ronaldMixer");//false r
		isUnique1("RonaldMixer");// true
		isUnique2("RonaldMillsadhfkjshdjsdhfklajdhfjhdslfhasljdfhlasjdgfajsdgflhasgdfljagsdahsldfjaslgdagkjdfhaskdjfhakjsdgjsdgfagsdfjlhasdkjflkasjdflkajsdflkdsferjshdfjhgsjdgfadshgfagsdfuewyriwueyoiweuryuweyorw");
		isUnique2("JonaldMixer");
	}

}
