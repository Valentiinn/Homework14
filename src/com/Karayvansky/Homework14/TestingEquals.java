package com.Karayvansky.Homework14;

public class TestingEquals {

	public static void main(String[] args) {
		Player player1 = new Human("Ivan", 'O');
		player1.setLastName("Ivanov");
		Player player2 = new Human("Ivan", 'O');
		player2.setLastName("Ivanov");
		System.out.println("Equals test:");

		if (player1.equals(player2)) {
			System.out.println("Players are equals");
		} else {
			System.out.println("Players are not equals");
		}

	}
}
