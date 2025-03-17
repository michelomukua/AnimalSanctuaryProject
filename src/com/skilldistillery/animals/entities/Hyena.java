package com.skilldistillery.animals.entities;

public class Hyena extends Animal {
	private static String noise = "Huhuhhwuu";
	public Hyena(String name) {
		super(name);
	}

	
	public void makeNoise() {
		System.out.println(noise);
		
		}
	public void eat(int amount){
		makeNoise();
		System.out.println("I am pecking on " +amount + " delicious steak");
	}
	
	{
		
	}
}