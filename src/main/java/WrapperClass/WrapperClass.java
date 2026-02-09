package WrapperClass;

public class WrapperClass {

    public static void main(String[] args) {

        //string-->int

        String price="200";
        String price2="100";

        int a=Integer.parseInt(price);
        int b=Integer.parseInt(price2);

        System.out.println(price+price2);

        System.out.println(a+b);

        //string-->int

        String s1="10.5";

        System.out.println(Double.parseDouble(s1));

        //string---->boolean

        String s="true";

        System.out.println(Boolean.parseBoolean(s));

        // int, double, boolean char—---------->String

        int a1=10;
        double d=90.8;
        char c='A';
        boolean bool=true;

        System.out.println(String.valueOf(a1));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(bool));
        System.out.println(String.valueOf(c));


    }
}
