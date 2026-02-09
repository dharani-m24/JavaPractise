package Interface;

interface Shape{

    int length=20; // final & static variable

    int widhth=20;

    void circle(); // abtract method

    static void sqaure(){
        System.out.println(" this is sqaure-static method");
    }

    default void rectangle(){
        System.out.println("this is rectangle-default method");
    }
}

public class InterfaceDemo implements Shape {

    public void circle(){
        System.out.println(" this is circle-abstract method");
    }



    public static void main(String[] args) {

        Shape in=new InterfaceDemo();

        in.circle();
        in.rectangle();
        Shape.sqaure();





    }
}
