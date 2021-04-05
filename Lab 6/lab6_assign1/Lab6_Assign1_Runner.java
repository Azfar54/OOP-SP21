package lab6_assign1;
import java.util.*;
public class Lab6_Assign1_Runner {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        
        
        System.out.println("SUM: "+Calculator.sum(a,b));
        
        System.out.println("MUL: "+Calculator.mul(a,b));
        
        
        System.out.println("MOD: "+Calculator.mod(a,b));
        
        System.out.println("DIV: "+Calculator.divide(a,b));
        
        System.out.println("COS: "+Calculator.cos(a));
        System.out.println("SIN: "+Calculator.sin(a));
        System.out.println("TAN: "+Calculator.tan(a));
        
    
    }
    
}