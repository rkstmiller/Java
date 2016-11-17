
public class Miller_A02Q6 {
    

    public static void main(String[] args) {
    // top half of diamond   
    // 1 to 9 by 2
    for (int i = 1; i <=9; i += 2) {
     // center justify stars
      for (int j = 0; j < 9 - i/2; j++)
        System.out.print(" ");
      // stars
      for (int j = 0; j <i; j++)
        System.out.print("*");

      System.out.print("\n");
    }
    // bottom half of diamond same as above but opposite order
    for (int i = 9; i >=1; i -= 2) {
      for (int j = 0; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j <i; j++)
        System.out.print("*");

      System.out.print("\n");
    }
  }
}
    
    

