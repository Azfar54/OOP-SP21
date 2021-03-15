package lab4ac3;

public class Point {
    private int x;
private int y;
public Point(){
x=0;
y=0;
}
public Point(int a, int b){
x=a;
y=b;
}
public void setX(int a){
x=a;
}
public void setY(int b){
y=b;
}
public int getX(){
return x;
}
public int getY(){
return y;
}
public void display(){
System.out.println("x coordinate = "+getX()+"\ny coordinate = "+getY());
}
public void move(int a , int b){
setX(getX() + a);
setY(getY() + b);
System.out.println("x coordinate after moving = "+getX()+"\ny coordinate after moving = "+getY());
}}
