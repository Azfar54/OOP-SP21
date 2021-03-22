package lab5_ha1;

public class Distance {
    private int feet;
    private int inches;
    
    public Distance(){
        feet=10;
        inches=5;
    }
     public Distance(int f,int i)
     {
         feet=f;
         inches=i;
     }
       
     
     public Distance Add(Distance D)
     {
         Distance R=new Distance(this.feet+D.feet,this.inches+D.inches);
         return R;
     }
     
     public void show()
     {
         System.out.println("Feet: "+feet+" , inches: "+inches);
     }
     
     
    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
}
