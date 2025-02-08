package OOP;
class BankAccount {
    private double balance;  // Private variable (hidden data)

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }

    // Getter method (Read-only access)
    public double getBalance() {
        return balance;
    }

    // Setter method (Controlled modification)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount!");
        }
    }
}

public class Encapsolation {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000);
        System.out.println("Current Balance: " + myAccount.getBalance());

        myAccount.deposit(500);
        System.out.println("Updated Balance: " + myAccount.getBalance());

        myAccount.withdraw(300);
        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}
