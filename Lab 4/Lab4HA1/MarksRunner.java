
package lab4ha1;


public class MarksRunner {

    
    public static void main(String[] args) {
     Marks m=new Marks();
     m.setphysics(83);
     m.setchemistry(79);
     m.setmaths(68);   
     System.out.println("physics marks: "+m.getphysics());
     System.out.println("chemistry marks: "+m.getchemistry());
     System.out.println("maths marks: "+m.getmaths());
     int sum = m.CalculateSum();
     System.out.println("The sum of these marks are = " + sum);
     System.out.println("The percentage of these marks are = "+m.CalculatePercentage(sum));
    }
    
}
