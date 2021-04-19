package lab8_assign2;

public class Laptop extends Computer {
    private double length;
	private double width;
	private double height;
	private double weight;
	
	public Laptop() {
		super();
		length=16.8;
		width=9.31;
		height=7.5;
		weight=1600;
	}
	
	public Laptop(int wordsize, int memorysize, int storagesize, double speed, double length,double width,double height,double weight ) {
		super(wordsize, memorysize, storagesize, speed);
		this.length=length;
		this.width=width;
		this.height=height;
		this.weight=weight;
	}
	
	public void display() {
		super.display();
		System.out.println("Length (inches): "+length+"\nWidth (inches): "+width+"\nHeight (inches): "+
				height+"\nWSeight (Grams): "+weight+"\n");
	}
}