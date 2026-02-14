package ExceptionHandling;

import java.util.Scanner;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {

        System.out.println("program is started");

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number:");
        int num=sc.nextInt();

        try{
            System.out.println(100/num);
        }catch(Exception e){

            System.out.println(e.getMessage());
        }finally {
            System.out.println("you entered into finally block");
        }



        System.out.println("program is completed");

        System.out.println("program is exited");
    }
}
