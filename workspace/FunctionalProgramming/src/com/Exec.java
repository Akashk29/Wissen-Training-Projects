package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Exec {
	public static void main(String[] args) {
  
	Employee emp1 = new Employee(1, "Ash", 112343);
	Employee emp2 = new Employee(2, "Brock", 51312);
	Employee emp3 = new Employee(3, "Misty", 4564232);
	
	List<Employee> list = new ArrayList<Employee>();
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	
	ItemsLib handle = new ItemsLib();
	
	List<Employee> list2 = handle.filter(list, e -> e.getSalary()>100000);
	System.out.println(list2);
	List<String> names = handle.map(list, e-> e.getName().toUpperCase());
	System.out.println(names);
    handle.forEach(list, e-> System.out.println("id = " + e.getId() + 
    		                                    "   name = " + e.getName()));	
	
	}
}
