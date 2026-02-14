package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("program is started");

        FileInputStream fs=new FileInputStream("d/text");

        Thread.sleep(1000);

        System.out.println("program is completed");

        System.out.println("program is exited");
    }
}
