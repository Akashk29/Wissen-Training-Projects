package com.em.emp;

import java.lang.*;

public class Employee {

	//A. STATE DEFINITIONS

	// 1. class state
	public static final String COMP_NAME = "wissen"; // constant
	public static String tnrName; // available to all, but NOT constant

	// 2. instance state
	public int empId;
	public String empName;
	public double empSalary = 1000.0;

	//B. CONSTRUCTORS
	public Employee() {}
	
	//C. BEHAVIOR
	
	//1. class behavior 
	public static void doTeach() {
		System.out.println("Employee :: doTeach()");
	}
	
	//2. instance behavior
	public void doListenAndWork() {
		System.out.println("emp" + this.empName + " :: doListenAndWork()");
	}
	
	//D. INNER TYPES
	

}
