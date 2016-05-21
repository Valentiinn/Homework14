package com.Karayvansky.Homework14;

public class TestingGameResult {

	public static void main(String[] args) {

		Player player1 = new Human("Ivan", 'O');
		player1.setLastName("Ivanov");
		Player player2 = new Human("Ivan", 'O');
		player2.setLastName("Ivanov");
		System.out.println("Equals test:");
		Board board = new Board(player1, player2);
		GameResult gameResult1 = new GameResult(player1, "winn");
		GameResult gameResult2 = new GameResult(player1, "winn");
		if (gameResult1.equals(gameResult2)) {
			System.out.println("GameResult are equals");
		} else {
			System.out.println("GameResult are not equals");
		}
	}

}
