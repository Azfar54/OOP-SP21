package lab8_act1;

public class Person {    
    protected String name ; 
protected String id ;
protected int phone ;
public Person() {
name = "John Kip" ;
id = "sp20bcs039" ;
phone = 75194 ;
}
public Person(String a , String b , int c) {
name = a ;
id = b ;
phone = c ;
}
public void setName(String a){
name = a ;
}
public void setId(String j){
id = j ;
}
public void setPhone(int a) {
phone = a ;
}
public String getName() {
return name ;
}
public String getid() {
return id ;
}
public int getPhone() {
return phone ;
}
public void display( ) {
System.out.println("Name : " + name + "\nID : " + id + "\nPhone : " + phone ) ;
}
}