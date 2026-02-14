package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        //declaration

        HashSet<Object> myset=new HashSet<Object>();

       // Set<Object> myset1=new HashSet<Object>();

       // HashSet<String> myset=new HashSet<String>();

        // //adding the data into Hashset

        myset.add(100);
        myset.add(10.9);
        myset.add("welcome");
        myset.add(true);
        myset.add('i');
        myset.add(100);
        myset.add(null);
        myset.add(null);

        //print
        System.out.println(myset); //[null, 100, 10.9, i, welcome, true]

        //size
        System.out.println(myset.size());

        //remove

        myset.remove(true);

        System.out.println("remove values"+myset);

        //Inserting element -is not possible

        //access the specific element also not possible

        ArrayList al=new ArrayList(myset);

        System.out.println("after conversion"+al);

        System.out.println(al.get(3));

        //reading the data for-each

        /*for(Object x:myset){
            System.out.println(x);

        }*/

        //Iterator

        Iterator it=myset.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }






    }
}
