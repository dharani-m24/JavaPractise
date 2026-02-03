package Oops;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp=new Employee();

        emp.empId=101;
        emp.ename="Kim";
        emp.job="IT";
        emp.sal=1000;

        emp.display();

        Employee emp2=new Employee();
/**/
        emp2.empId=102;
        emp2.ename="Anu";
        emp2.job="IT";
        emp2.sal=2000;

        emp2.display();
    }
}
