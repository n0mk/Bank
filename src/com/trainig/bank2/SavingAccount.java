package com.trainig.bank2;

public class SavingAccount extends Account   {

    // Attributes
    private int accountNumber;
    private String name;
    private double roi;
    private double amount;

    // Constructor
    public SavingAccount(int accountNumber, String name, double roi, double amount) {
        super();  // Call the parent class constructor (if needed)
        this.accountNumber = accountNumber;
        this.name = name;
        this.roi = roi;
        this.amount = amount;
    }

    // Calculate total amount after interest
    public double calculate() {
        return amount + (amount * roi / 100);  // Fixed interest formula
    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // toString method
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Account Holder Name: " + name + 
               ", Rate of Interest = " + roi + "%, Amount = " + amount;
    }

    // Method Overriding (assuming Account class has a display method)
    @Override
    public String display() {
        return super.display() + ", Amount: " + this.amount;
    }

    // Overloaded method with different parameters
    public String display(String message) {
        return message + " - Overloaded method";
    }
}