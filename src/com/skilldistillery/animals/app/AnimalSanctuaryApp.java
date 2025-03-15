package com.skilldistillery.animals.app;

import java.util.Scanner;

import com.skilldistillery.animals.entities.*;

public class AnimalSanctuaryApp {

	private Scanner sc;
	private Sanctuary sanctuary;
	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}
	
	private void launchApp() {
	 sc = new Scanner(System.in);
	 sanctuary = new Sanctuary(); 
	 
	 
	 boolean keepGoing = true;
	 String selection;
	 
	 while (keepGoing) {
		 System.out.println("a. List of animals");
		 System.out.println("b. Add a new animal");
		 System.out.println("c. Start the attendants rounds");
		 System.out.println("d. Quit");
		selection = sc.next();
		
		switch(selection ) {
		case "a": {
			sanctuary.listAnimals();
			continue;
		}
		case "b": { 
			System.out.println("What is the name of the animal? ");
			String name = sc.next();
			System.out.println("What kind of animal do you have? ");
			System.out.println(" 1. Cow ");
			System.out.println(" 2. Lion ");
			System.out.println(" 3. Duck ");
			String kindSelect = sc.next();
			
			switch(kindSelect) {
			case "1.": {
				Cow addAnimal = new Cow(name);
				sanctuary.addAnimal(addAnimal);
				break;
			}
			case "2.": {
				Lion addAnimal = new Lion(name);
				sanctuary.addAnimal(addAnimal);
				break;
			}
			case "3.": {
				Duck addAnimal = new Duck(name);
				sanctuary.addAnimal(addAnimal);
				break;
			}
			default: System.out.println("Not Valid");
			}
			continue;
		}
		case "c": {
			sanctuary.startAttendantRounds();
			continue;
		}
		case "d": {
			keepGoing = false;
			break;
		}
		}
	
		
		//try selections with if, if else and else
		

	
		 
		 
	 }
		
	 
	 
	 
	 
	 
		// TODO Instantiate a Sanctuary
		// TODO Instantiate an Attendant
		// TODO Add attendant to Sanctuary
		// TODO Create and add animals to Sanctuary
		// TODO Have sanctuary lists animals
		// TODO Tell sanctuary to start attendant rounds
	}
	
	//In launchApp:
	//Assign a new Sanctuary object to the field.

	//Assign a new Scanner object to the field.

	//In a loop, display a menu with options to:

	//List the animals by calling the sanctuary's listAnimals method.
	//Add a new animal
	//This will prompt the user to choose which subtype.
	//When the user chooses the type, construct that type of animal and add it to the sanctuary.
	//Prompt the user for the animal's name, and assign the name to the animal.
	//Add the animal to the sanctuary by passing it to the sanctuary's addAnimal method.
	//Start the attendant's rounds.
	//Quit.

}
