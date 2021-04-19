package lab8_assign1;

public class Publication {
    protected String title;
	protected int price;
	
	public Publication(String q, int w) {
		title=q;
		price=w;
	}
	
	public void setTitle(String q) {
		title=q;
	}
	
	public void setPrice(int w) {
		price=w;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void distplay() {
		System.out.println("Title: "+title+"\nPrice: "+price);
	}
}