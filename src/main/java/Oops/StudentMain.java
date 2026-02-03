package Oops;

public class StudentMain {

    public static void main(String[] args) {

       /*Student stu=new Student();

       //using object reference variable
       stu.sid=1;
       stu.sname="Abc";
       stu.grade='A';

       stu.printStudentData();

       //using method

       stu.setStudentData(2,"John",'b');
        stu.printStudentData();
        stu.setStudentData(3,"nbm",'a');*/

        //using constructor

        Student stu=new Student(107,"Anu",'A');
        stu.printStudentData();

    }
}
