package KeyWord;


class A{

    int acount;
    int balance; //0,0

    A(int acount, int balance){
        this.acount=acount; // x=0
       this.balance=balance;
    }

    void display(){

        System.out.println(acount);
        System.out.println(balance);
    }

}

public class ThisKeywordDemo {

    public static void main(String[] args) {

        A obj=new A(10,90);

        obj.display();




    }








}
