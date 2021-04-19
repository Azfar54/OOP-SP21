package lab8_assign1;

public class Book extends Publication {
    private int pageCount;
	
	public Book(String q, int w, int e) {
		super(q, w);
		pageCount= e;
	}
	
	public void setPageCount(int e) {
		pageCount=e;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void display() {
		super.distplay();
		System.out.println("Page Count: "+pageCount+"\n");
	}
}