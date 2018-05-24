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
		String awayOrHome = twoScore[1].endsWith(Constants.AWAY)?Constants.AWAY:Constants.HOME;
		
		if(Constants.HOME.equals(awayOrHome)) {
			
			String secondScore = truncateHorAfromScoreForParsing(twoScore[1]);
	
			int hometeamScore = Integer.parseInt(twoScore[0]);
	
			int otherteamScore = Integer.parseInt(secondScore);
	
			if (otherteamScore == hometeamScore) {
	
				totalScore = totalScore + Constants.DRAW_SCORE;
	
			}
	
			else if (otherteamScore < hometeamScore) {
	
				totalScore = totalScore + Constants.WIN_SCORE;
	
			}
		}else {//away team
			
			String secondScore = truncateHorAfromScoreForParsing(twoScore[1]);
			
			int otherteamScore = Integer.parseInt(twoScore[0]);
	
			int rcdtsScore = Integer.parseInt(secondScore);
	
			if (otherteamScore == rcdtsScore) {
	
				totalScore = totalScore + Constants.DRAW_SCORE;
	
			}
	
			else if (otherteamScore < rcdtsScore) {
	
				totalScore = totalScore + Constants.WIN_SCORE;
	
			}
			
			///
		}

		return totalScore;

	};
	
	private String truncateHorAfromScoreForParsing(String score) {
		
		return score.replaceFirst(".$","");
	}

}
