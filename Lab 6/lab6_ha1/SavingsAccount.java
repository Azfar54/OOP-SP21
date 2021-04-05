package lab6_ha1;

public class SavingsAccount {
    
    public static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount(){
        annualInterestRate=0;
        savingsBalance=0;
    }
    
    public SavingsAccount(double savingsBalance){
        this.savingsBalance=savingsBalance;
        annualInterestRate=0;
    }
    public void calculateMonthlyInterest(){
        System.out.println("Current savings balance: "+savingsBalance);
        double monthlyinterest;
        monthlyinterest=(savingsBalance*annualInterestRate)/12;
        savingsBalance+=monthlyinterest;//Thus is added to the saving balance as per requirement
        System.out.println("New savings balance: "+savingsBalance);
    }
    
    public double getBalance(){
        return savingsBalance;
    }
    public void modifyInterestRate(double newInterestRate){
        annualInterestRate=newInterestRate;
    }
}