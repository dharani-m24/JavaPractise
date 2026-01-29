package String;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        String s="Selenium";

       // String s1=new String("Selenium");

        System.out.println(s);
       // System.out.println(s1);

        //length()- returns the length of a string

        int l=s.length();

        System.out.println(l);

        System.out.println(s.length());

        //concat-join two or more  strings

        String s1="selenium";
        String s2="Java";
        String s3="automation";


        System.out.println(s1+s2+s3);

        System.out.println(s1.concat(s2).concat(s3));

        //trim()- remove spaces from before and after

        //s1="selenium";

        System.out.println(s1);
        System.out.println(s1.length());

        System.out.println(s1.trim());

        //charAt()- return a character from string based on index

        System.out.println(s1.charAt(3));

        //contains()- specific sequence of character is present within a string

        s1="selenium";

        System.out.println(s1.contains("len"));

        System.out.println(s1.contains("Sel")); //false

       //equal- compare two strings //equalIgnorecase

        String s4="Playwright";
        String s6="playwright";

        System.out.println(s4.equals(s6));

        System.out.println(s4.equalsIgnoreCase(s6));

        //replace- single/multiple sequence of character in a string

        String se="Welcome selenium java selenium pytho c#";

        System.out.println(se.replace('e', 'f'));

        System.out.println(se.replace("selenium", "hello"));

        //substring- extract substring from the main string based on index

        //substring(startingIndex, endingIndex)

        String d="hello"; //el

        String d1="selenium"; //elen

        System.out.println(d.substring(1,3));

        System.out.println(d1.substring(1,5));

        //touppercase //tolowercase

        System.out.println(d1.toUpperCase());
        System.out.println(d1.toLowerCase());

        //split- split the string into multiple parts based on delimeter

        String email="abc123@gmail.com"; //abc

        String[] arr=email.split("@");

        System.out.println(Arrays.toString(arr));

        String em="abc 123@xyz"; // abc 123 xyz

        String[] arr1=em.split(" ");


        System.out.println("Arr1:"+ Arrays.toString(arr1));
        String[] arr2=arr1[1].split("@");

        System.out.println("Arr2:"+Arrays.toString(arr2));

        System.out.println(arr1[0]); //abc
        System.out.println(arr2[0]); //123
        System.out.println(arr2[1]); //xyz

        String st="$15,90,80"; // 159080

        String st1=st.replace("$","");



        System.out.println(st1.replace(",",""));

















    }
}
