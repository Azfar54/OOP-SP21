package lab.pkg11.assignment;

public class Triangle implements Shape{
    double height;
    double base;
    
    public Triangle(double height,double base){
    this.base=base;
    this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
     public double area(){
         return (0.5 * base * height);
     }

}