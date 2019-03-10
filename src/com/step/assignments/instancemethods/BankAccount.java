package com.step.assignments.instancemethods;

import com.step.assignments.MinutesAndSeconds;

public class BankAccount {
    public static void main(String[] args) {

    }

    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;

    public BankAccount() {
    }

    public BankAccount(int balance, String name, String email, int phoneNumber) {
        this.accountNumber = (int) (Math.random()*1000);
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(int money){
        this.balance+=money;
        System.out.println("you have deposited "+money+" and the new balance is "+this.balance);
    }

    public void withdrawMoney(int money){
        if (money>this.balance){
            System.out.println("you have insufficient funds to withdraw");
            return;
        }
        this.balance -= money;
        System.out.println("you have withdrawn "+money+" and the new balance is "+this.balance);
    }
}

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.