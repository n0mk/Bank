package com.trainig.bank2;

public class Account {
    
    private String name; // Fixed variable name (camelCase)
    private double amount;

    // Default Constructor
    public Account() {
        System.out.println("Saving Account");
    }

    // Constructor with parameters aaa
    public Account(String name, double amount) {
        super(); // Explicit call to Object class constructor (optional)
        this.name = name;
        this.amount = amount;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Display method (Fixed string concatenation)
    public String display() {
        return "Account Name: " + this.name + ", Account Amount: " + this.amount;
    }
    }
	


