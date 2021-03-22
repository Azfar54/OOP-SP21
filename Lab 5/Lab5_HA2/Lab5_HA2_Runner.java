package lab5_ha2;

public class Lab5_HA2_Runner {
    
    public static void main(String[] args) {
        
        
        String[] A={"kg","pik","qtw","pot","rom"};
        String name="Fancy";
        
        Book a=new Book();
        
        a.setName(name);        
        a.setChapterName(A);

        String[] B={"ga","gb","gc","yd","pe"};
        name="super";
        Book b=new Book();
        
        b.setName(name);
        b.setChapterName(A);
        
        if(a.CompareBooks(b))
        {
            System.out.println("Books Names are equal\n");
        }
        else
        System.out.println("Books Names are NOT equal\n");
        
       
        System.out.println("Book with more Chapters is:"); 
        Book C=b.CompareChapterNames(a);
        
        C.display();        
}    
    }