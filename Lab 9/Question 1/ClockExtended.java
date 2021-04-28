package lab9_assign1;

public class ClockExtended extends Clock{
    
    public ClockExtended(String hr, String min, String sec){
        super(hr,min,sec);
    }
    
    @Override
    public void display(){
    
        System.out.println("24 hour format is: ");
        super.display();
        System.out.println("12 hour format is: ");
        int hr1=(int)hr.charAt(0)-'0';
        int hr2=(int)hr.charAt(0)-'0';
        int total_hr=hr1*10+hr2;
        String pk;
        if(total_hr<12){
            pk=" AM";
        }
            else
            pk=" PM";
        
        total_hr %=12;
        
        if(total_hr==0){
            System.out.print("12"+":"+min+":"+sec);
        }
            else{
                    System.out.println(total_hr);
                    System.out.println(":"+min+":"+sec);
                    }
        System.out.print(pk);
        }
    }