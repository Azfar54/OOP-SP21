package lab3ha1;

public class Circle {
    public double radius, pi;
    public Circle(){
        radius=7.9;
        pi=3.14;
    }
    public Circle(double r, double Pi){
        radius=r;
        pi=Pi;
    }
public double calculateCircumference(){
    return(2*(pi*radius));
}
}
