package time;

public class Time {
int hours;
int minutes;
int seconds;

public Time(){
    
}   
Time(int H, int M, int S){
    hours = H;
    minutes = M;
    seconds = S;
    
}
public void display(){
    System.out.println("hours:" + hours);
    System.out.println("minutes:" + minutes);
    System.out.println("seconds:" + seconds);
}
public void validity(){
    
    if(minutes > 60){
        minutes -= 60;
        hours++;
    }
    if(seconds > 60){
        
        seconds -= 60;
        minutes++;
}}}
