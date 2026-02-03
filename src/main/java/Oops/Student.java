package Oops;

public class Student {

    int sid;
    String sname;
    char grade;



    void printStudentData(){

        System.out.println(sid +" "+sname+" "+grade);

    }

    void setStudentData(int id, String name, char g){

        sid=id;
        sname=name;
        grade=g;
    }

    Student(int id,String name, char g ){
        sid=id;
        sname=name;
        grade=g;
    }
}
