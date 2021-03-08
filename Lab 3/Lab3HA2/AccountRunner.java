package lab3ha2;

public class AccountRunner {

    public static void main(String[] args) {
        Account acc=new Account();
        acc.withdrawCash(500);
        acc.depositCash(2000);
        acc.display();
        Account acc1=new Account(1697725412,42000.00);
        acc.withdrawCash(5000);
        acc.depositCash(2000);
        acc.display();
    }
    
}
