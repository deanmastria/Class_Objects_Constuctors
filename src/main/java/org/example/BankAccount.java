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
    @Override
    public String toString() {
        return accountHolderName + " Available Funds: " + String.format("%.2f", balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jack Johnson", 500.00);
        System.out.println(account);

        account.deposit(100.00);
        System.out.println(account);

        account.withdrawal(50.00);
        System.out.println(account);
    }
}