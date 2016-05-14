package com.Karayvansky.Homework14;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		System.out.println("Click any button to begin game!");
		Statistics statistics = new Statistics();
		while (!input().equals("exit")) {
			System.out.println("Game started...");
			Board board = new Board(playerX(), playerO());
			board.printBoard();
			while (!board.gameFinished()) {
				System.out.println();
				System.out.println("Player " + board.getCurrentPlayer() + "!" + " Moves...");
				System.out.print("Enter yout move: ");
				String move = input();
				if (!board.makeMove(move)) {
					System.out.println("Input was incorect.Select your move. ");
				}
				board.printBoard();
			}
			System.out.println();
			System.out.println("Winner is " + board.calculateWinner());
			GameResult resultWinner = new GameResult(board.calculateWinner(), "winn");
			GameResult resultLoser = new GameResult(board.calculateLoser(), "lost");
			statistics.addResult(resultWinner);
			statistics.addResult(resultLoser);
			System.out.println("Click any button to begin game!");
			System.out.println("If you want to exit the game, print the exit");
			System.out.println("If you want to show statistics, print the stat");
			if (input().equals("stat")) {
				System.out.println(statistics);
			}
		}
		System.out.println(statistics);
	}

	public static String input() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		return input;
	}

	public static Player playerX() {
		Player playerX = new Player("Ivanov", "Ivan", "Petrovich", 25, 'X');
		return playerX;
	}

	public static Player playerO() {
		Player playerO = new Player("Petrov", "Petr", "Petrovich", 35, 'O');
		return playerO;
	}

}
