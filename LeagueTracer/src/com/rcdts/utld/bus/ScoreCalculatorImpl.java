package com.rcdts.utld.bus;

import com.rcdts.utld.Constants;
import com.rcdts.utld.inter.ScoreCalculator;

public class ScoreCalculatorImpl {
	
	int totalScore = 0;

	public int getTotalScore() {
		return totalScore;
	}

	public void resetTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public ScoreCalculator scoreCalculatorRCDTSUtld = ( int previousScore, String eachScore) -> {

		//System.out.println("in loop:" + previousTotalScore);

		System.out.println("in loop each:" + eachScore);

		//totalScore = previousTotalScore;

		String trimSc = eachScore.trim();

		String[] twoScore = trimSc.split(Constants.SPLIT);

		int hometeamScore = Integer.parseInt(twoScore[0]);

		int otherteamScore = Integer.parseInt(twoScore[1].substring(0, 1));

		if (otherteamScore == hometeamScore) {

			totalScore = totalScore + Constants.DRAW_SCORE;

		}

		else if (otherteamScore < hometeamScore) {

			totalScore = totalScore + Constants.WIN_SCORE;

		}

		return totalScore;

	};

}
