package KeyWord;

public class Animal {

    String color="black";

    void eat(){
        System.out.println("method from Animal");
    }

}

class Dog extends Animal{

    String color="white";

    void displa(){

        System.out.println(super.color);
    }

    void eat(){

        super.eat();
        System.out.println("method from dog");
    }
}
