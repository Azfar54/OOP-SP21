package lab8_assign2;

public class Computer {
       protected int wordsize;
	protected int memorysize;
	protected int storagesize;
	protected double speed;
	
	public Computer() {
		wordsize=96;
		memorysize=3800;
		storagesize=119500;
		speed= 3.0*1100;
	}
	
	public Computer(int wordsize, int memorysize, int storagesize, double speed) {
		this.wordsize=wordsize;
		this.memorysize=memorysize;
		this.storagesize=storagesize;
		this.speed=speed;
	}
	
	public void display() {
		System.out.println("Word Size (bits): "+wordsize+"\nMemory Size (MBs): "+memorysize+"\nStorage Size (MBs): "+
				storagesize+"\nSpeed (Mhz): "+speed);
	}
}