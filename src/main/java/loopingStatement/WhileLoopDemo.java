package loopingStatement;

public class WhileLoopDemo {

    public static void main(String[] args) {

        // example to print 1 to 10

        /*int i=1;  // int-datatype i-variable-

        while(i<=10){  // 1<=10, 2<=10, 3<=10,........ 9<=10, 10<=10, 11<=10

            System.out.println(i);

            i++; // 2, 3, 4....,10, 11
        }*/

        //example2: print hello 10 times

        /*nt i=1;

        while(i<=10){
            System.out.println("hello");

            i++;
        }*/

        // example: print between 1 to 10, print only even numbers

        /*int i=1;

        while(i<=10){

            if(i%2==0){
                System.out.println(i);
                  //
            }

            i++;
        }*/

        //second approach: 1 to 20- print even number

        /*int i=22;

        while(i<=20){

            System.out.println(i);

            i+=2; //i=i+2; // 6+2
        }*/


        int i=1;

        while(i<=5){

            System.out.println("hello");

            if(i==5){
                break;
            }
            i++;
        }

    }
}
