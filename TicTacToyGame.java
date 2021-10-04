package com.bridgelabz.Tic.Tac.Toy.Game;

public class TicTacToyGame {
	// Declaring and Assigning Variables As a Globally
	public static char[] element;

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toy Game");
		// TO call a Method in Main method
		boardCreation();

	}

	private static void boardCreation() {
		element = new char[10];
		for (int i = 0; i < 10; i++) {
			element[i] = ' ';
		}

	}
}
