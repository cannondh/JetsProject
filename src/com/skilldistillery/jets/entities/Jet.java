package com.skilldistillery.jets.entities;

public abstract class  Jet {
	
	private String model;
	
	
	//maybe create an abstract method. every jet would have to override
	//and in doing so you can do a sysout of toString + " is flying"
	public void fly() {
		System.out.println(" is now flying!");
	}

}
