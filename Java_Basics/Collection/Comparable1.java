package Java_Basics.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stu implements Comparable<Stu> {
    int age;
    String name;

    public Stu(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stu [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Stu that) {
        if(this.age>that.age){
            return 1;
        }
        else return -1;
    }
}

public class Comparable1 {
    public static void main(String[] args) {
        List<Stu> s = new ArrayList<>();
        s.add(new Stu(21, "a"));
        s.add(new Stu(121, "ab"));
        s.add(new Stu(211, "ea"));
        s.add(new Stu(1121, "adb"));
        Collections.sort(s);

        for (Stu stu : s) {
            System.out.println(stu);
        }
    }
}
