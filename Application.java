package com.bridgelabz.birdsanctuary;

public class Application {

	public static void main(String[] args) throws BirdSanctuaryException {
		System.out.println("Welcome To Bird Sanctuary:");

		BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();

		Parrot parrot1 = new Parrot("p1");
		Parrot parrot2 = new Parrot("p2");
		Parrot parrot3 = new Parrot("p3");
		Parrot parrot4 = new WhiteParrot("p4"); 

		Duck duck1 = new Duck("d1");
		Duck duck2 = new Duck("d2");
		Duck duck3 = new Duck("d3");

		Penguin penguin1 = new Penguin("pn1");
		Penguin penguin2 = new Penguin("pn2");
		Penguin penguin3 = new Penguin("pn3");

		try {
			birdSanctuaryManager.add(parrot1);   
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(parrot2);   
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(parrot3);   
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(parrot4);   
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		birdSanctuaryManager.remove(parrot3);

		try {
			birdSanctuaryManager.add(duck1);   
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(duck2);   
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(duck3);   
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(penguin1);   
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(penguin2);   
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(penguin3);   
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(null);
		} catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}

		birdSanctuaryManager.print();

		birdSanctuaryManager.printFlyable();
		birdSanctuaryManager.printSwimmable();
		birdSanctuaryManager.printEatable();

		System.out.println("Parrot Count:" +Parrot.count);
		System.out.println("Duck Count:" +Duck.count);
		System.out.println("Penguin Penguin:" +Duck.count);

		System.out.println("Total Birds:" + Birds.totalCount);

	}
}
