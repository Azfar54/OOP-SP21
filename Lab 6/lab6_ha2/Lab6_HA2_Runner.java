package lab6_ha2;

public class Lab6_HA2_Runner {

    public static void fun()
    {
        int n=4;
        NoOfObjects a=new NoOfObjects();
      a.finalize();
       
         NoOfObjects b=new NoOfObjects();
        b.finalize();
       
          NoOfObjects c=new NoOfObjects();
        c.finalize();
       
       NoOfObjects d=new NoOfObjects();
        //Since I have not called finalize method object is created but not destroyed
       
        
    }
    
        public static void main(String[] args) {
 
fun();
System.out.println("Objects created:"+ NoOfObjects.getObjs());
System.out.println("Objects Destroyed:"+ NoOfObjects.getDestroyedCount());


    }
}