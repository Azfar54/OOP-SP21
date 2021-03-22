package lab5_assign1;

public class Fraction {
    private int ratio;
	private int num;
	private int deno;
	
	public Fraction() {
		num = 12;
		deno = 6;
		ratio = num/deno;
	}
	
	public Fraction(int x, int y) {
		num = x;
		deno = y;
		ratio = num/deno;
	}
	
	public void setNuem(int x) {
		num = x;
	}
	
	public void setDeno(int y) {
		deno = y;
	}
	
	public int getRatio() {
		return ratio;
	}
	
	public boolean Equals(Fraction f) {
		if (this.ratio==f.ratio) {
			return true;
		}
		else return false;
	}
}