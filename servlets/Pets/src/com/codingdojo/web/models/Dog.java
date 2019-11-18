package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{
	
	
	public Dog(String name, String breed, String weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	public String showAffection() {
		return "Dog affection";
	}
}
