package Lab4HA3;

public class Student {
    private String Name;
    private int [] Result_array;
    private int sum ;
    private double average;
    int i;
     
    public Student(String n, int [] array){
        Name = n;
        Result_array = array;
        
    }
    
    public double Average(){
        sum = 0;
        for (i =0; i<= Result_array.length - 1; i++){
            sum = sum + Result_array[i];
        }
        average = sum/Result_array.length;
        return average;
    }
    
    public String getName(){
        return Name;
    }
    
    public int[] getResult(){
        return Result_array;
    }    
}
