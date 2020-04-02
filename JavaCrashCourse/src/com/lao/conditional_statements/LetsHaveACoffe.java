package com.lao.conditional_statements;

public class LetsHaveACoffe {

	boolean isCupEmpty=true;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetsHaveACoffe coffe=new LetsHaveACoffe();

		if(coffe.isCupEmpty) {
			System.out.println("Fill the cup");
		}
		else {
			System.out.println("Drink the coffe");
		}
	}

}
