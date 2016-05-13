package com.Karayvansky.Homework14;

import java.util.Date;

public class GameResult {

	private char player;
	private String result;
	private Date date;

	public GameResult(char player, String result) {
		this.player = player;
		this.result = result;
		this.date = new Date();
	}

}
