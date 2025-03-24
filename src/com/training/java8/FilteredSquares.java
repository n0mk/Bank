package com.training.java8;

import java.util.ArrayList;
import java.util.List;

public class FilteredSquares {
    public static void main(String[] args) {
        
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(10);
//        numbers.add(3);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(15);
//        numbers.add(2);

//        numbers.stream()
//               .filter(n -> n % 2 != 0)  // Filter odd numbers
//               .map(m -> m * m)          // Square them
//               .sorted()                 // Sorting it
//               .forEach(x -> System.out.println(x)); // Print
        
//        List<Integer> sortedNumbers = numbers.stream()
//                .filter(n -> n % 2 != 0)  // Filter odd numbers
//                .map(m -> m * m)          // Square them
//                .sorted()                 // Sort in ascending order
//                .collect(Collectors.toList()); // Collect into a List
//
//            System.out.println(sortedNumbers); // Print the final list
//            
    	
    	//2.print the names of all departemnt in the organization
    	List<Department> deptList = new ArrayList<>();

        deptList.add(new Department(1, "Sales"));
        deptList.add(new Department(2, "IT"));
        deptList.add(new Department(3, "Accounts"));
        deptList.add(new Department(4, "Marketing"));
            
        deptList.stream()
        .map(Department::getDeptName) // Using method reference for map()
        .forEach(System.out::println); // Using method reference for forEach()
        

        
                
        
        
        }
    }