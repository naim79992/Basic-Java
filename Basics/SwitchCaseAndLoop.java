package Java_Basics.Basics;
public class SwitchCaseAndLoop {

public static void main(String[] args) {
    //switch case
    int x=1;
    switch(x){
        case 1:
            System.out.println("x is 1");
            break;
        case 2:
            System.out.println("x is 2");
            break;
        default:
            System.out.println("x is neither 1 nor 2");
    }
    //updated switch case
    int y=2,r;
    switch(y){
        case 1 -> System.out.println("y is 1");
        case 2 -> System.out.println("y is 2");
        default -> System.out.println("y is neither 1 nor 2");
    }
    //ex 2
    switch(y){
        case 1 -> r=1;
        case 2 -> r=2;
        default -> r=3;
    }
    System.out.println("r: " + r);
    //ex 3
    String z="Sunday";
    switch(z){
        case "Monday" -> System.out.println("Today is Monday");
        case "Tuesday" -> System.out.println("Today is Tuesday");
        case "Wednesday" -> System.out.println("Today is Wednesday");
        case "Thursday" -> System.out.println("Today is Thursday");
        case "Friday" -> System.out.println("Today is Friday");
        case "Saturday" -> System.out.println("Today is Saturday");
        case "Sunday" -> System.out.println("Today is Sunday");
        default -> System.out.println("Invalid day");
    }
    for(int i=0;i<5;i++){
        System.out.println("i: " + i);
    }
    int a=2;
    do{
        System.out.println("while loop");
    }while(a-->0);
}
}
