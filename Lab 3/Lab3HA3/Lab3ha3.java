package lab3ha3;

public class Lab3ha3 {
    private int inches;
    private int feet;
    public Lab3ha3(){
        feet=8;
        inches=4;
    }
    public Lab3ha3(int inches, int feet){
        this.feet=feet;
        this.inches=inches;
    }
    public void display(){
        System.out.println(feet+" feet\n"+inches+" inches");
    }
    
}
