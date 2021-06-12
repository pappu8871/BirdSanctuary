package com.bridgelabz.birdsanctuary;

public class Penguin extends Birds implements Swimmable{
	static int count;
	public Penguin(String id ) {
		this.id = id;
		colour = Colour.BlACK_WHITE;
	}

	@Override
	public String toString() {
		return "Penguin [id=" + id + ", colour=" + colour + "]";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println( id + "is eatting");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println( id +" is Swimming");
	}

	@Override
	public void incrementCount() {
		count++;
	}

	@Override
	public void decrementConut() {
		count--;
	}
}


