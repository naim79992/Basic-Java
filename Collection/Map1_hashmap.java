package Java_Basics.Collection;

import java.util.HashMap;
import java.util.Map;

public class Map1_hashmap {
    public static void main(String[] args) {
        Map<String,Integer>s=new HashMap<>();
        s.put("a",22);s.put("ba",212);s.put("aa",2122);
        System.out.println(s);
        System.out.println(s.get("a"));
        System.out.println(s.keySet());
        for(String key:s.keySet()){
            System.out.println(key+" : "+s.get(key));
        }
        
    }
}
