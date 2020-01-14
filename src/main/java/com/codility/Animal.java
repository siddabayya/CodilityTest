package com.codility;

import com.codility.singable.Singable;
import com.codility.swimmable.Swimmable;
import com.codility.walkble.Walkble;

public class Animal {

	protected Walkble walkble;
	protected Singable singable;
	protected Swimmable swimmable;

	public Walkble getWalkble() {
		return walkble;
	}

	public void setWalkble(Walkble walkble) {
		this.walkble = walkble;
	}

	public Swimmable getSwimmable() {
		return swimmable;
	}

	public void setSingable(Singable singable) {
		this.singable = singable;
	}

	public void setSwimmable(Swimmable swimmable) {
		this.swimmable = swimmable;
	}

	public Singable getSingable() {
		return singable;
	}

	public void walk() {
		this.walkble.walk();
	}
}