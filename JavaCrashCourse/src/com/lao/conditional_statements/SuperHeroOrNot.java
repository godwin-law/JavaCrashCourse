package com.lao.conditional_statements;

public class SuperHeroOrNot {

	String hero="Captain America";

	public void HeroOrNot(){

		switch(hero) {
		case "Iron Man":
			System.out.println("Iron Man Is Super Hero");
			break;
		case "Thor":
			System.out.println("Thor is a super hero");
			break;

		default:
			System.out.println("Hero is not a super hero");
		}	 

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperHeroOrNot hero1=new SuperHeroOrNot();
		hero1.HeroOrNot();
	}

}
