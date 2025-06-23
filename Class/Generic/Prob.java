package Java_Basics.Class.Generic;

class Prob {
    private int value;

    public Prob (int val) {
        this.value = val;
    }

    public void add(int num) { value += num; }
    public void subtract(int num) { value -= num; }
    public void multiply(int num) { value *= num; }
    
    public void divide(int num) { 
        if (num != 0) value /= num;
        else System.out.println("Error: Division by zero!");
    }

    public void display() { System.out.println("Current Value: " + value); }

    public static void main(String[] args) {
        Prob calc = new Prob (10);
        calc.add(5);
        calc.display();
        calc.subtract(3);
        calc.display();
        calc.multiply(2);
        calc.display();
        calc.divide(4);
        calc.display();
        calc.divide(0); // Error case
    }
}
