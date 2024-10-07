package se.deved;

public class BankAccount {

    // Encapsulation
    private double balance;

    public void deposit(int amount) {
        this.balance += amount;
        // SEND MAIL
    }
}
