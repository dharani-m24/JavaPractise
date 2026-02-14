package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Declaration

        ArrayList<Object> mylist=new ArrayList<Object>();

        //List myList=new ArrayList();

        //ArrayList<Integer> mylist=new ArrayList<Integer>();

        //adding the data into ArrayList

        mylist.add(100);
        mylist.add(10.5);
        mylist.add("Java");
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);

        //size ofthe list

        System.out.println(mylist.size());

        //print the list
        System.out.println("priniting data from the list"+mylist);

        //remove element from the list

        mylist.remove(3);

        System.out.println("After removing "+mylist);

        //inserting the element in the list

        mylist.add(2,"selenium");

        System.out.println("After Insertion"+mylist);

        //Modify the element in the list

        mylist.set(3,"python");

        System.out.println("After modification"+mylist);

        //Access specific element

        System.out.println("Specific value"+ mylist.get(5));

        //reading all the element from arraylist

        //Approach 1-using for loop

        /*for(int i=0;i<mylist.size();i++){

            System.out.println(mylist.get(i));
        }*/

        //foreach- using
//        for(Object x:mylist){
//            System.out.println(x);
//        }

        //Approach-3 using Iterator

       Iterator<Object> it= mylist.iterator();

       while(it.hasNext()){

           System.out.println(it.next());

       }

       //checking the arraylist is empty or not

        System.out.println(mylist.isEmpty());

       //remove all element from list

        ArrayList<Object> mylist2=new ArrayList<Object>();

        mylist2.add(10.5);
        mylist2.add("selenium");
        mylist2.add("python");

        mylist.removeAll(mylist2);

        System.out.println("after removing multiple element"+mylist);

        mylist.clear();

        System.out.println("remove all"+mylist);
















    }
}
