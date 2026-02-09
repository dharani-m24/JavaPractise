package KeyWord;

public class StaticDemoMain {

    public static void main(String[] args) {

        //static method can access static variable/method directly without creating object

        System.out.println(StaticKeyword.a);
        StaticKeyword.m1();

        // static method can access non-static variable/method through object
        StaticKeyword sc=new StaticKeyword();
        System.out.println( sc.y);
        sc.m2();


    }
}
