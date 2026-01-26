package Array;

public class DuplicateArray {

    public static void main(String[] args) {

        int[] arr={50,90,60,80,90,80,60,100,60};

        int num=90;
        int count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==num){

                count++;

            }
        }

        System.out.println(count);
    }
}
