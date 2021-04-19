package lab8_act2;

public class Regular extends Employee {
    private int basicPay;
    public Regular(String name, String phone, String address, int allowance, int basicPay)
{
super(name, phone, address, allowance);
this.basicPay = basicPay;
}
public void Display(){
System.out.println("Name: " + name + "\tPhone Number: " + phone +"\t    Address: " + address
+ "\t    Allowance: " + allowance + "\tBasic Pay: " + basicPay); }
}