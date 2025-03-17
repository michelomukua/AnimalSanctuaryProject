package com.skilldistillery.animals.entities;

public class Gorilla extends Animal {
	private static String noise = "Grrrrr";
	public Gorilla(String name) {
		super(name);
	}

	
	public void makeNoise() {
		System.out.println(noise);
		
		}
	public void eat(int amount){
		makeNoise();
		System.out.println("I am pecking on " +amount + " bamboo");
	}
	
	{
		
	}
}