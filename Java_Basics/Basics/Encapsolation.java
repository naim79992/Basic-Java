class Human{
    private String name="Naim";
    private int age=27;
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }

    public void setname(String name){ //String n
        this.name= name;  //name=n;(ekhetre this lagbe na)
    }
    public void setage(int age){
        this.age= age;
    }

}



public class Encapsolation {
    public static void main(String[] args){
       Human obj=new Human();
       System.out.println(obj.getname()+" "+obj.getage());
       obj.setage(20);
       obj.setname("NEW");
       System.out.println(obj.getname()+" "+obj.getage());

    }
    
}
