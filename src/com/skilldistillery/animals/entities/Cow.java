package com.skilldistillery.animals.entities;

public class Cow extends Animal {
	private static String noise = "Moo";
	
	public Cow(String name) {
		super(name);
	}

	
	public void makeNoise() {
	System.out.println(noise);
	}

	public void eat(int amount) {
		makeNoise();
		System.out.println("I am chewing on " +amount + " bale of hay");
		
	}
}
