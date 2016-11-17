
public class Miller_A03Q2 {

    


   
    public static class Die
    {
        
        private final int MAX = 6;
        
        private int faceValue;
        
        public Die()
        {
            faceValue = 1;
        }
        public int roll()
        {
            faceValue = (int)(Math.random() * MAX) + 1;
            
            return faceValue;
        }
        
        public void setFaceValue(int value)
        {
            if(value > 0 && value <= MAX)
                faceValue = value;
        }
        
        public int getFaceValue()
        {
            return faceValue;
        }
        
        public String toString()
        {
            String result = Integer.toString(faceValue);
            
            return result;
        }
    }    
    // Class with variables
    public static class PairOfDice
    {      Die die1 = new Die();
           Die die2 = new Die();
           int die1Val;
           int die2Val;
           int dieSum ;
     // contructor with intialized values. Although initialized values not necessary      
      public PairOfDice(){
        die1Val = 0;
        die2Val = 0;
        dieSum = 0;
        
          
      }
      // Set new value Die 1
      public void setDie1Value(){
           die1Val = die1.roll();
      }
      
       //Set new Value Die 2     
      public void setDie2Value(){
          die2Val = die2.roll();
      }
     //retrieves value of die   
     public int getDie1Value(){
         return die1Val;
     }
     // retrieves die 2
     public int getDie2Value(){
         return die2Val;
     }
     // roll die which rolls and sums up die.I elected to include in one method
     // I have also commented in the way make 2 methods if that was a requirement
     public int rollDie(){
         setDie1Value();
         setDie2Value();
         dieSum = getDie1Value()+getDie2Value();
         return dieSum;
         
     }
     // below is the way to separate methods
 /** public void rollDie(){
      * setDie1Value();
      * setDie2Value();
      * }
     *public int dieSum(){
      * dieSum = getDie1Value() + getDie2Value();
      * return dieSum;
      * } */
     
    }

    public static void main(String[] args) {
        final int ROLLS = 500;
        int count = 0;
        
        PairOfDice POD = new PairOfDice();
        
        
        for(int roll = 1; roll <= ROLLS; roll++)
        {       
                POD.rollDie();
                if(POD.rollDie() == 2 ){
                count += 1;
                
        }
        }
        
        System.out.println("Number of rolls: " + ROLLS);
        System.out.println("Number of snake eyes: " + count);
        System.out.println("Ratio: " + (double)count / ROLLS);
        
    }

}
