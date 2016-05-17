package com.Karayvansky.Homework14;

import java.util.Random;

public class AI extends Player {

	// public AI(String firstName, String lastName, String middleName, int age,
	// char type) {
	// super(firstName, lastName, middleName, age, type);
	//
	// }

	public String makeMove() {
		Random rnd = new Random();
		int x = rnd.nextInt(3);
		int y = rnd.nextInt(3);
		return String.valueOf(x) + String.valueOf(y);
	}
}
