package lab7_ha1;

public class Lab7_HA1_Runner {

    public static void main(String[] args) {
        Address address=new Address(12,303,"Islamabad",501);
        Person person=new Person(address);
        System.out.println("Street No. is: "+person.getAddress().getStreet());
        System.out.println("House No. is: "+person.getAddress().getHouse());
        System.out.println("City is: "+person.getAddress().getCity());
        System.out.println("City code is: "+person.getAddress().getCode());
    }
    
}