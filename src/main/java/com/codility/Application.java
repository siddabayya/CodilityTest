package com.codility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codility.flyable.FlyAction;
import com.codility.singable.QuackAction;
import com.codility.swimmable.SwimAction;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @RequestMapping("/solution")
    public Animal animal(@RequestParam(value="name", defaultValue="bird") String name) {
    	
    	Animal animal = null;
    	if(name.equals("duck")) {
    		Bird duck = new Duck();
    		duck.setFlyable(new FlyAction());
    		duck.setSingable(new QuackAction());
    		duck.setSwimmable(new SwimAction());
    		duck.walk();
    		duck.fly();
    		duck.sing();
    		duck.swim();
    		animal = duck;
    	} else if(name.equals("shark")) {
    		Fish shark = new Shark();
    		shark.swim();
    		shark.genre();
    		animal = shark;
    	} else {
    		Bird bird = new Bird();
    		animal = bird;
    	}
        return animal;
    }
}
