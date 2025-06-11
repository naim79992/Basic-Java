package Java_Basics.Basics;

class Human{
    private int a;
    Human(int a){
        this.a=a;
    }
     public void setage(int a){
        this.a=a;
    }
    public int getage(){
        return this.a;
    }
}
class Hu{
    private static int a=1;
    static void name(){
        System.out.println(a);
    }
    static{
 System.out.println(2);
    }
    
}


public class Prac {
    public static void main(String[] args){
    // Human h1=new Human(2);
    // h1.setage(10);
    // int a=h1.getage();
    // System.out.println(a);
    // int arr[]=new int[3];
    // arr[0]=1;
    // arr[1]=arr[2]=arr[0];

    // for(int i=0;i<3;i++){
    //     System.out.println(arr[i]);
    // }

    // Human[] h=new Human[3];
    // h[0]=new Human(2);
    //  h[1]=new Human(3);
    //   h[2]=new Human(1);
    // for(Human i:h) System.out.println(i.getage());
    Hu.name();Hu.name();
    }
}
