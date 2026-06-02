package OOP;

/*Your task — create a class called BankAccount with:

Fields: owner (String), balance (double) — both private
Constructor that takes both
Getters for both fields
Setter only for balance (owner should never change)
A method deposit(double amount) that adds to balance
A method withdraw(double amount) that subtracts from balance — but prints "Insufficient funds." if amount is more than balance
In main, create an account, deposit, withdraw, and print the balance using the getter */

import java.util.Scanner;

public class BankAccount {

    //Fields (attributes)
    private String owner;
    private double balance;

    //Constructor
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    //Getter for owner
    public String getOwner() {
        return owner;
    }

    //Getter for balance
    public double getBalance() {
        return balance;
    }

    //Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Method for Deposit
    public void deposit(double amount) {
        balance += amount;

    }

    //Method for Withdraw
    public void withdraw(double amount) {
        if (amount > balance) System.out.println("Insufficient funds.");
        else balance -= amount;
    }

    //Main method
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //User input for Owner name
        System.out.print("Enter owner name: ");
        String ownerName = scanner.nextLine();

        //User input for initial balance
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        //Create account with user input
        BankAccount account = new BankAccount(ownerName, initialBalance);

        //New balance
        System.out.print("Enter new balance: ");
        double newBalance = scanner.nextDouble();
        account.setBalance(newBalance);

        //Deposit
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        //Withdraw
        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        //Print results using getters
        System.out.println("Owner name: " + account.getOwner());
        System.out.print("Current balance: " + account.getBalance());

        scanner.close();

    }
}