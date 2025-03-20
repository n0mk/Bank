package com.trainig.collection;

import java.util.HashSet;
import java.util.Set;



public class CollectionDemo {

	public static void main(String[]args) {
		
// 		List<String> names = new ArrayList<>();
// 		names.add("Ahmed");
// 		names.add("Hassan");
// 		names.add("Hussein");
// 		names.add("Ali");
// 		names.add("Fatimah");
// 		names.add("Ali");
		
// 		for(String name:names) {
// //			if( name.startsWith("A"))
// 			System.out.println(name);
// 		}

//		Set<Strings> namesSet = new HashSet<>();
//		namesSet.add("Ahmed");
//		namesSet.add("Hassan");
//		namesSet.add("Hussein");
//		namesSet.add("Ali");
//		namesSet.add("Fatimah");
//		namesSet.add("Ali");
		
		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee(101, "Harith", "IT", 2000));
		empSet.add(new Employee(101, "Harith", "IT", 2000));
		empSet.add(new Employee(102, "Sara", "Sales", 2000));
		empSet.add(new Employee(103, "Talal", "Accounts", 2500));
		empSet.add(new Employee(104, "Eman", "IT", 2000));
		
		for(Employee emp:empSet) {
			System.out.println(emp);
		}
		
//		Iterator<String> iter = names.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
	}
}







