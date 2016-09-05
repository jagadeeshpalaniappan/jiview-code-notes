package com.jag.designpatterns;


interface Fly{
	public String canFly();
}

class ItCanFly implements Fly{

	public String canFly() {
		return "It Can Fly";
	}
	
}


class ItCantFly implements Fly{

	public String canFly() {
		return "It Can't Fly";
	}
	
}


class Animal{
	public Fly fly;
	public Animal(Fly fly) {
		this.fly = fly;
	}
	
	public String tryToFly(){
		return fly.canFly();
	}
}

class Dog extends Animal{

	public Dog(Fly fly) {
		super(fly);
	}
	
}

class Bird extends Animal{

	public Bird(Fly fly) {
		super(fly);
	}

}

public class J3StrategyDesignPattern {
	
	public static void main(String[] args) {
		
		Animal animal1 =new Dog(new ItCantFly());
		Animal animal2 = new Bird(new ItCanFly());
		
		System.out.println(animal1.tryToFly());	//It can't fly
		System.out.println(animal2.tryToFly());	//It can fly
		
		
	}
	
}
