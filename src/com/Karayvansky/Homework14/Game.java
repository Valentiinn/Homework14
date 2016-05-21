package com.Karayvansky.Homework14;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		System.out.println("Click any button to begin game!");
		Statistics statistics = Statistics.getInstance();
		while (!input().equals("exit")) {
			Board board = board();
			printBoard(board);
			while (!board.gameFinished()) {
				outMove(board);
			}
			outWinner(board);
			resultWinner(board);
			resultLoser(board);
			statistics.addResult(resultWinner(board));
			statistics.addResult(resultLoser(board));
			outGameMenu();
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
		Player playerX = new Human("Ivanov", 'X');
		playerX.setLastName("Ivan");
		// playerX.setType('X');
		return playerX;
	}

	public static Player playerO() {
		Player playerO = new AI("Petrov", 'O');
		playerO.setLastName("Petr");
		// playerO.setType('O');
		return playerO;
	}

	public static Board board() {
		Board board = new Board(playerX(), playerO());
		return board;
	}

	public static void printBoard(Board board) {
		System.out.println("Game started...");
		board.printBoard();
	}

	public static void outMove(Board board) {
		System.out.println();
		System.out.println("Player " + board.getCurrentPlayer() + "!" + " Moves...");
		System.out.println("Enter yout move: ");
		if (!board.makeMove()) {
			System.out.println("Input was incorect.Select your move. ");
		}
		board.printBoard();
	}

	public static void outWinner(Board board) {
		System.out.println();
		System.out.println("Winner is " + board.calculateWinner());
	}

	public static void outGameMenu() {
		System.out.println("Click any button to begin game!");
		System.out.println("If you want to exit the game, print the exit");
		System.out.println("If you want to show statistics, print the stat");
	}

	public static GameResult resultWinner(Board board) {
		GameResult resultWinner = new GameResult(board.calculateWinner(), "winn");
		return resultWinner;
	}

	public static GameResult resultLoser(Board board) {
		GameResult resultLoser = new GameResult(board.calculateLoser(), "lost");
		return resultLoser;
	}

}
