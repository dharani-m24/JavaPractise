package String;

import java.util.Arrays;

public class MutableVsImmutable {

    public static void main(String[] args) {

        //mutable-

        int[] a={200,600,900,300,10,50,100};

        System.out.println("before sorting:"+Arrays.toString(a));

        Arrays.sort(a); // mutable- we change the original values in the variable

        System.out.println("After sorting:"+Arrays.toString(a));

        //Immutable

        String s="java";
        System.out.println("before concat:"+s); // java

        String concatString=s.concat("selenium");

        System.out.println("after concat:"+concatString); //javaselenium
    }
}
