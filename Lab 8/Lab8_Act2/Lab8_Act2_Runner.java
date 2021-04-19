package lab8_act2;

public class Lab8_Act2_Runner {

    public static void main(String[] args) {
        Regular regularObj = new Regular("Ahmed","090078601","Islamabad",15000,60000);
        regularObj.Display();
        System.out.println();
        Adhoc adhocObj = new Adhoc("Ali","03333333","Lahore",500,23,1500);
        adhocObj.Display();
}
    }