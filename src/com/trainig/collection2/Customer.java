package com.trainig.collection2;


public class Customer {
	
	 private int id;
	private String name;
	private String email;

	public Customer(int id, String name, String email) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	    }

	    // Getters
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    // Setters
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return "Customer [ID=" + id + ", Name=" + name + ", Email=" + email + "]";
	    }
	}




