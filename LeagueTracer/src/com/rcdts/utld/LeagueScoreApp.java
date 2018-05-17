
package com.rcdts.utld;






public class LeagueScoreApp {

	

	/**
	 * 
	 * @param args
	 * 
	 */

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {

		new ScoreProcessor().processScoreToPoints("4-1A, 2-1H, 1-1H");
		
		}catch(Throwable e)
		{
			 
		}

	}

	

//	
//
//	interface ScoreSplitter {
//
//		public String[] getEachScoreFromInput(String allScores);
//
//	};
//
//	ScoreSplitter scoreSplitter = (String argument) -> {
//
//		String[] eachScore = argument.split(",");
//
//		return eachScore;
//
//	};
//
//	interface ScoreCalculator {
//
//		public int calculateScore(int previousTotalScore, String eachScore);
//
//	}
//
//	ScoreCalculator scoreCalculatorRCDTSUtld = (int previousTotalScore, String eachScore) -> {
//
//		System.out.println("in loop:" + previousTotalScore);
//
//		System.out.println("in loop each:" + eachScore);
//
//		totalScore = previousTotalScore;
//
//		String trimSc = eachScore.trim();
//
//		String[] twoScore = trimSc.split("-");
//
//		int hometeamScore = Integer.parseInt(twoScore[0]);
//
//		int otherteamScore = Integer.parseInt(twoScore[1].substring(0, 1));
//
//		if (otherteamScore == hometeamScore) {
//
//			totalScore = totalScore + draw_score;
//
//		}
//
//		else if (otherteamScore < hometeamScore) {
//
//			totalScore = totalScore + win_score;
//
//		}
//
//		return totalScore;
//
//	};

	

	/**
	 * 
	 * @param args
	 * 
	 */

	// TODO Auto-generated method stub

}
