package com.trainig.collection;


	import java.util.Objects;

	public class Employee {

		private int empId;
		private String empName;
		private String deptName;
		private double Salary;
		
		public Employee(int empId, String empName, String deptName, double salary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.deptName = deptName;
			Salary = salary;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		public double getSalary() {
			return Salary;
		}

		public void setSalary(double salary) {
			Salary = salary;
		}
		
		public String toString() {
	        return "Employee [empId=" + empId + ", empName=" 
		+ empName + ", deptName=" + deptName + ", Salary=" + Salary + "]";
	    }

	    @Override
	    public int hashCode() {
	       return this.empId;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        
	        Employee employee = (Employee) obj;
	        return Objects.equals(empId, employee.empId) 
	        		&& Objects.equals(empName, employee.empName) 
	        		&& Objects.equals(deptName, employee.deptName)
	                && Salary == employee.Salary;
	    }

}
	

	
