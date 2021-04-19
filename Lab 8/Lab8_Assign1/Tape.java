package lab8_assign1;

public class Tape extends Publication {
    private int playingTime;
	
	public Tape(String q, int w, int e) {
		super(q, w);
		playingTime=e;
	}
	
	public void setPlayingtime(int e) {
		playingTime=e;
	}
	
	public int getPlayingtime() {
		return playingTime;
	}
	
	public void display() {
		super.distplay();
		System.out.println("Playing Time (In minutes): "+playingTime+"\n");
	}
}