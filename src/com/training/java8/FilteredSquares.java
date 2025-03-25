package com.training.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredSquares {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);
        numbers.add(15);
        numbers.add(2);

        // Filter odd numbers, square them, sort, and print
        numbers.stream()
               .filter(n -> n % 2 != 0)  // Filter odd numbers
               .map(m -> m * m)          // Square them
               .sorted()                 // Sorting
               .forEach(System.out::println); // Print
        
        // Collect squared odd numbers into a list
        List<Integer> sortedNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(m -> m * m)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNumbers); // Print the final list
    	
        // Print the names of all departments in the organization
        List<Department> deptList = new ArrayList<>();

        deptList.add(new Department(1, "Sales"));
        deptList.add(new Department(2, "IT"));
        deptList.add(new Department(3, "Accounts"));
        deptList.add(new Department(4, "Marketing"));
            
        deptList.stream()
                .forEach(System.out::println);
    }
}
