package com.Karayvansky.Homework14;

import java.util.Scanner;

public class Human extends Player {

	// public Human(String firstName, String lastName, String middleName, int
	// age, char type) {
	// super(firstName, lastName, middleName, age, type);
	// }

	public String makeMove() {
		Scanner scanner = new Scanner(System.in);
		String move = scanner.next();
		return move;
	}
}
