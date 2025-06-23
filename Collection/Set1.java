package Java_Basics.Collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
    public static void main(String[] args) {
        //set is collection framework
        Set<Integer> nums = new HashSet<Integer>();//not sorted+don't have idx val
        nums.add(3);
        nums.add(2);
        nums.add(2);
        nums.add(32);
        nums.add(22);
        //print way1
        System.out.println(nums);
        //print way2
        Iterator<Integer>val=nums.iterator();
        while(val.hasNext())System.out.println(val.next());
        //print way3
        for(Integer a: nums) System.out.println(a); 

         Set<Integer> nums11 = new TreeSet<Integer>();//sorted
        nums11.add(3);
        nums11.add(2);
        nums11.add(2);
        nums11.add(32);
        nums11.add(22);
        System.out.println(nums11);
        
        Collection<Integer> num = new TreeSet<Integer>();//using collection
        num.add(3);
        num.add(2);
        num.add(2);
        num.add(32);
        num.add(22);
        System.out.println(num);
        
    }
}
