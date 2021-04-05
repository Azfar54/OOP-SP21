package lab6_ha1;

public class Lab6_HA1_Runner {

    public static void main(String[] args) {
        SavingsAccount saver1=new SavingsAccount(2000);
        SavingsAccount saver2=new SavingsAccount(3000);
        saver1.modifyInterestRate(0.03);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(0.03);
        saver2.calculateMonthlyInterest();
        saver1.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(0.04);
        saver2.calculateMonthlyInterest();
    }
    }