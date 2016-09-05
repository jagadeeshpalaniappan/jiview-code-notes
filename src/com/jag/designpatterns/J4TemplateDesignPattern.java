package com.jag.designpatterns;

abstract class Game {

	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// template method
	public final void play() {

		// initialize the game
		initialize();
		// start game
		startPlay();
		// end game
		endPlay();
	}
}

class Cricket extends Game {

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized!");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started!!");
	}
}

class Football extends Game {

	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Football Game Initialized!");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started");
	}
}

public class J4TemplateDesignPattern {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		/*
		Cricket Game Initialized!
		Cricket Game Started!!
		Cricket Game Finished!
		*/
	
		System.out.println();
		
		
		game = new Football();
		game.play();
		
		/*
		Football Game Initialized!
		Football Game Started
		Football Game Finished!
		*/
		
		
	}

}
