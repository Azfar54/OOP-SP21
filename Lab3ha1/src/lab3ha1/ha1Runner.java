package lab3ha1;

public class ha1Runner {

    public static void main(String[] args) {
        Circle circle1=new Circle();
        System.out.println(circle1.calculateCircumference());
        
        Circle circle2=new Circle(5.68,7.96);
        System.out.println(circle2.calculateCircumference());
    }
    
}
