package lab7_ha2;

public class Book {
    private Person author;
    private String bookname;
    private String publisher;
    
    public Book(Person author, String bookname,String publisher){
        this.author=author;
        this.bookname=bookname;
        this.publisher=publisher;
    }
    
    public Person getBook(){
        return author;
    }
    
    public String getBook1(){
        return bookname;
        
    }
    
    public String getBook2(){
        return publisher;
    }
    
    public void setBook(Person author, String bookname,String publisher){
        this.author=author;
        this.bookname=bookname;
        this.publisher=publisher;
    }
    public Person getAuthor(){
        return author;
    }
    public void setAuthor(Person author){
        this.author=author;
    }
    
    public String getBookName(){
        return bookname;
    }
    public void setBookName(String bookname){
         this.bookname=bookname;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
}