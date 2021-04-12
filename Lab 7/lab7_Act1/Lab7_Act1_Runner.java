package lab7_act1;

public class Lab7_Act1_Runner {

    public static void main(String args[])
{
    StudentRecord s = new StudentRecord("MBA");
    EmployeeRecord e = new EmployeeRecord(106,75000);
    Manager m1 = new Manager("Finance Manager " , 5000, e, s ) ;
    m1.display();
}
    }