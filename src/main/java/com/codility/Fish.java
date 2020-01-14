package com.codility;

import com.codility.swimmable.SwimAction;
import com.codility.swimmable.Swimmable;

abstract class Fish extends Animal implements Swimmable {

	Fish() {
		this.swimmable = new SwimAction();
	}
	
	@Override
	public void swim() {
		this.swimmable.swim();
		
	}
	abstract void genre();
}

class Shark extends Fish {

	@Override
	void genre() {
		System.out.println("We are large and grey & we eat other fish");
	}

	
}

class Clownfish extends Fish {

	@Override
	void genre() {
		System.out.println("We are small and colourful (orange) & we make jokes");

	}
}

class Dolphin extends Animal implements Swimmable {

	@Override
	public void swim() {
		this.swimmable.swim();
	}

}