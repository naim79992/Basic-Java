package Java_Basics.Class.Generic;

public class pair<K, V> {
    private K key;
    private V value;

    public pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        //can define in 2 ways
        pair<String, Integer> examplePair = new pair<>("exampleKey", 123);
        pair<String, Integer> examplePair1 = new pair<>("exampleKey1", 1234);
        System.out.println("Key: " + examplePair.getKey());
        System.out.println("Value: " + examplePair.getValue());
    }
}
