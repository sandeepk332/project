package com.rcdts.utld;

import java.util.Arrays;
import java.util.List;

import com.rcdts.utld.bus.ScoreCalculatorImpl;
import com.rcdts.utld.bus.ScoreSplitterImpl;
import com.rcdts.utld.inter.*;
import com.rcdts.utld.inter.exception.ScoreInputException;

public class ScoreProcessor {
	
	
	
	public int processScoreToPoints(String allScore) throws ScoreInputException {

		
		ScoreCalculatorImpl scoreCalculatorImpl= new ScoreCalculatorImpl();
		ScoreSplitterImpl scoreSplitterImpl = new ScoreSplitterImpl();

		String[] eachScoreArray = scoreSplitterImpl.scoreSplitter.getEachScoreFromInput(allScore);

		List<String> scoreList = Arrays.asList(eachScoreArray);

		scoreList.forEach(inputScore -> validate.validateScore(inputScore));

		scoreList.stream().filter(eachStrScore -> eachStrScore.endsWith(Constants.HOME))
				.forEach(eachStrScore -> scoreCalculatorImpl.scoreCalculatorRCDTSUtld.calculateScore( eachStrScore));

		
		
		return scoreCalculatorImpl.getTotalScore();

	}
	
	
	
	interface Validate {
		public boolean validateScore(String s);
	};

	Validate validate = (String s) ->

	{

	

		return true;

	};
	

	
}
