package String;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ReadInputFromUser {

    public static void main(String[] args) {



        /*System.out.println("Enter the number:");

        int num=sc.nextInt();

        System.out.println("Given value"+num);

        System.out.println("Enter the number:");

       double de= sc.nextDouble();

        System.out.println("Given value"+de);*/

        /*System.out.println("Enter the text:");
        String s=sc.next();
        System.out.println("The text is"+ s);*/

        //read multiple input from the console

        /*System.out.println("Enter the first number:");

        int num1=sc.nextInt();

        System.out.println("Enter the second number:");

        int num2=sc.nextInt();

        System.out.println(num1+num2);*/

        //multipe input using different data type

        /*System.out.println("enter the name:");

        String name=sc.next();

        System.out.println("enter the age:");

        int age=sc.nextInt();

        System.out.println("enter the city:");

        String city=sc.next();

        System.out.println("your name:"+name);
        System.out.println("your age:"+age);
        System.out.println("your city:"+city);*/

        //read array from console

        int[] a=new int[5];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values:");
        for(int i=0;i<a.length;i++){

            a[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(a));











    }
}
