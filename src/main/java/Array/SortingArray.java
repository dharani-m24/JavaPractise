package Array;


import java.sql.SQLOutput;
import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        int[] a={400,900,300,500,800};

        System.out.println("before sorting"+ Arrays.toString(a));

        System.out.println();

        System.out.println("After sorting");

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
        System.out.println("decending order");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }


    }
}
