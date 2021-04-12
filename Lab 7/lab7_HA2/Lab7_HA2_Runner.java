package lab7_ha2;

public class Lab7_HA2_Runner {

    public static void main(String[] args) {
        Address address=new Address(61,423,"Canberra",123);
        Person person=new Person(address);
        Book book=new Book(person,"Tale of the Tail","William");
        System.out.println("Book name is: "+book.getBook1());
        System.out.println("Publisher is: "+book.getBook2());
        book.getAuthor().getAddress().setStreet(41);
        System.out.println("Street No. is: : "+person.getAddress().getStreet());
        book.getAuthor().getAddress().setHouse(234);
        System.out.println("House No. is: "+person.getAddress().getHouse());
        book.getAuthor().getAddress().setCity("Melbourne");
        System.out.println("City is: "+person.getAddress().getCity());
        book.getAuthor().getAddress().setCode(741);
        System.out.println("City Code is: "+person.getAddress().getCode());
        
    }    
}