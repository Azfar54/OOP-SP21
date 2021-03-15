package Lab4HA3;

public class Runner {

    public static void main(String[] args) {
        int [] r_arr1 = {68, 77, 86, 95, 57};
        Student s1 = new Student("Muhammad", r_arr1);
        System.out.println("Average of Student 1 is: "+s1.Average());
        
        int [] r_arr2 = {83, 79, 66, 73, 60};
        Student s2 = new Student("Azfar", r_arr2);
        System.out.println("Average of Student 2 is: "+s2.Average());
        
        if (s1.Average()>s2.Average()){
            System.out.println("Student 1 has higher Average i.e "+s1.Average());
        }
        else 
            System.out.println("Student 2 has higher Average i.e "+s2.Average());
        
        Student s3 = new Student(s1.getName(),s2.getResult());
        System.out.println("Hence, Average of Student 3 is: "+s3.Average());
    }
    
}
