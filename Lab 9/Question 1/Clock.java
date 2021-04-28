package lab9_assign1;

public class Clock {
    String hr;
    String min;
    String sec;
    
    public Clock (String hr, String min, String sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    
    public void display(){
        System.out.println(this.hr+":"+this.min+":"+this.sec);
    }
}