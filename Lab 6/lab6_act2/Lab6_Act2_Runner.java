package lab6_act2;

public class Lab6_Act2_Runner {
    
    public static void main(String[] args) {
    NoOfObjects o1=new NoOfObjects();
    NoOfObjects o2=new NoOfObjects(17);
    NoOfObjects o3=new NoOfObjects(8);
    System.out.println("Objects created:"+ NoOfObjects.getObjs());
    System.out.println("Objects created:"+ o1.getObjs());
}
    }