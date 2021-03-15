
package lab4ha1;


public class Marks {
    private int physics,chemistry,maths;
    public Marks(){
        physics=81;
        chemistry=79;
        maths=88;
    }
    public Marks(int physics,int chemistry,int maths){
        this.physics=physics;
        this.chemistry=chemistry;
        this.maths=maths;
        
    }

    
    public int getphysics() {
        return physics;
    }

    
    public void setphysics(int physics) {
        this.physics = physics;
    }

    
    public int getchemistry() {
        return chemistry;
    }

   
    public void setchemistry(int chemistry) {
        this.chemistry = chemistry;
    }

   
    public int getmaths() {
        return maths;
    }

    public void setmaths(int maths) {
        this.maths = maths;
    }
    public int CalculateSum() {
        int sum =physics + chemistry + maths;
        return sum;
    } 
    public double CalculatePercentage(int sum) {
        double percentage =(sum/300.0)*100;
        System.out.println("Sum = "+sum+" percentage "+percentage);
        return  percentage;
    }
    
}
