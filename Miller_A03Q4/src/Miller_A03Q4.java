import java.util.*;

public class Miller_A03Q4 {
    

    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(4);
        Cone cone1 = new Cone(3,7);
        System.out.println(cone1.toString());
        System.out.println(sphere1.toString());
        cone1.setHeight(10);
        sphere1.setRadius(3);
        System.out.println(cone1.toString());
        System.out.println(sphere1.toString());
        
        
        
    }



// parent Roundhape
    public static class RoundShape{
         double area;
         double volume;
         double radius;
         String shape;
         double height;
        //            
        //constructor
        public RoundShape(double r){
        
          radius = r;
           
        }
        // set radius method
       public  void setRadius(double r){
           radius = r;
       }   
       // get area method
       public double getArea(){
           return area;
       }
       // get volume
       public double getVolume(){
           return volume;
           
       
    }
       //toString
         public String toString(){
            return "Shape: " + shape +" Radius: " + radius + " Height: "
                    + height+ " Volume: " + this.getVolume() + " Area: "+ this.getArea();
            
            
        }   
    }   
       // sphere is-a from roundshape
    public static class Sphere extends RoundShape{
        //constructor
        public Sphere(double r){
            super(r);
            radius = r;
            shape = "sphere";
            
              
        }
        //get area
        public double getArea(){
                   
               area = 4 * Math.PI * radius * radius;
                return area;
       }
       // get volume
       public double getVolume(){
           
           volume = 4 * Math.PI * (radius * radius * radius)/3;
           return volume;
    }
    }
    //cone class is-a from roundshape
    public static class Cone extends RoundShape{
        
        // cone with radius and height
        public Cone(double r, double h){
            super(r);
            radius = r;
            height = h;
            shape = "cone";
            
            
        }
        //set height
        public void setHeight(double h){
            height = h;
        }
        // get area
        public double getArea(){
                   
               area = Math.PI * radius * (radius + Math.sqrt( height * height + radius * radius));
                return area;
       }
       // get volume
       public double getVolume(){
           
           volume = Math.PI * radius * radius * (height/3);
           return volume;
    }
}


}


