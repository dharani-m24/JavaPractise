package Inheritance;


class A{
    int a=100;

    void display(){
        System.out.println(a);
    }
}

class B extends A{

    int b=200;
    void show(){
        System.out.println(b);
    }

}

public class SingleInheritanceTypes {

    public static void main(String[] args) {

        B bobj=new B();

        bobj.display();
        bobj.show();
    }
}
