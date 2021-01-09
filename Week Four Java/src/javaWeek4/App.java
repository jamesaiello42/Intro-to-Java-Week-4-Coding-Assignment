package javaWeek4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		// Index variable used by Map employeeMaps
		// List of employee names, set of id, and a map to tie together
		int i = 0;
		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		// Added five entries to employeeNames
		employeeNames.add("James");
		employeeNames.add("John");
		employeeNames.add("Sam");
		employeeNames.add("Jack");
		employeeNames.add("Bill");
		
		// Added five entries to ids
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		// Filled list with ids values as keys and employeeNames values as the values of the map
		for (Integer val : ids) {
			employeeMap.put(val, employeeNames.get(i));
			i++;		
		}
		
		// Created a set to go through map to print out
		Set<Integer> employeeKey = employeeMap.keySet();
		
		// Printing key-value pair of employeeMap
		for (Integer key : employeeKey) {
			System.out.println(key + " : " + employeeMap.get(key));
		}
		
		// StringBuilder will be used to create a string of all ids
		StringBuilder idsBuilder = new StringBuilder();
		
		// Loop through each id element and append each id followed by a dash
		for (Integer val : ids) {
			idsBuilder.append(val + "-");
		}
		
		// Print result of loop to screen
		System.out.println(idsBuilder.toString());
		
		// StringBuilder will be used to create a string of all employeeNames
		StringBuilder namesBuilder = new StringBuilder();
		
		// Loop through each employeeName element and append each id followed by a space
		for (String val : employeeNames) {
			namesBuilder.append(val + " ");
		}
		
		// Print result of loop to screen
		System.out.println(namesBuilder.toString());
	}

}
