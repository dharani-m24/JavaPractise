package String;

import java.util.Scanner;

public class ReverseAString {

    void display1(){

    }

    public static void main(String[] args) {

        String s="selenium";
        String rev="";      //muineles

        //Approach1- inbuild method charAt() and length()
        /*for(int i=s.length()-1;i>=0;i--){ // m //u

           rev= rev+s.charAt(i); // ""+m=m // m+u=mu
            //m //mu //mui // muin //muin
        }*/

        System.out.println(rev);

        //Approach2- without using string methods

        /*char[] s1=s.toCharArray();

        for(int i=s1.length-1;i>=0;i--){
             rev=rev+s1[i];

        }

        System.out.println(rev);*/

        //Approach3 // using direct inbuild methods-StringBuffer

    StringBuffer sb=new StringBuffer("selenium");

        System.out.println("using string buffer:"+sb.reverse());

        //approach4 // using direct inbuild methods-stringBuilder

        StringBuilder sd=new StringBuilder("selenium");

        sd.reverse();

        System.out.println("using string builder:"+sd);



    }
}
