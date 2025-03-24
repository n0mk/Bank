package com.training.java8;

import java.util.ArrayList;
import java.util.List;

public class NameFilter {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("Sara");
        names.add("Ali");
        names.add("Sami");
        names.add("Fatima");
        names.add("Omar");
        names.add("Salim");

        for (String name : names) { 
            if (name.startsWith("S")) {
                System.out.println(name);
            }
        }
    }
}

