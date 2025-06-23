package Java_Basics;

public class Method1 {
    public String get() {
        return "str";
    }
    public String get(String a) {
        return "str-overload"+a;
    }
    public static String ok(){
                 return "static-no obj required";
    }
    public static void main(String[] args) {
        Method1 m = new Method1();
        System.out.println(m.get()+"\n"+ m.get("str"));
        System.out.println(m.ok()+ " \n"+ ok());
    }
}
