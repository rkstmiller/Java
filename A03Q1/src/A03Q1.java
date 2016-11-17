
public class A03Q1 {

    
    public void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(1,2);
        System.out.print(cylinder1.getRadius());
        
    }
    public class Cylinder {
    private double radius;
    private double height;
    public Cylinder(double r, double h) 
    {radius = r; height = h;}
    public double getRadius() 
    {return radius;}
    public double getHeight() 
    {return height;}
    public double getVolume() 
    {return capArea() * height;}
    public double getSurfaceArea() 
    {return 2 * capArea() + sideArea();}
    private double capArea() 
    {return Math.PI * radius * radius;}
    private double sideArea() 
    {return 2.0 * Math.PI * radius * height;}
    public void widen(double factor) 
    {radius *= factor;}
    public void lengthen(double factor) 
    {height *= factor;}
    double fuck = getVolume();
    
}
}
