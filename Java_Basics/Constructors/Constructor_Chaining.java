package Java_Basics.Constructors;

class c{
    private int a;
    public c(){
         this(2);
    }
    public c(int a){
        this.a=a;
    }
    public int get(){
        return a;
    }
}
public class Constructor_Chaining {
    public static void main(String[] args){
      c o=new c();
      System.out.println(o.get());
    }
}
