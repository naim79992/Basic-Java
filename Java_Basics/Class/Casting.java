package Java_Basics.Class;

class vehicle{
    public move(){
        
    }
}
class car extends vehicle{

}
public class Casting {
    public static void main(String args[]){
       vehicle v=new car();//uppercasting
       car c=(car)v; //lower casting
       System.out.println(c);

    }
}
