package lab7_assign1;

public class Pizza {
    String size;
    int cheesetop;
    int pepperonitop;
    int hamtop;
    
    public Pizza(String size, int cheesetop, int pepperonitop, int hamtop){
        this.size=size;
        this.cheesetop=cheesetop;
        this.pepperonitop=pepperonitop;
        this.hamtop=hamtop;
    }
    
    public String getSize(){
        return size;
    }
    
    public void setSize(String size){
        this.size=size;
    }
    
    public int getCheeseTop(){
        return cheesetop;
    }
    
    public void setCheeseTop(int cheesetop){
        this.cheesetop=cheesetop;
    }
    
    public int getPepperoniTop(){
        return pepperonitop;
    }
    
    public void setPepperoniTop(int pepperonitop){
        this.pepperonitop=pepperonitop;
    }
    
    public int getHamTop(){
        return hamtop;
    }
    
    public void setHamTop(int hamtop){
        this.hamtop=hamtop;
    }
    
    public double CalcCost(){
        if(size.equals("Small")){
            return 10+(cheesetop+pepperonitop+hamtop)*2;
        }
        
        else if(size.equals("Medium")){
            return 12+(cheesetop+pepperonitop+hamtop)*2;
        }
        
        else if(size.equals("Large")){
            return 14+(cheesetop+pepperonitop+hamtop)*2;
        }
        
        else{
            return 0;
        }
    }
    
    public void getDescription(){
        System.out.println("Pizza size:"+size+"\nCheese Toppings:"+cheesetop+"\nPepperoni Toppings:"+pepperonitop
                            +"\nHam Toppings:"+hamtop+"\nPizza Cost:"+CalcCost()+"$\n");
    }
}