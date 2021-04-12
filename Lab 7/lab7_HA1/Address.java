package lab7_ha1;

public class Address {
    private int street;
    private int house;
    private String city;
    private int code;
    
    public Address(int street, int house, String city, int code){
        this.street=street;
        this.house=house;
        this.city=city;
        this.code=code;
    }
    
    public int getStreet(){
        return street;
    }
    
    public void setStreet(int street){
        this.street=street;
    }
    
    public int getHouse(){
        return house;
    }
    
    public void setHouse(int street){
        this.house=house;
    }
     
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city=city;
    }
        public int getCode(){
        return code;
    }
    
    public void setCode(int code){
        this.code=code;
    
}
}