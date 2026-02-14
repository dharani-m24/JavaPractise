package ExceptionHandling;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("program is started");

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number:");

        int num=sc.nextInt();

        System.out.println(100/num);

        /*int[] a=new int[5];

        System.out.println("enter the position:");
        int pos=sc.nextInt();

        System.out.println("enter a value");
        int value=sc.nextInt();

        a[pos]=value;

        System.out.println(a[pos]);*/

        /*String s=null;

        //int num=Integer.parseInt(s);

        System.out.println(s.length());*/



        System.out.println("program is completed");

        System.out.println("program is exited");

    }
}
