package com.bridgelabz.Tic.Tac.Toy.Game;

import java.util.Scanner;

public class TicTacToyGame {
	// Declaring and Assigning Variables As a Globally
	public static char[] element;
	public static char playerLetter, computerLetter;

	public static void main(String[] args) {
		// TO call a Method in Main method
		boardCreation();
		playerChoose();

	}

	private static void boardCreation() {
		element = new char[10];
		for (int i = 0; i < 10; i++) {
			element[i] = ' ';
		}

	}

	// Create static method for Board Creation
	private static void playerChoose() {
		System.out.println("choose 1 for 'X' choose 2 for 'O' ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		// choose option for player
		switch (option) {
		case 1:
			playerLetter = 'X';
			computerLetter = 'O';
			System.out.println("player Choosing: " + playerLetter);
			System.out.println("Computer Choosing: " + computerLetter);
			break;

		case 2:
			playerLetter = 'O';
			computerLetter = 'X';
			System.out.println("player Choosing: " + playerLetter);
			System.out.println("Computer Choosing: " + computerLetter);
			break;

		default:
			System.out.println("Invalid option");
			playerChoose();

		}
	}
}
