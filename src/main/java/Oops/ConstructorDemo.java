package Oops;

public class ConstructorDemo {

    int x,y;

    ConstructorDemo(){ //defaultConstrutor

        x=100;
        y=100;

    }
    ConstructorDemo(int a, int b){
       this.x=a;
        this.y=b;
    }


    void sum(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {

        ConstructorDemo cd=new ConstructorDemo(); // invoke default constructor
        cd.sum();

        ConstructorDemo cd1=new ConstructorDemo(200,600); //invoke paramterized constructor
        cd1.sum();

    }

}
