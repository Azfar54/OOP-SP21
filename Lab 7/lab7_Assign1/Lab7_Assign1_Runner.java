package lab7_assign1;

public class Lab7_Assign1_Runner {

    public static void main(String[] args) {
        Pizza p1=new Pizza("Medium",2,3,1);
        Pizza p2=new Pizza("Large",2,1,0);
        PizzaOrder o1=new PizzaOrder();
        o1.setNumofpizzas(2);
        o1.setPiz1(p1);
        o1.setPiz2(p2);
        p1.getDescription();
        p2.getDescription();
        System.out.println("Total Cost of Order:$"+o1.calcTotal());
        
    }
    
}
