package com.lao.javaLearning;


//No Argument Constructor  


public class Employee {
	
	int employeeId;
	String employeeName;
	
	
	Employee(){
		
		employeeId=1;
		employeeName="Godwin";
		
		
		System.out.println("Employee object is created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();		

	}

}
