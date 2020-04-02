package com.lao.javaLearning;


//Parametrized constructor

public class Animal {


	String animal_Name;
	String animal_Type;

	Animal(String name,String type){

		animal_Name=name;
		animal_Type=type;	
	}
	public void sayAboutAnimal() {
		System.out.println("Animal Nmae Is " + animal_Name + "Animal Type Is " + animal_Type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal1=new Animal("Ken","OmniVores");
		animal1.sayAboutAnimal();
		
		Animal animal2=new Animal("Bear","Omnivores");
		animal2.sayAboutAnimal();
		
		

	}

}
