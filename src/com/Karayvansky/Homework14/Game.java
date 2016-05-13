package com.Karayvansky.Homework14;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Statistics statistics = new Statistics();
		Scanner sc = new Scanner(System.in);

		System.out.println("Game started...");
		Player playerX = new Player("Ivanov", "Ivan", "Petrovich", 25, 'X');
		Player playerO = new Player("Petrov", "Petr", "Petrovich", 35, 'O');
		Board board = new Board(playerX, playerO);
		board.printBoard();
		System.out.println("Click any button");
		String input = sc.next();
		while (!board.gameFinished()) {
			System.out.println();
			System.out.println("Player " + board.getCurrentPlayer() + "!" + " Moves...");
			System.out.print("Enter yout move: ");

			String move = sc.next();
			if (!board.makeMove(move)) {
				System.out.println("Input was incorect.Select your move. ");
			}
			board.printBoard();
		}
		System.out.println();
		// System.out.println("Winner is " + board.calculateWinner());
		sc.close();
		GameResult resultWinner = new GameResult(board.calculateWinner(), "win");
		GameResult resultLoser = new GameResult(board.calculateLoser(), "lost");
		statistics.addResult(resultWinner);
		statistics.addResult(resultLoser);
		statistics.printStatistics();
		// input = sc.next();
	}

}
