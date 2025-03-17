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
	
	
	
	 String option = "s";
	 
	  while (!option.equals("d")) {
		 System.out.println("Select the option from the menu");
		 System.out.println("a. List of animals");
		 System.out.println("b. Add a new animal");
		 System.out.println("c. Start the attendants rounds");
		 System.out.println("d. Quit");
		 
		option = sc.nextLine();
		
		if (option.equals("a") ) {
			sanctuary.listAnimals();
			}else if(option.equals("b")) {
				addAnimal();
			}else if(option.equals("c")) {
				sanctuary.startAttendantRounds();
			}
			else if(option.equals("d")) {
				System.out.println("Exiting Sanctuary App");
			}
			else {
				System.out.println("Invalid menu choice!");
			}
			
			System.out.println(" ");}
		}
	
	 private void addAnimal() {		
			
			System.out.println("Select the type of animal to add :");
			System.out.println("a. Cow");
			System.out.println("b. Lion");
			System.out.println("c. Duck");
			System.out.println("d. Gorilla");
			System.out.println("e. Hyena");
			
			String choice = sc.nextLine();
			System.out.println("What is the name of the animal :");
			
			String name = sc.nextLine();	
			
			if(choice.equals("a")) {
				Cow cow = new Cow(name);
				cow.setName(name);
				sanctuary.addAnimal(cow);
			}else if(choice.equals("b")) {
				Lion lion = new Lion(name);
				lion.setName(name);
				sanctuary.addAnimal(lion);
			}else if(choice.equals("c")) {
				Duck duck = new Duck(name);
				duck.setName(name);
				sanctuary.addAnimal(duck);
			}else if(choice.equals("d")) {
				Gorilla gorilla = new Gorilla(name);
				gorilla.setName(name);
				sanctuary.addAnimal(gorilla);
			}else if(choice.equals("e")) {
				Hyena hyena = new Hyena(name);
				hyena.setName(name);
				sanctuary.addAnimal(hyena);
			}else {
				System.out.println("Invalid animal choice!");
			}
			
			System.out.println(" ");
			
		}
	 }

	
	 
