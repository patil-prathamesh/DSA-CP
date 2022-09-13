package collection_framework.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
}
class LearnMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("One",4);
        map.putIfAbsent("twoo",45);
        for(Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + " ");
        }
        System.out.println(map.containsKey("zero")); // check for key
        System.out.println(map.containsValue(90)); // check for value

        for(String key : map.keySet()) {  // Acess keys  keyset
            System.out.println(key);
        }
        for(Integer value : map.values()) {  // Acess values values
            System.out.println(value);
        }
        /*
        Collections.min()
        Collections.max()
        Collections.frequency(list,8)
         */
        System.out.println(map);
    }
}
