
public class Miller_A03Q1 {

   
    
    // Contruct 4 cylinder and modify parameters using methods
    public static void main(String[] args) {
        
    Cylinder cylinder1 = new Cylinder(1,17);
    Cylinder cylinder2 = new Cylinder(3,8);
    Cylinder cylinder3 = new Cylinder(2,12);
    Cylinder cylinder4 = new Cylinder (1,14);
    System.out.println(cylinder1.toString());
    System.out.println(cylinder2.toString());
    System.out.println(cylinder3.toString());
    System.out.println(cylinder4.toString());
    cylinder1.setHeight(10);
    cylinder2.setRadius(5);
    cylinder3.setRadius(10);
    cylinder4.setHeight(20);
    System.out.println(cylinder1.toString());
    System.out.println(cylinder2.toString());
    System.out.println(cylinder3.toString());
    System.out.println(cylinder4.toString());    
    
    }
   //Cylinder class 
    public static class Cylinder{
        private double radius = 0.0;
        private double height= 0.0;
        private double area = 0.0;
        private double volume = 0.0;
        private String shape = "Cylinder";
        
        // Creates cylinder with radius and height calcs suface area and volume
        public Cylinder(double r,double h){
            radius = r;
            height = h;
            area = 2* Math.PI * r * h + 2 * Math.PI * r * r;
            volume = Math.PI * r * r * h;
        }
        // returns Volume
        public double getVolume(){
            return Math.PI * this.radius * this.radius * this.height;
        }
        //returns area
        public double getArea(){
            return 2* Math.PI * this.radius * this.height + 2 * Math.PI * this.radius * this.radius;
        }
        //returns radius
        public double getRadius(){
            return this.radius;
        }
        //returns height
        public double getHeight(){
            return this.height;
        }
        // Allows user to modify height
        public void setHeight(double h){
            this.height = h;
        }
        //Allows user to modify radius
        public void setRadius(double r){
            this.radius = r;
        }
       // Provides string of output
        public String toString(){
            return "Shape: " + this.shape +" Radius: " + this.radius + " Height: "
                    + this.height+ " Volume: " + this.getVolume() + " Area: "+ this.getArea();
            
            
        } 
    }         
} 
 

  
    
    

