package com.codingdojo.web.models;

public class Cat extends Animal implements Pet {

	

	public Cat(String name, String breed, String weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	public String showAffection() {
		return "Dog affection";
	}
}
