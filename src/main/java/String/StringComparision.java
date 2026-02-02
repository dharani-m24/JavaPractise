package String;

public class StringComparision {

    public static void main(String[] args) {

        //eg1

        /*String s1="playwright";
        String s2="playwright";

        System.out.println(s1==s2);  // true
        System.out.println(s1.equals(s2)); // true*/

        //eg2

        String s3=new String("playwright");
        String s4=new String("playwright");

        System.out.println(s3==s4);  // false
        System.out.println(s3.equals(s4)); // true


    }
}
