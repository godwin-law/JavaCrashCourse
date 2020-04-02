package com.lao.javaLearning;

public class Student {

						//Default Constructor
	

	String student_Name;  //String is a class so class returns null value

	Integer rollNumber; //integer is a class so class returns null value

	int rollNum; // int is a primitive data type it will returns zero

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student=new Student();
		System.out.println(student.student_Name);
		System.out.println(student.rollNumber);
		System.out.println(student.rollNum);
	}

}
