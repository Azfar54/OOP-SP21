package lab.pkg11.assignment;

public class Rectangle implements Shape{
    double length;
    double width;
    
     public Rectangle(double length,double width){
         this.length=length;
         this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
     public double area(){
     return (length * width);
     }



}
