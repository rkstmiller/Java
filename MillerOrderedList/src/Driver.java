/**
 * DoubleOrderedList testing area.
 * 
 * @author Ron Miller SER222 10-30
 * @version (version)
 */
public class Driver {
    public static void main(String [] args) {
        DoubleOrderedList<Integer> list = new DoubleOrderedList<>();
        
        list.add(10000);
        list.add(24);
        list.add(173);	
        list.add(16);
        list.add(42);	
        list.add(7);       
        list.add(17);	
        list.add(9);	
        list.add(1111);	
        list.add(14);	
        list.add(1);
        list.add(24);
        list.add(944);	
        list.add(16);
        list.add(0);	
        list.add(55);       
        list.add(-2);	
        list.add(9);	
        list.add(13);	
        list.add(-17);	
        list.add(1);
        System.out.println(list);
        System.out.println(list.size());
        

       list.remove(7);
       System.out.println(list.size());
       System.out.print("List.removefirst -17 : ");
       System.out.println(list.removeFirst());
       System.out.println(list.size());
       list.remove(17);
       System.out.println(list.size());
       list.removeLast();
       System.out.println(list.size());
       
       System.out.print("List.remove 14 : ");
       System.out.println(list.remove(14));
       System.out.println(list.size());
       list.removeLast();
       list.remove(173);
       list.remove(24);
       list.remove(944);
       
        System.out.println(list);
        System.out.println(list.size());
        

    }
}