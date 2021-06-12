package com.bridgelabz.birdsanctuary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirdSanctuaryManager extends Throwable  {
	static BirdSanctuaryManager instance;
	Set<Birds> birdList = new HashSet<Birds>();

	BirdSanctuaryManager() {

	}
	static synchronized BirdSanctuaryManager getInstance() {
		if (instance == null) {
			instance  = new BirdSanctuaryManager();
		}
		return instance;
	}
	// public void toyAdd() {
	//	 if (birdList == ToyDuck) {
	//		 
	//	 }
	// }

	public void add(Birds bird) throws BirdSanctuaryException {
		if (bird == null) {
			throw new BirdSanctuaryException();
		} else if(birdList.add(bird)) {
			bird.incrementCount();
			bird.totalCount++;
		}
	}

	public void remove(Birds bird) {
		if(birdList.remove(bird)) {
			bird.decrementConut();
		}
	}

	public void print() {
		for (Birds list: birdList) {
			System.out.println(list);
		}
	}

	public void printFlyable() {
		birdList.stream().filter(bird -> bird instanceof Flyable)
		.collect(Collectors.toList())
		.forEach(bird -> ((Flyable)bird).fly());
	}

	public void printSwimmable() {
		birdList.stream().filter(bird -> bird instanceof Swimmable)
		.map(bird -> (Swimmable) bird).forEach(bird -> bird.swim());
	}

	public void printEatable() {
		birdList.stream().forEach(bird -> bird.eat());
	}
}


