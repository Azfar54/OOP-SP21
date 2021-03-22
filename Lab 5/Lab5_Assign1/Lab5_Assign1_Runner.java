package lab5_assign1;

public class Lab5_Assign1_Runner {

    public static void main(String[] args) {
    Fraction f1 = new Fraction();
		System.out.println("Ratio of Fraction is equal to:" +f1.getRatio());
		
		Fraction f2 = new Fraction(48,24);
		System.out.println("Ratio of Fraction 1 is equal to the ratio of Fraction 2?\n"+f2.Equals(f1));
    }
    
}
