package Java_Basics.Class.InnerClass;

public class NestedInherit {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    class ExtendedInner extends Inner {
        void extendedMsg() {
            System.out.println("Extended data is " + data);
        }
    }

    public static void main(String[] args) {
        NestedInherit obj = new NestedInherit();
        NestedInherit.Inner in = obj.new Inner(); // creating instance of inner class
        in.msg();

        NestedInherit.ExtendedInner extIn = obj.new ExtendedInner(); // creating instance of extended inner class
        extIn.extendedMsg();
    }
}
