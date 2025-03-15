package com.skilldistillery.animals.entities;

public class Attendant {
	
	public void makeRounds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if (animals [i] == null) {
				System.out.println("Enclossure is empty");
			}
			else {
				System.out.println("I will feed "+animals[i].getName()+ " 5 foods." );
				animals[i].eat(5);
				
			}
		} 
	}
}
