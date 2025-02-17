package Java_Basics.Class.InnerClass;
// Member inner class defined within another class, which can access the outer class's members, including private ones.
public class MemberInnerClass {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String[] args) {
        MemberInnerClass obj = new MemberInnerClass();
        MemberInnerClass.Inner in = obj.new Inner();//creating instance of inner class

        in.msg();
    }
}
/* 
- `obj` is an instance of the outer class `MemberInnerClass`.
- `in` is an instance of the inner class `MemberInnerClass.Inner`.

When you create `in` with `obj.new Inner()`, `in` has access to the `obj` instance and 
its non-static members (like `data`). So, `in` is **tied** to `obj` and can use its data.
*/