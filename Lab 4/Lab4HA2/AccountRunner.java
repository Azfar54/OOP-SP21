package lab4ha2;

public class AccountRunner {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(65000);
        acc.withdrawCash(8000);
        acc.depositCash(3500);

       double balance =acc.getBalance();
        acc.setAccountNumber(456789321);
        acc.getAccountNumber();
        acc.display();
        
        Account acc1 = new Account(456258746, 49000);
        acc1.setBalance(70000);
        acc1.withdrawCash(12500);
        acc1.depositCash(6000);        
        acc1.getBalance();
        acc1.display();
           
    }

}
