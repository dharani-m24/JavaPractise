package Oops;

public class MethodDemoMain {

    public static void main(String[] args) {

        MethodDemo m=new MethodDemo();

        m.method1();
        String message= m.method2();
        System.out.println(message);

        m.method3("John");

        String name=m.method4("kim","101");

        System.out.println(name);

       // System.out.println(m.method4("kim"));
    }
}
