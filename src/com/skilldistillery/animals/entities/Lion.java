package com.skilldistillery.animals.entities;

public class Lion extends Animal {
	private static String noise ="ROARR";
	
	public void makeNoise() {
		System.out.println(noise);
	}

	public void eat(int amount) {
		makeNoise();
		System.out.println("I am munching on " +amount + " ribs");
	}
}
