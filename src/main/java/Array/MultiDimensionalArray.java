package Array;

/*
* Declare an array
add values into array
Find the size of an array
Read a single values from an array
Read  all values from an array

* */
public class MultiDimensionalArray {

    public static void main(String[] args) {

        //Declare an array

        //Approach 1- declare first then assign values

        int[][] a=new int[3][2];

        a[0][0]=10;
        a[0][1]=20;

        a[1][0]=30;
        a[1][1]=40;

        a[2][0]=50;
        a[2][1]=60;

        //approach 2- declare+ assign values

        int[][] b={
                {10,20},
                {30,40},
                {50,60}
        };

        //Find the size of an array

        /*System.out.println("row size:"+b.length);

        System.out.println("colum size:"+ b[0].length);*/


        //Read a single values from an array

       /* System.out.println(b[1][1]);
        System.out.println(b[2][1]);*/

        //Read  all values from an array

        // row length b.length=3
        // column size:2
        for(int r=0; r<b.length;r++){

            for(int c=0; c<b[r].length; c++){


                System.out.print(b[r][c]+" ");
            }

            System.out.println();
        }


        for( int row[]: b){

            for (int col: row){
                System.out.print(col);

            }
            System.out.println();
        }



    }
}
