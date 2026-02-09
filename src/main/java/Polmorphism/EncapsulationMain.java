package Polmorphism;

public class EncapsulationMain {

    public static void main(String[] args) {

        EncapsulationExample e=new EncapsulationExample();

        e.setAccno(10109);

        int accnumber=e.getAccno();
        System.out.println(accnumber);

    }
}
