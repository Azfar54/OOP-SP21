package assign1;

public class HotDogStand { 
   
	private int ID, Sold;
	
	public HotDogStand(int x, int y) {
		ID=x;
		Sold=y;
	}
	
	public void justSold() {
		Sold ++;
	}
	
	public int getSold() {
		return Sold;
	}
	
	public int getID() {
		return ID;
	}
	
	public void display() {
		System.out.println("The Hot Dog Stand of ID "+ID+" sold "+Sold+" hotdogs today.");
	}
}