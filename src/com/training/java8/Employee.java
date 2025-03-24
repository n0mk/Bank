package com.training.java8;

public class Employee {
    private int empId;
    private String empName;
    private String city;
    private char gender;
    private Department dept; // Reference to Department

    // Constructor with all fields
    public Employee(int empId, String empName, String city, char gender, Department dept) {
        this.empId = empId;
        this.empName = empName;
        this.city = city;
        this.gender = gender;
        this.dept = dept;
    }

    // Default constructor
    public Employee() {
    }

    // Getter and Setter for empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter and Setter for empName
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for gender
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Getter and Setter for dept
    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "Employee{" +
                 "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", city='" + city + '\'' +
                ", gender=" + gender +
                ", dept=" + dept +
                '}';
    }
}
