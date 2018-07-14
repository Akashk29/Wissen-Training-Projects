package com.em.hr;

import com.em.emp.Employee;

public class HR {
	
public static void manageEmployees() {
	
  Employee.tnrName = "Nigga";	
	
  Employee e1 = new Employee();	
  e1.empName = "Goku";
  e1.empId = 1;
  
  Employee e2 = new Employee();
  e2.empName = "Vegeta";
  e2.empId = 2;
  
  Employee.doTeach();
  
  e1.doListenAndWork();
  e2.doListenAndWork();
	
	
}
}
