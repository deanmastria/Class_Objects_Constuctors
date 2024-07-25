package org.example;

public class BankAccount {
    private String accountHolderName;
    private String fundsAvailable;
    private double balance;

    //constructor to initialize the account holders name/balance
    public BankAccount(String accountHolderName, String fundsAvailable, double balance) {
        this.accountHolderName = accountHolderName;
        this.fundsAvailable = fundsAvailable;
        this.balance = balance;
    }

    //Method for deposits

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

    //Method for withdrawal
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" ");
            System.out.println("Withdrawn " + String.format("%.2f", amount) + " to " + accountHolderName);
            System.out.println("New balance: " + String.format("%.2f", balance));
        } else if (amount > balance) {
            System.out.println(" ");
            System.out.println("Cannot withdraw " + String.format("%.2f", amount) + " to " + accountHolderName);
            System.out.println("Insufficient balance");
        } else {
            System.out.println(" ");
            System.out.println("Please enter a positive amount");
        }
    }

    //Print account deets

    public String toString() {
        return accountHolderName + " " + fundsAvailable + " " + String.format("%.2f", balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jack Johnson", "Available Funds: ", 500.00);
        System.out.println(account);

        account.deposit(100.00);

        System.out.println(account);
    }
}
