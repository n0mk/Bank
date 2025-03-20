package com.trainig.collection2;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
	 private List<Customer> customers = new ArrayList<>();

	    // Add a customer
	    public void addCustomer(Customer customer) {
	        customers.add(customer);
	    }

	    // Update a customer's information
	    public void updateCustomer(int id, String newName, String newEmail) {
	        for (Customer c : customers) {
	            if (c.getId() == id) {  //find
	                c.setName(newName);
	                c.setEmail(newEmail);
	                return; // Exit after update
	            }
	        }
	        System.out.println("Customer with ID " + id + " not found.");
	    }

	    // Delete a customer
	    public void deleteCustomer(int id) {
	        customers.removeIf(c -> c.getId() == id);
	    }

	    // Show all customers
	    public void showCustomers() {
	        for (Customer c : customers) {
	            System.out.println(c);
	        }
	    }
	

	    public static void main(String[] args) {
	        CustomerManager manager = new CustomerManager();

	        // Adding customers
	        manager.addCustomer(new Customer(1, "Alice", "alice@example.com"));
	        manager.addCustomer(new Customer(2, "Bob", "bob@example.com"));
	        manager.addCustomer(new Customer(3, "Charlie", "charlie@example.com"));

	        // Display all customers
	        System.out.println("All Customers:");
	        manager.showCustomers();

	        // Updating a customer
	        manager.updateCustomer(2, "Bob Marley", "bob.marley@example.com");
	        System.out.println("\nAfter Update:");
	        manager.showCustomers();

	        // Deleting a customer
	        manager.deleteCustomer(3);
	        System.out.println("\nAfter Deletion:");
	        manager.showCustomers();
	    }
}
