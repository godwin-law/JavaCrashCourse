package com.lao.javaLearning;



									//Return Type

public class CollectAmount {
	
	/*
	 * public Integer Amount=1000;
	 * 
	 * public void collectAmountMySon() {
	 * 
	 * System.out.println("Amount collected"+Amount);
	 */
	public Integer CollectedAmount=1000;
	
	public Integer collectAmountMySon() {
		
		System.out.println("Amount Collected "+CollectedAmount);
		
		return CollectedAmount;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectAmount mySon=new CollectAmount();
		Integer amount=mySon.collectAmountMySon();
		System.out.println("Got Amount MySon "+amount);

	}

}
