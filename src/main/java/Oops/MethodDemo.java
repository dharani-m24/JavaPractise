package Oops;

public class MethodDemo {

    //Method with no parameter with no return type

    void method1(){
        System.out.println("welcome");
    }

    //Method with no parameter with return type

    String method2(){

        return "hello how are you";
    }

    //Method with parameter and with no return type

    void method3(String name){
        System.out.println(name);
    }

    //Method with parameter and with return type

    String method4(String name,String id){

        return "hello"+name+id;
    }
}
