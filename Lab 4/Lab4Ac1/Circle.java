package lab4ac1;

public class Circle {
private int radius;
public Circle()
{
radius=7;
}
public Circle(int r)
{
radius=r;
}
public void setRadius(int r)
{
radius=r;
}
public int getRadius(){
return radius;
}
public void display()
{
System.out.println("radius = "+radius);
}
public void area(){
double a=3.14*radius*radius;
System.out.println("Circumfrance = "+a);
}}
