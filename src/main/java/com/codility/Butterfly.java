package com.codility;

import com.codility.flyable.Flyable;
import com.codility.walkble.Walkble;

public class Butterfly extends Animal implements Flyable, Walkble {

	private Flyable flyable;

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	@Override
	public void fly() {
		this.flyable.fly();

	}

	@Override
	public void walk() {
		this.walkble.walk();

	}

}
