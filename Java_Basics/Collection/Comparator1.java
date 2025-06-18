package Java_Basics.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Comparator1 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(4); num.add(42); num.add(14); num.add(42);
        Collections.sort(num);
        System.out.println(num);

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i%10>j%10) return 1;//swap
                else return -1;
            }
        };
        Collections.sort(num, com); // Example usage of the custom comparator
        System.out.println(num);
    }
}
