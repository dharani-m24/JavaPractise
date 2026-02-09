package Inheritance;

class A2{

    void show1(){
        System.out.println("I am from class A2");
    }
}

class B1 extends A2{

    void show2(){
        System.out.println("I am from class B1");
    }
}

class C3 extends A2{

    void show3(){
        System.out.println("I am from class C");
    }
}

public class HierachyInheritance {

    public static void main(String[] args) {

        B1 b=new B1();
        b.show1();
        b.show2();

        C3 c=new C3();
            c.show1();
            c.show3();

    }
}
