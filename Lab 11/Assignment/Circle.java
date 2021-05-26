package lab.pkg11.assignment;

public class Circle implements Shape {
    double radius;
    
    public Circle(double radius){
    this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
     public double area(){
         return (Math.PI * radius * radius);
     }

}
