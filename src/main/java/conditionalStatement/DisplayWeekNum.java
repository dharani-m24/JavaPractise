package conditionalStatement;

public class DisplayWeekNum {

    public static void main(String args[]){

        String weekName="Wednesday";

         switch(weekName){
             case "Monday":
                 System.out.println("its 1st");
                 break;
             case "tuesday":
                 System.out.println("its 2nd");
                 break;
             case "Wednesday":
                 System.out.println("its 3");
                 break;

             case "thursday":
                 System.out.println("its 4th");
                 break;
             case "friday":
                 System.out.println("its 5th");
                 break;
             case "Saturday":
                 System.out.println("its 6th");
                 break;
         }
    }
}
