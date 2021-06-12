package com.bridgelabz.birdsanctuary;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BirdSanctuaryExceptionTest {

	@Test
	public void givenBird_IfNull_ShouldThrowBirdSantuaryException() throws BirdSanctuaryException {
		BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
		//Birds bird = new Parrot("pn1");
		Birds bird = new Parrot(null);
		Assertions.assertThrows(BirdSanctuaryException.class,() -> birdSanctuaryManager.add(bird));
	}
}
