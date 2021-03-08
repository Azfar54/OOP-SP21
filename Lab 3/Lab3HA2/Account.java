package lab3ha2;

public class Account {
    private double balance;
    private int AccountNumber;
    public Account(){
        balance=35000;
        AccountNumber=1098765432;
    }
    public Account(int Account, double bal){
        AccountNumber=Account;
        balance=bal;
    }
public void withdrawCash(double amountleft){
    balance=balance-amountleft;
}
public void depositCash(double amountadd){
    balance=balance+amountadd;
}
public void display(){
    System.out.println("Account number="+AccountNumber+"\nBalance="+balance);
}
}
