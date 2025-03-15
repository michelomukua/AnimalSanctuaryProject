package com.skilldistillery.animals.entities;

public class Sanctuary {
	private Animal[] animals = new Animal[5];
			private Attendant attendant = new Attendant();
	
	public void setAttendant (Attendant attendant) {
		this.attendant = attendant;
		
	}
	public void listAnimals() {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				System.out.println(" There is no animal in this enclossure");
			}
			else {
				System.out.println(animals[i].getName());
			}
		}
	}
	public void addAnimal(Animal animal) {
		int i= 0; 
		for ( i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;
				return;
			}
			
		}
		System.out.println("We are full");
	}
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
		
	}

}
