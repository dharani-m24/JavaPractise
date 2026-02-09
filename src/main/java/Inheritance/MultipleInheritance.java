package Inheritance;


class ShowDetails{
    void add(){
        System.out.println(2+2);
    }
}

class DisplayStudent{
    void sub(){
        System.out.println(2-2);
    }
}

class c3 extends ShowDetails{

    void multiple(){
        System.out.println(2*2);
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        ShowDetails sd=new ShowDetails();

        sd.getClass();

        DisplayStudent d=new DisplayStudent();

        d.getClass();
    }
}
