package lab5_ha1;




public class Lab5_HA1_Runner {

    public static void main(String[] args) {
        
        
        Distance A=new Distance();
        Distance B=new Distance(16,1);
        Distance C=B.Add(A);
        
        
        C.show();
    }
}