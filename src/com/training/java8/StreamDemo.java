package com.training.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamDemo {
	public static void main(String[] args) {

		List<Department> deptList = new ArrayList<>();
		deptList.add(new Department(1, "Sales"));
		deptList.add(new Department(2, "IT"));
		deptList.add(new Department(3, "Accounts"));
		deptList.add(new Department(4, "Marketing"));

		// deptList.stream().map(Department :: getDepName).forEach(System.out ::
		// println);

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Hassan Al Raisi", "Muscat", 'M', deptList.get(0), 12000.00));
		empList.add(new Employee(2, "Aisha Al Habsi", "Sohar", 'F', deptList.get(1), 9500.00));
		empList.add(new Employee(3, "Khalid Al Busaidi", "Nizwa", 'M', deptList.get(2), 8800.00));
		empList.add(new Employee(4, "Fatima Al Lawati", "Salalah", 'F', deptList.get(3), 9200.00));
		empList.add(new Employee(5, "Omar Al Balushi", "Ibri", 'M', deptList.get(1), 8700.00));
		empList.add(new Employee(6, "Mariam Al Zadjali", "Muscat", 'F', deptList.get(0), 9100.00));
		empList.add(new Employee(7, "Nasser Al Riyami", "Sur", 'M', deptList.get(2), 8900.00));
		empList.add(new Employee(8, "Salim Al Kindi", "Rustaq", 'M', deptList.get(3), 9300.00));
		empList.add(new Employee(9, "Latifa Al Nabhani", "Muscat", 'F', deptList.get(0), 9400.00));
		empList.add(new Employee(10, "Yusuf Al Hamdani", "Barka", 'M', deptList.get(1), 8600.00));

		Optional<Employee> emp = empList.stream().min(Comparator.comparing(Employee::getSalary));

		if (emp.isPresent()) {
			Employee highestPaid = emp.get();
			System.out.println("Employee Name: " + highestPaid.getEmpName() + ", Department: "
					+ highestPaid.getEmpDept().getDepName() + ", Salary: " + highestPaid.getSalary() + " OMR");
		}
	}

}
