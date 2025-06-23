package Java_Basics.Class.Generic;

public class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
        }
    
        public static void main(String[] args) {
        GenericClass<String> stringInstance = new GenericClass<>("Hello, World!");
        System.out.println(stringInstance.getData());

        GenericClass<Integer> integerInstance = new GenericClass<>(123);
        System.out.println(integerInstance.getData());
    }
}
