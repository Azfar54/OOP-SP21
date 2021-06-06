package lab.pkg12;

import java.util.Scanner;

public class Teacher extends Person implements Association{
    private String designation;
    private String department;

   public Teacher(String name, String ID) {
        super(name, ID);
    }

  
    
 //   public Teacher(String id, String name,String designation,String department) {
   //     super(id, name);
     //   this.designation=designation;
       // this.department=department;
        
    //}

    @Override
    public String getId() {
        return ID;
    }
    public String getDesignation() {
        return designation;
    }

   
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

  
    public String getDepartment() {
        return department;
    }

    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    @Override
    public String toString(){
        return "Teacher ["+super.toString()+"\t"+String.format("Designation = %s , Department = %s",designation,department)+"]";
    }

    @Override
    public void associate() {
         Scanner scan = new Scanner(System.in);
        System.out.print("Enter Teacher Designation = ");
        this.designation=scan.nextLine();
        System.out.print("Enter Teacher Department = ");
        this.department=scan.nextLine();
    }
}
