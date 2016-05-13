package com.Karayvansky.Homework14;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

	private List<GameResult> results = new ArrayList<GameResult>();

	public void addResult(GameResult result) {
		results.add(result);
	}

	public void printStatistics() {
		for (GameResult res : results) {
			System.out.println(res);
		}
	}
}
