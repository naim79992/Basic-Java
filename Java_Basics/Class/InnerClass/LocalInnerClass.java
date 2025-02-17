package Java_Basics.Class.InnerClass;
// Local inner class inside block(loop/condition/method)
public class LocalInnerClass {
    private int data = 30;
    static int b=10;

    void display() {
        class Local {
            void msg() {
                System.out.println("data is " + data+" "+b);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
    }
}
