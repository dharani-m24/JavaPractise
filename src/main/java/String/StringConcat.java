package String;

public class StringConcat {

    public static void main(String[] args) {

        //string-immutable

        String s="welcome";
        s.concat("java"); // immutable- cannot change the original value of s

        System.out.println(s);

        //String Buffer- mutable

        StringBuffer sb=new StringBuffer("selenium");

        sb.append("testNg"); //mutable- can change the original value of sb

        System.out.println(sb);

        //string builder-mutable

        StringBuilder sd=new StringBuilder("selenium");

        sd.append("testNg"); //mutable- can change the original value of sb

        System.out.println(sd);
    }
}
