package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class MapDemo {

    public static void main(String[] args) {

        //Declaration

        HashMap<Integer,String> map=new HashMap<Integer,String>();

       // Map map1=new HashMap();

        //HashMap<Integer,String> map=new HashMap<>();

        //adding pair

        map.put(101,"john");
        map.put(102,"Smith");
        map.put(103,"Anu");
        map.put(104,"Abi");
        map.put(105,"Smith");
        map.put(102,"David");

        //print
        System.out.println(map);

        //size
        System.out.println(map.size());

        //remove the pair
        map.remove(104);

        System.out.println("After removing"+map);

        //access value

        System.out.println("get values "+map.get(102));

        //get all the keys

        System.out.println("Get all the keys"+map.keySet());

        //get all the values from the map

        System.out.println("get values from the map"+map.values());

        System.out.println(map.entrySet());

        //read data from map

        for(int x:map.keySet()){

            System.out.println(map.get(x));
        }

        //Iterator

        Iterator<Map.Entry<Integer,String>> it=map.entrySet().iterator();

        while(it.hasNext()){
           Map.Entry<Integer,String> entry= it.next();

            System.out.println(entry.getKey()+" "+entry.getValue());
        }



    }
}
