package com.lao.conditional_statements;

public class WhoIsTheHero {
	
	String myHeroName="Captain America";
	
	public void superHeroGusser(){
		
		if(myHeroName.equals("Iron Man"))
			System.out.println("you thought about iron man");
		else if(myHeroName.equals("Super Man"))
		System.out.println("you thought about Super Man");
		else if(myHeroName.equals("Thor"))
			System.out.println("you thought about thor");
		else {
			System.out.println("Sorry i cant guess!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WhoIsTheHero hero=new WhoIsTheHero();
		hero.superHeroGusser();
		
	}

}
