package com.codingdojo.web.models;

public class Animal {
	private String name;
	private String breed;
	private String weight;
	Animal(String name, String breed, String weight) {
		setName(name);
		setBreed(breed);
		setWeight(weight);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String greeting(){
        return "Hello! My name is " + name + ". and I am " + breed + "  and I weigh " + weight;
    }
}
