package com.skilldistillery.animals.entities;

import java.util.Random;

public class Attendant {
	
	public void makeRounds(Animal[] animals) {
		Random random = new Random();
		System.out.println("I love taking care of my Animal friends");
		for (int i = 0; i < animals.length; i++) {
			if (animals [i] != null) {
				int amount = random.nextInt(10);
				System.out.println("I will feed "+ animals[i].getName() + "  " + amount );
				animals[i].eat(amount);
			}
			else {
				System.out.println("This enclossure is empty");
				
			}
		} 
	}
}
