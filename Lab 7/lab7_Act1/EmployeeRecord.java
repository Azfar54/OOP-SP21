package lab7_act1;

public class EmployeeRecord {
    private int emp_id;
    private double salary;
    public EmployeeRecord (int id, int sal)
{
    emp_id=id;
    salary=sal;
}
public void setEmp_id ( int id)
{
emp_id = id;
}
public int getEmp_id ()
{
return emp_id ;
}
public void setSalary ( int sal)
{
salary = sal;
}
public double getSalary ( int sal)
{
return salary;
}
}