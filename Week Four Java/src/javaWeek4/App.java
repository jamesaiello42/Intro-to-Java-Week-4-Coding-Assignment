package javaWeek4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		int i = 0;
		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeNames.add("James");
		employeeNames.add("John");
		employeeNames.add("Sam");
		employeeNames.add("John");
		employeeNames.add("Bill");
		
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		for (Integer val : ids) {
			employeeMap.put(val, employeeNames.get(i));
			i++;		
		}
		
		Set<Integer> employeeKey = employeeMap.keySet();
		
		for (Integer key : employeeKey) {
			System.out.println(key + " : " + employeeMap.get(key));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for (Integer val : ids) {
			idsBuilder.append(val + "-");
		}
		
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String val : employeeNames) {
			namesBuilder.append(val + " ");
		}
		
		System.out.println(namesBuilder.toString());
	}

}
