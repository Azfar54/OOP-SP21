package lab.pkg12;

import java.util.Scanner;

public class Student extends Person implements Association{
       // private String regno;
    //private String semester;
    
    private int rollNo;
    private int semester;

  
/**
    public Student(String id, String name,int rollno,int semester) {
        super(id, name);
        this.rollNo=rollno;
        this.semester=semester;
    }
**/

    @Override
     public String getId() {
        return ID;
    }
      public Student(String name, String ID) {
        super(name, ID);
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
  
    
    @Override
    public String toString(){
        return "Student ["+super.toString()+"\t"+String.format("Roll No = %s , Semester = %s ", rollNo,semester) + "]";
                
    }

    @Override
    public void associate() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student roll Number = ");
        this.rollNo=scan.nextInt();
        System.out.print("Enter Student Semester = ");
        this.semester=scan.nextInt();

}
}