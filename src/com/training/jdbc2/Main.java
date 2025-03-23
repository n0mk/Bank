package com.training.jdbc2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.println("Weclome To NahyansBank");
    	System.out.println("-------------------------------------------");
    	System.out.println("---------------------------");
    	System.out.println("--------------");
    	System.out.println("-----");
        try (Scanner sc = new Scanner(System.in)) {
			AccountManagement manager = new AccountManagement();

			while (true) {
			    System.out.println("\n1. Create Account");
			    System.out.println("2. Deposit");
			    System.out.println("3. Withdraw");
			    System.out.println("4. Transfer Funds");
			    System.out.println("5. Check Balance");
			    System.out.println("6. Exit");
			    System.out.print("Choose an option: ");
			    int choice = sc.nextInt();

			    switch (choice) {
			        case 1:
			            System.out.print("Enter Account Holder Name: ");
			            String name = sc.next();
			            System.out.print("Enter Initial Balance: ");
			            double balance = sc.nextDouble();
			            manager.createAccount(name, balance);
			            break;
			        case 2:
			            System.out.print("Enter Account ID: ");
			            int depositId = sc.nextInt();
			            System.out.print("Enter Amount: ");
			            double depositAmount = sc.nextDouble();
			            manager.deposit(depositId, depositAmount);
			            break;
			        case 3:
			            System.out.print("Enter Account ID: ");
			            int withdrawId = sc.nextInt();
			            System.out.print("Enter Amount: ");
			            double withdrawAmount = sc.nextDouble();
			            manager.withdraw(withdrawId, withdrawAmount);
			            break;
			        case 4:
			            System.out.print("Enter Sender Account ID: ");
			            int from = sc.nextInt();
			            System.out.print("Enter Receiver Account ID: ");
			            int to = sc.nextInt();
			            System.out.print("Enter Amount: ");
			            double amount = sc.nextDouble();
			            manager.transferFunds(from, to, amount);
			            break;
			        case 5:
			            System.out.print("Enter Account ID: ");
			            int checkId = sc.nextInt();
			            manager.checkBalance(checkId);
			            break;
			        case 6:
			            System.exit(0);
			    }
			}
		}
    }
}

