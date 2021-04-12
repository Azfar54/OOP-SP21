package lab7_act1;

public class Manager {
    private String title;
    private double dues;
    private EmployeeRecord emp;
    private StudentRecord stu;
    
    public Manager(String financeManager, int i,EmployeeRecord e,StudentRecord s)
{
title = financeManager;
dues = i;
emp = e;
stu = s;
}

    

    public void display()
{
    System.out.println("Title is : " + title);
    System.out.println("Dues are : " + dues);
    System.out.println("Employee record is as under:" );
    System.out.println("Employee Id is : " + emp. getEmp_id());
    System.out.println("Employee Salary is : " + emp. getSalary(0));
    
    System.out.println("Student record is as under:" );
    System.out.println("Degree is : " + stu.getDegree());
}
}