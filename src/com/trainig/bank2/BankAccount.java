package com.trainig.bank2;

public class BankAccount {

	   public static void main(String[] args) {
        // System.out.println("Welcome to Bank of Hassan");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Account Number");
        // int accountNumber = sc.nextInt();
        // sc.nextLine();
        // System.out.println("Enter Name");
        // String Name = sc.nextLine();
        // System.out.println("Enter Rate of Investment");
        // double roi = sc.nextDouble();
        // System.out.println("Enter Amount for Investment");
        // double Amount = sc.nextDouble();
        // SavingAccount account1 = new SavingAccount(accountNumber, Name, roi, Amount);
        // System.out.println(account1);
        // System.out.println("Amount after Investment" + account1.calculate());

        // Fixed incorrect parameter order
        SavingAccount account1 = new SavingAccount(1223, "John", 5, 1000);

        // SavingAccount account1 = new SavingAccount(0001,"Hassan",0.088,5000000);
        // SavingAccount account2 = new SavingAccount(0002,"Harith",0.12,990000);
        // SavingAccount account3 = new SavingAccount(0003,"Talal",0.054,40000);
        // SavingAccount account4 = new SavingAccount(0004,"Salem",0.042,800000);

        // SavingAccount[] accounts = new SavingAccount[4];
        // accounts[0] = account1;
        // accounts[1] = account2;
        // accounts[2] = account3;
        // accounts[3] = account4;

        // SavingAccount highestAccount = accounts[0];

        // for (int i = 1; i < accounts.length; i++) {
        // if (accounts[i].getAmount() > highestAccount.getAmount()) {
        // highestAccount = accounts[i];
        // }
        // }

        // System.out.println("Account with the highest amount: " + highestAccount);

        String str1 = new String("David");
        String str2 = new String("David");
        String str3 = "Thomas"; // string literal, another way to create string

        str1 = str2; // Assigning for garbage collector effect
        System.out.println(str1.equals(str2)); // It will print true
    }

		}

		//Constructors
		//MultiThreading
     	/*
     	 * OOPsConcepts
     	 * 
     	 * Encapsulation: Data Binding : example -class
     	 * Inheritance: Relationship between 2 classes 
     	 * Polymorphi
     	 * 
     	 */




