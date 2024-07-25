package org.example;

public class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the account holder's name and balance
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        System.out.println(accountHolderName + " Available Funds: " + String.format("%.2f", balance));
    }

    // Method for deposits
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" ");
            System.out.println("Deposited " + String.format("%.2f", amount) + " to " + accountHolderName);
            System.out.println("New balance: " + String.format("%.2f", balance));
        } else {
            System.out.println(" ");
            System.out.println("Cannot deposit " + String.format("%.2f", amount) + " to " + accountHolderName);
            System.out.println("Please enter a positive amount");
        }
    }

    // Method for withdrawal
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" ");
            System.out.println("Withdrew " + String.format("%.2f", amount) + " from " + accountHolderName);
            System.out.println("New balance: " + String.format("%.2f", balance));
        } else if (amount > balance) {
            System.out.println(" ");
            System.out.println("Cannot withdraw " + String.format("%.2f", amount) + " from " + accountHolderName);
            System.out.println("Insufficient balance");
        } else {
            System.out.println(" ");
            System.out.println("Please enter a positive amount");
        }
    }

    // Method to print account details
    @Override /*used to indicate that a method is intended to override a method declared in a superclass.
                the compiler will treat it as a new method in the subclass if not used*/
    public String toString() {
        return accountHolderName + " Available Funds: " + String.format("%.2f", balance);
    }

    public static void main(String[] args) {
        // Create the account for Jack Johnson with 500 dollars
        BankAccount account1 = new BankAccount("Jack Johnson", 500.00);

        //added additional accounts for second part of assignment
        BankAccount account2 = new BankAccount("Leonardo DiCaprionardo", 5000.00);

        BankAccount account3 = new BankAccount("Don Johnson", 300.00);

        account1.deposit(100.00);
        System.out.println(account1);

        account1.withdrawal(50.00);
        System.out.println(account1);

        // Withdraw 100 dollars from Leo Dicaprionardo
        account2.withdrawal(100.00);
        // Deposit 100 dollars into Don Johnsons
        account3.deposit(100.00);

        // Printed final account details
        System.out.println(" ");
        System.out.println("Final Account Details:");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
    }
}