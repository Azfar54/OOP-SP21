package lab5_Act2;

public class Lab5_Act2_Runner {

    public static void main(String[] args) {
Complex C1 = new Complex(11, 3); 
Complex C2 = new Complex(9, 12); 
Complex C3 = new Complex(); 
C3 = C1.Add(C2); 
C3.Show();
}
}