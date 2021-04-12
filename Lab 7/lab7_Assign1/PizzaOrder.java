package lab7_assign1;

public class PizzaOrder {
    private int numofpizzas;
    private Pizza piz1;
    private Pizza piz2;
    private Pizza piz3;
    
    public PizzaOrder(){
            numofpizzas=0;
            piz1=null;
            piz2=null;
            piz3=null;
    }
    
    public PizzaOrder(int numofpizzas, Pizza piz1, Pizza piz2, Pizza piz3){
        this.numofpizzas=numofpizzas;
        this.piz1=piz1;
        this.piz2=piz2;
        this.piz3=piz3;
    }

    public int getNumofpizzas() {
        return numofpizzas;
    }

    public void setNumofpizzas(int numofpizzas) {
        
            this.numofpizzas=numofpizzas;
        }


    public Pizza getPiz1() {
        return piz1;
    }

    public void setPiz1(Pizza piz1) {
        this.piz1=piz1;
    }

    public Pizza getPiz2() {
        return piz2;
    }

    public void setPiz2(Pizza piz2) {
        this.piz2=piz2;
    }

    public Pizza getPiz3() {
        return piz3;
    }

    public void setPiz3(Pizza piz3) {
        this.piz3=piz3;
    }
    
    public int calcTotal(){
        int totalcost=0;
        if(piz1!=null){
            totalcost+=piz1.CalcCost();
        }
        if(piz2!=null){
            totalcost+=piz2.CalcCost();
        }
        if(piz3!=null){
            totalcost+=piz3.CalcCost();
        }
        return totalcost;
    }   
}