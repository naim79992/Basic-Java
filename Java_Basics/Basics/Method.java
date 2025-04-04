package Java_Basics.Basics;

public class Method {
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
        Method m = new Method();
        System.out.println(m.get()+"\n"+ m.get("str"));
        System.out.println(m.ok()+ " \n"+ ok());
    }
}
