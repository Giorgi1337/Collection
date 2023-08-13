package main.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapMain {
    public static void main(String[] args) {
       Map<Integer, String> hashMap = new HashMap<>(); // внутри не гарантируется ни кого порядка

        // в каком порядке при (ключ, значение) были добавлены в таком порядке они вернутся
       Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

       Map<Integer, String> treemap = new TreeMap<>(); // пары (ключ, значение) сортируется по ключу(естественный порядок)

       testMap(treemap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(25,"Anna");
        map.put(22,"John");
        map.put(421,"Mike");
        map.put(7,"Tom");

     for (Map.Entry<Integer, String> entry : map.entrySet()) {
         System.out.println(entry.getKey() + " : " + entry.getValue());
     }
    }
}
