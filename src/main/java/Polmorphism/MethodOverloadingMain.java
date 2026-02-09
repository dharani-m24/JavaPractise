package Polmorphism;

public class MethodOverloadingMain {

    public static void main(String[] args) {

        MethodOverloading mo=new MethodOverloading();

        mo.sum();  //1
        mo.sum(9,90);  //2
        mo.sum(80.5, 7); //4
        mo.sum(6,60.9);  //3
    }
}
