package KeyWord;

public class StaticKeyword {

    static int a=10; // static variable

    int y=90; //non-static variable

    static void m1(){
        System.out.println("this is a static method");
    }

    void m2()
    {
        m1();
        System.out.println();
        System.out.println("this is a non-static method");
    }




}
