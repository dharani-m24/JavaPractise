package Array;

public class SearchElementArray {

    public static void main(String[] args) {

        int[] a={90,10,20,80,100};

        int searchElement=70;

        for(int i=0;i<a.length;i++){

            if(a[i]==searchElement){
                System.out.println("element found");
                break;
            }
        }
        System.out.println("element not found");


    }
}
