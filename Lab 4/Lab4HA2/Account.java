package lab4ha2;


public class Account {
    private double balance;
    private int accountnumber;
    public Account(){
        balance=68000;
        accountnumber=123654789;
    }
    public Account(int Account, double bal){
        accountnumber=Account;
        balance=bal;
    }
    public void withdrawCash(double amountleft){
        setBalance(getBalance() - amountleft);
        
    }
    public void depositCash(double amountadd){
        setBalance(getBalance() + amountadd);
        
    }
    public void display(){
        System.out.println("Account number=" + getAccountNumber() + "  Balance= "+ getBalance());
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public int getAccountNumber() {
        return accountnumber;
    }

    
    public void setAccountNumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }
}