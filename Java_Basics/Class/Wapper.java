package Java_Basics.Class;

public class Wapper {
    public static void main(String args[]){
        int x=20;
        Integer y=x; //autoboxing(Premitive->wapper(obj type)-Integer is class name here)
        int z=(int)y; //unboxing
        System.out.println(y+" "+z);
    }
}
