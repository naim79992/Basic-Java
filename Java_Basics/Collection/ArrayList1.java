package Java_Basics.Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
public class ArrayList1 {
    public static void main(String[] args){
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        for(Integer c:nums){
            System.out.println(c);
        }
        //type na dile jodi ArrayList e khetre problem hote pare
        //ex
        // Collection nums1 = new ArrayList();
        // nums1.add(2);
        // nums1.add("22");
        // for(Object c:nums){
        //     int x=(Integer)c;//runtime error hbe, but jodi  type define kore ditam tile Compiler error hoito, problem dhora porto
        //     System.out.println(x);
        // }
        //ArrayList class implements List & List have a method called get()-idx val.
        //ArrayList e idx val nia kaaj kora jaay na, List a jaay.
        
        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(2);nums2.add(22);
        System.err.println(nums2.indexOf(2));

    }
}
