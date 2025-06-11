class Test {
    static String varsity = "DIU"; // Static Variable → 1 টা copy থাকে সবার জন্য
    // Static Method → Object ছাড়াই Call করা যায়
    static void show() {
        System.out.println("Static Method Run hoy\n");
    }
    // Static Block → Auto Run হয় 1st বার load এর সময়(class Test call hoile e eta sobar age run hoy)
    static {
        System.out.println("Static Block Run hoy");
    }
}
public class Static {
    public static void main(String[] args) {
        //static var
        // static block(Test call korar somoy e run hbe 1 bar only)-> static var(DIU) run
        System.out.println(Test.varsity);  // static block((Test call korar somoy e run hbe 1 bar)-> static var(DIU)
        Test.show();  // Static Method Run hoy

        Test t1=new Test();
        //2nd tym static block run hobe na, load hoye gese, can use val from that
        System.out.println(t1.varsity); //DIU
        t1.show(); //Static Method Run hoy
    }
}
