package com.codility;

import com.codility.flyable.Flyable;
import com.codility.singable.Singable;
import com.codility.swimmable.Swimmable;
import com.codility.walkble.WalkAction;
import com.codility.walkble.Walkble;

class Bird extends Animal {

	protected Flyable flyable;

	Bird() {
		this.walkble = new WalkAction();
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public Flyable getFlyable() {
		return flyable;
	}
	
	public void sing() {
		this.singable.sing();
	}

	public void swim() {
		this.swimmable.swim();
	}

	public void fly() {
		this.flyable.fly();
	}
}

class Duck extends Bird implements Swimmable, Singable, Flyable, Walkble {

}

class Chicken extends Bird implements Swimmable, Singable, Walkble {

}

class Rooster extends Animal implements Singable, Walkble {
	public Singable singable;

	public void setSingable(Singable singable) {
		this.singable = singable;
	}

	@Override
	public void sing() {
		this.singable.sing();
		
	}
}

class Parrot extends Bird implements Singable, Flyable, Walkble {

}
