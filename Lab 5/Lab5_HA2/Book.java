package lab5_ha2;

public class Book {
    private String name;
    private String[] ChapterName;
    public Book(){
        
    }
    public Book(String name,String[] C)
    {
        this.name=name;
        this.ChapterName=C;
    }
    
    
    public Book(String n){
        this.name=n;
    }

   public boolean CompareBooks(Book b){
       if( this.name==b.name){
           return true;}
           else
           return false;
       }
   public Book CompareChapterNames(Book b){
       if(b.ChapterName.length>this.ChapterName.length)
           return b;
       
       return this;
   }

    public void display(){
        
        System.out.println("Book name: "+getName()+"\nChapter Names: ");
        for(int i=0;i<this.getChapterName().length;i++)
        {
            System.out.println(this.getChapterName()[i]);
        }
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getChapterName() {
        return ChapterName;
    }
    public void setChapterName(String[] ChapterName){
        this.ChapterName=ChapterName;
    } 
    }
    