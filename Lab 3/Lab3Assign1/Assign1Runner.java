package lab3assign1;

public class Assign1Runner {
    
    public static void main(String[] args) {
        Lab3assign1 m=new Lab3assign1();
        System.out.println("The sum is: "+m.CalculateSum());
        
        Lab3assign1 n=new Lab3assign1(55,74,67);
        System.out.println("The sum is: "+n.CalculateSum());
        
    }
    
}
