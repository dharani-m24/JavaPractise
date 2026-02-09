package Inheritance;

class A1{

    void show1(){
        System.out.println("I am from class A");
    }
}

class B2 extends A1{

    void show2(){
        System.out.println("I am from class B");
    }
}

class C extends B2{

    void show3(){
        System.out.println("I am from class C");
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {

        C cobj=new C();

        cobj.show1();
        cobj.show2();
        cobj.show3();

    }
}
