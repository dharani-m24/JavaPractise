package Array;

/*
* Declare an array
add values into array
Find the size of an array
Read a single values from an array
Read  all values from an array

* */
public class SingleDimensionalArray {

    public static void main(String[] args) {
        //Declare an array

        //Approach 1- declare first then assign values

        int[] a=new int[5];

        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        //approach 2- declare+ assign values

        int[] b={10,20,30,40,50,60};

        //Find the size of an array

        int size=a.length;
        System.out.println("size of an array"+ size);

        //Read a single values from an array

        System.out.println(b[4]);

        //Read  all values from an array //

        // int[] b={10,20,30,40,50,60};

    for(int i=0; i<b.length;i++){ // i<=b.length-1 , i<6 , i<=5


        System.out.println(b[i]); // b[0], b[1],[2],b[3],b[4],b[5]
    }

    //enhanced for loop
        for(int arr: b){
            System.out.println(arr);
        }




    }
}
