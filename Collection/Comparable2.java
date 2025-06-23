package Java_Basics.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stu {
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
}

public class Comparable2 {
    public static void main(String[] args) {
        List<Stu> s = new ArrayList<>();
        s.add(new Stu(21, "a"));
        s.add(new Stu(121, "ab"));
        s.add(new Stu(211, "ea"));
        s.add(new Stu(1121, "adb"));

        Comparator<Stu>com=new Comparator<Stu>(){ //annonimous inner class implementing Comparator<Stu> interface
            public int compare(Stu i,Stu j) {
        if(i.age>j.age){return 1;}
        else return -1;
         }
        };
       // Comparator<Stu>com=(Stu i,Stu j) ->{return i.age>j.age?1:-1;};//shortcut
        Collections.sort(s,com);

        for (Stu stu : s) {
            System.out.println(stu);
        }
    }
}
