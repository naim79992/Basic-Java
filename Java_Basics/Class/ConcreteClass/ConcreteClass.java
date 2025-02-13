package Java_Basics.Class.ConcreteClass;
// 1. create obj using new 2. **all method of cls have full implementation**
// 3. access modifier: public/default 4. it also can be child of interface/extend abstract class
public class ConcreteClass {
    public void displayMessage() { //2,3
        System.out.println("Hello from ConcreteClass!");
        }

        public int add(int a, int b) { //2,3
        return a + b;
        }

        public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass(); //1
        obj.displayMessage();
        int result = obj.add(5, 3);
        System.out.println("The result of addition is: " + result);
        }
}
