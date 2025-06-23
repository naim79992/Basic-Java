package Java_Basics.Enum_;

enum en{
    C(2),D(4);
    private final int a;
    en(int a){this.a=a;} 
    public int geten(){
        return a;
    }
}
public class demo {
    public static void main(String[] args){
        en[] store=en.values();
        for(en s:store) System.out.println(" "+s.ordinal());
        for(en s:store){
            if(s==en.C){
                System.out.println(" "+s.ordinal());
            }
        }

    }
}
