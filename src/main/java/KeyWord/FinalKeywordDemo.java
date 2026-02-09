package KeyWord;

class Finaldemo{

   final int c=88;

   final void m1(){

       System.out.println("this is from finldemo");
   }

}





public class FinalKeywordDemo {



    public static void main(String[] args) {

        Finaldemo cd=new Finaldemo();

        System.out.println(cd.c);
        cd.m1();

    }
}
