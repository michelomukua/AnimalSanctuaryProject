package com.skilldistillery.animals.entities;

public class Duck extends Animal {
	private static String noise = "Quack";
	public Duck(String name) {
		super(name);
	}

	
	public void makeNoise() {
		System.out.println(noise);
		
		}
	public void eat(int amount){
		makeNoise();
		System.out.println("I am pecking on " +amount + " delicious sadines");
	}
	
	{
		
	}
}

