package com.lao.javaLearning;

						//How to create a object for a class


public class BankAccount {

	//	Long accountNumber=1234567890l;
	//
	//	String holderName="Godwin";
	//
	//	Integer Amount=1500;


	long accountNumber=1234567890;

	String holderName="Godwin";

	int amount=1500;




	public void getBalance() {

		System.out.println("Account Balance is " + amount);

	}

	public void getName() {
		System.out.println("Account Name Is " + holderName);
	}


	public void getAccountNumber() {
		System.out.println("Account Number Is " + accountNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		BankAccount account=new BankAccount();
		account.getBalance();
		account.getName();
		account.getAccountNumber();







	}

}
