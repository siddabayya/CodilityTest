package com.codility;

import java.util.Locale;

import com.codility.flyable.FlyAction;
import com.codility.flyable.Flyable;
import com.codility.flyable.NoFlyAction;
import com.codility.singable.CluckAction;
import com.codility.singable.DoodleAction;
import com.codility.singable.IntlRoosterAction;
import com.codility.singable.MeowAction;
import com.codility.singable.QuackAction;
import com.codility.singable.Singable;
import com.codility.singable.WoofAction;
import com.codility.swimmable.NoSwimAction;
import com.codility.swimmable.SwimAction;
import com.codility.swimmable.Swimmable;
import com.codility.walkble.NoWalkAction;
import com.codility.walkble.WalkAction;
import com.codility.walkble.Walkble;

public class Solution {
	public static void main(String[] args) {

		// 2) we have 2 special kinds of birds: the Duck and the Chicken.

		System.out.println("Duck");
		// a. A duck says: �Quack, quack�
		// b. A duck can swim
		Bird duck = new Duck();
		duck.setFlyable(new FlyAction());
		duck.setSingable(new QuackAction());
		duck.setSwimmable(new SwimAction());
		duck.walk();
		duck.fly();
		duck.sing();
		duck.swim();

		System.out.println("Chicken");
		// c. A chicken says: �Cluck, cluck�
		// d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
		Bird chicken = new Chicken();
		chicken.setFlyable(new NoFlyAction());
		chicken.setSingable(new CluckAction());
		chicken.setSwimmable(new NoSwimAction());
		chicken.walk();
		chicken.fly(); // No Fly
		chicken.sing();
		chicken.swim();

		// 3) Now how would you model a rooster?
		System.out.println("Rooster");
		// a. A rooster says: �Cock-a-doodle-doo�
		// b. How is the rooster related to the chicken?
		// c. Can you think of other ways to model a rooster without using inheritance?

		Rooster rooster = new Rooster();
		rooster.setSingable(new DoodleAction());
		rooster.sing();

		// 4. Can you model a parrot? We are specifically interested in three parrots,
		// one that
		// lived in a house with dogs one in a house with cats, the other lived on a
		// farm next to
		// the rooster
		System.out.println("Parrot");

		// a. A parrot living with dogs says: �Woof, woof�
		Bird parrotWithDogs = new Parrot();
		parrotWithDogs.setSingable(new WoofAction());
		parrotWithDogs.sing();

		// b. A parrot living with cats says: �Meow�
		Bird parrotWithCats = new Parrot();
		parrotWithCats.setSingable(new MeowAction());
		parrotWithCats.sing();

		// c. A parrot living near the rooster says: �Cock-a-doodle-doo�
		Bird parrotWithRooster = new Parrot();
		parrotWithRooster.setSingable(new DoodleAction());
		parrotWithRooster.sing();

		// d. How do you keep the parrot maintainable? What if we need another parrot
		// lives near a Duck? Or near a phone that rings frequently?
		Bird parrotWithDuck = new Parrot();
		parrotWithDuck.setSingable(new CluckAction());
		parrotWithDuck.sing();

		// B. Model fish as well as other swimming animals
		System.out.println("Fish");

		// 1. In addition to the birds, can you model a fish?
		// a. Fishes don�t sing
		// b. Fishes don�t walk
		// c. Fishes can swim

		Fish shark = new Shark();
		// shark.sing(); // No sing
		// shark.walk(); // No walk
		shark.swim();
		// a. Sharks are large and grey
		// d. Sharks eat other fish
		shark.genre();

		Fish clownfish = new Clownfish();
		// clownfish.sing(); // No sing
		// clownfish.walk(); // No walk
		clownfish.swim();
		// c. Clownfish make jokes
		// b. Clownfish are small and colorful (orange)
		clownfish.genre();

		System.out.println("Dolphin");
		// 3. Dolphins are not exactly fish, yet, they are good swimmers
		Dolphin dolphin = new Dolphin();
		dolphin.setSwimmable(new SwimAction());
		dolphin.swim();

		// D. Model animals that change their behavior over time
		System.out.println("Butterfly");
		// 1. Can you model a butterfly?
		// a. A butterfly can fly
		// b. A butterfly does not make a sound
		Butterfly butterfly = new Butterfly();
		butterfly.setFlyable(new FlyAction());
		butterfly.setWalkble(new NoWalkAction());
		butterfly.fly();
		butterfly.walk(); // No Walk

		// Change their behavior over time
		// a. A caterpillar cannot fly
		// b. A caterpillar can walk (crawl)

		butterfly.setFlyable(new NoFlyAction());
		butterfly.setWalkble(new WalkAction());
		butterfly.fly(); // No fly
		butterfly.walk();

		// E. Counting animals
		System.out.println("Counting by behavior");

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Shark(), new Clownfish(), new Dolphin(), new Butterfly() };

		int flyCount = 0;
		int walkCount = 0;
		int swimCount = 0;
		int singCount = 0;

		for (Animal animal : animals) {

			if (animal instanceof Flyable) {
				flyCount++;
			} 
			if(animal instanceof Walkble) {
				walkCount++;
			}
			if(animal instanceof Swimmable) {
				swimCount++;
			}
			if(animal instanceof Singable) {
				singCount++;
			}

		}
		
		System.out.println("flyCount= "+ flyCount + " walkCount= "+ walkCount + " swimCount= "+ swimCount + " singCount= "+ singCount );
		
		// BONUS
		// 1. Can you add a second language  
		System.out.println("Internationalizing Rooster Sing");
		
		IntlRoosterAction intlSingAction = new IntlRoosterAction();
		
		rooster = new Rooster();
		rooster.setSingable(intlSingAction);
		rooster.sing();  // Default en_US
		
		intlSingAction.setaLocale(new Locale("da", "DK")); // Danish
		rooster.sing();
		
		intlSingAction.setaLocale(new Locale("fr", "FR")); // French
		rooster.sing();
		

	}
}
