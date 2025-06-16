package Java_Basics.Lambda_Expression;

interface v{
    int a(int a,int b);
}
public class prac {
    public static void main(String[] args){
       v v1=(a,b)->{
        return a + b;
       };
       int b=v1.a(2,3);
    }
}
