package assign1;

public class Runner {
    public static void main(String[] args) {
    HotDogStand a1 = new HotDogStand(1, 2);
		a1.justSold();
		a1.justSold();
		
		a1.display();
		
		HotDogStand a2 = new HotDogStand(2, 0);
		a2.justSold();
		a2.justSold();
		a2.justSold();
		a2.display();
		
		HotDogStand a3 = new HotDogStand(3, 6);
		a3.justSold();		
		a3.display();

    }
    
}
