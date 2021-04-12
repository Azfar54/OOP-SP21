package lab7_ha3;

public class Lab7_HA3_Runner {

    public static void main(String[] args) {
        Point p1=new Point(2,3);
        Point p2=new Point(3,4);
        Line l1=new Line(p2,p1);
        p1.display();
        p2.display();
        System.out.println("Length of line 1 is:"+l1.calculate()+"\n");
        
        Point p3=new Point(4,6);
        Point p4=new Point(3,2);
        Line l2=new Line(p4,p3);
        p3.display();
        p4.display();
        System.out.println("Length of line 2 is:"+l2.calculate());
    }
    
}
