package Polmorphism;

class Bank{

    int roi(){

        return 10;
    }
}

class AbcBank extends Bank{

    int roi(){

        return 20;
    }
}

class MNBank extends Bank{

    int roi(){
        return 15;
    }
}

public class MethodOverriding {

    public static void main(String[] args) {


        AbcBank ab=new AbcBank();

        System.out.println( ab.roi());

        MNBank mn=new MNBank();

        System.out.println(mn.roi());
    }
}
