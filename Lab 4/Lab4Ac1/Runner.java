package lab4ac1;

public class Runner {
    
    public static void main(String[] args) {
        Circle c1 = new Circle();
c1.setRadius(5);
System.out.println("circumference of Circle 1 is "  );
c1.area( );
int r = c1.getRadius();
Circle c2 = new Circle(r);
c2.setRadius(8);
System.out.println("circumference of Circle 2 is "  );
c2.area( );
    }    
}