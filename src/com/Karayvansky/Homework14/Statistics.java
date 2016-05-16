package com.Karayvansky.Homework14;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

	private List<GameResult> results = new ArrayList<GameResult>();

	public void addResult(GameResult result) {
		results.add(result);
	}

	public String toString() {
		String printRes = "";
		for (int i = 0; i < results.size(); i++) {
			GameResult gameResult = results.get(i);
			printRes += gameResult.toString() + '\n';
		}
		return printRes;
	}

	// public String toString() {
	// String printRes = "";
	// for (GameResult gameResult : results) {
	// printRes += gameResult.toString() + '\n';
	// }
	// return printRes;
	// }
}
