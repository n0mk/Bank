package com.training.java8;

public class Department {
    private int depId;
    private String deptName;

    // Constructor
    public Department(int depId, String deptName) {
        this.depId = depId;
        this.deptName = deptName;
    }

    // Default constructor
    public Department() {
    }

    // Getter for depId
    public int getDepId() {
        return depId;
    }

    // Setter for depId
    public void setDepId(int depId) {
        this.depId = depId;
    }

    // Getter for deptName
    public String getDeptName() {
        return deptName;
    }

    // Setter for deptName
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "Department{" + "depId=" + depId +", deptName='" + deptName + '\'' +
'}';
    }
}
