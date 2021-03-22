package Lab5_Act1;

import static Lab5_Act1.ObjectPass.increment;

public class Lab5_Act1_Runner {

    public static void main(String[] args) {
        ObjectPass p = new ObjectPass();
p.value = 5;
System.out.println("Before calling: " + p.value);
    increment(p);
System.out.println("After calling: " + p.value);
}
    }