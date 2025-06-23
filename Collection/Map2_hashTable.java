package Java_Basics.Collection;

import java.util.Map;
import java.util.Hashtable;
//Hashtable is thread-safe but slower, used in legacy multi-threaded code.(for Syncronized version)
//Synchronized means one thread at a time — it ensures safety but reduces speed
public class Map2_hashTable {
    public static void main(String[] args) {
        Map<String,Integer> s = new Hashtable<>();
        s.put("a",22);s.put("ba",212);s.put("aa",2122);
        System.out.println(s);
        System.out.println(s.get("a"));
        System.out.println(s.keySet());
        for(String key:s.keySet()){
            System.out.println(key+" : "+s.get(key));
        }
    }
}