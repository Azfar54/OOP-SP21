package ac3runner;

public class Lab3ac3 {
    private int x;
private int y;
public Lab3ac3(){
x=1;
y=2;
}
public Lab3ac3(int a, int b){
x=a;
y=b;
}
public void setX(int a){
x=a;
}
public void setY(int b){
y=b;
}
public void display(){
System.out.println("x coordinate = "+x+" y coordinate = "+y);
}
public void movePoint(int a , int b){
x=x+a;
y=y+b;
System.out.println("x coordinate after moving = "+x+" y coordinate after moving = "+y);
}}
