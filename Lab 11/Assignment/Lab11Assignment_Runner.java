package lab.pkg11.assignment;

public class Lab11Assignment_Runner {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
            shapes[0] = new Rectangle(2.2, 3.8);
            shapes[1] = new Circle(3.6);
            shapes[2] = new Triangle(3.3,4.1);
            
            
            double areas[] = CalculateAreas.build_array(shapes);
            for(double area: areas) {  
                System.out.println(area);
            }
        }
    }