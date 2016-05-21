package com.Karayvansky.Homework14;

import java.util.Scanner;

public class Human extends Player {

	public Human(String firstName, char type) {
		super(firstName, type);
	}

	public String makeMove() {
		Scanner scanner = new Scanner(System.in);
		String move = scanner.next();
		return move;
	}
}
