package conditionalStatement;

import java.util.Scanner;

public class CrossBrowser {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        String browserName=sc.nextLine();

        if(browserName.equalsIgnoreCase("chrome")){
            System.out.println("Chrome is launched");
        }else if(browserName=="firefox"){
            System.out.println("firefox is launched");
        }else if(browserName=="edge") {
            System.out.println("edge is launched");
        }
        else if(browserName=="safari") {
            System.out.println("safari is launched");
        }
        else{
            System.out.println("invalid browser");
        }
    }
}
