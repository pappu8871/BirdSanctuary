package com.bridgelabz.birdsanctuary;

public  class Parrot extends Birds implements Flyable{
	static int count;
	public String color;

	public Parrot(String id){
		this.id = id;
		colour = Colour.GREEN;
	}

	@Override
	public String toString() {
		return "Parrot [id=" + id + ", colour=" + colour + "]";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(id + " is eating  ");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println( id + " is flying");
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
