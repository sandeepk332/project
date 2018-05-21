package com.rcdts.utld.bus;

import com.rcdts.utld.Constants;
import com.rcdts.utld.inter.ScoreCalculator;

public class ScoreCalculatorImpl {
	
	private int totalScore = 0;

	public int getTotalScore() {
		return totalScore;
	}

	public void resetTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public ScoreCalculator scoreCalculatorRCDTSUtld = (  String eachScore) -> {


		String trimSc = eachScore.trim();

		String[] twoScore = trimSc.split(Constants.SPLIT);
		String secondScore = twoScore[1].replaceFirst(".$","");

		int hometeamScore = Integer.parseInt(twoScore[0]);

		int otherteamScore = Integer.parseInt(secondScore);

		if (otherteamScore == hometeamScore) {

			totalScore = totalScore + Constants.DRAW_SCORE;

		}

		else if (otherteamScore < hometeamScore) {

			totalScore = totalScore + Constants.WIN_SCORE;

		}

		return totalScore;

	};

}
