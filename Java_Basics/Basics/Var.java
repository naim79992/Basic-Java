public class Var {
        // int a=20;
        // int b=0b101;
        // int c=0xA;
    public static void main(String[] args) {
        int a=20;
        int b=0b101;
        int c=0xA;
        System.out.println("a: " + a); 
        System.out.println("b: " + b);
        System.out.println("c: " + c); 
        int r=(a==b)?a:b;
        System.out.println("r: " + r);
        System.out.println((a==b)?a:b);//ternary operator
    }
}
