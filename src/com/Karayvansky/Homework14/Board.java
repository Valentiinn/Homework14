package com.Karayvansky.Homework14;

import java.util.Arrays;

public class Board {

	private char[][] board = new char[3][3];
	private Player playerX;
	private Player playerO;
	private Player currentPlayer;

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Board(Player playerX, Player playerO) {
		for (int i = 0; i < 3; i++) {
			Arrays.fill(board[i], '|');
		}
		this.playerO = playerO;
		this.playerX = playerX;
		currentPlayer = playerX;
	}

	public void printBoard() {
		System.out.println(" 0 1 2 ");
		System.out.println("");
		int number = -1;
		for (int i = 0; i < 3; i++) {
			number++;
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + board[i][j]);
			}

			System.out.println("   " + number);
		}

	}

	// если currentplayer будет равен "X" elem = O
	// ≈сли currentPlayer будет не "X", то elem будет равен "X"
	public boolean gameFinished() {
		char elem = (currentPlayer.getType() == ('X')) ? 'O' : 'X';
		for (int i = 0; i < 3; i++) {
			if (board[0][i] == elem && board[1][i] == elem && board[2][i] == elem
					|| board[i][0] == elem && board[i][1] == elem && board[i][2] == elem)
				return true;
		}
		if (board[0][0] == elem && board[1][1] == elem && board[2][2] == elem)
			return true;

		if (board[2][0] == elem && board[1][1] == elem && board[0][2] == elem)
			return true;
		return false;
	}

	public boolean makeMove(String move) {
		int x = Character.getNumericValue(move.charAt(0));
		int y = Character.getNumericValue(move.charAt(1));

		if (!isMoveValid(x, y) || !isEmployed(x, y))
			return false;

		board[x][y] = currentPlayer.getType();
		changeCurrentPlayer();

		return true;
	}

	private void changeCurrentPlayer() {
		if (currentPlayer == playerX) {
			currentPlayer = playerO;
		} else {
			currentPlayer = playerX;
		}
	}

	private boolean isMoveValid(int x, int y) {
		if (x > 2 || y > 2 || x < 0 || y < 0) {
			return false;
		}
		return true;
	}



	private boolean isEmployed(int x, int y) {
		if (board[x][y] != '|') {
			return false;
		}
		return true;
	}

	public char calculateWinner() {
		char winner = (currentPlayer.getType() == 'X') ? 'O' : 'X';
		return winner;
	}

	public char calculateLoser() {
		char loser = (currentPlayer.getType() != 'X') ? 'O' : 'X';
		return loser;
	}
//	public void winner() {
//		if (gameFinished()) {
//			char winner = (currentPlayer.getType() == 'X') ? 'O' : 'X';
//			System.out.println("The winner is " + winner + " !!!");
//		}
//	}
}
