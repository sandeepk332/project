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
		
		if(!validate(scoreList))throw new ScoreInputException(Constants.ERROR_MESSAGE); ;


		scoreList.stream().filter(eachStrScore -> eachStrScore.endsWith(Constants.HOME))
				.forEach(eachStrScore -> scoreCalculatorImpl.scoreCalculatorRCDTSUtld.calculateScore( eachStrScore));

		
		
		return scoreCalculatorImpl.getTotalScore();

	}
	
		

	public boolean validate(List<String> list) {
		
		boolean isValid = true;
		int firstPart = 0;
		int secondPart = 0;
		if(list == null || list.isEmpty()) {
			isValid = false;
		} else {
		//blank value
		for(String s : list) 
		{
		if (s.length()== 0) {
			isValid = false;
			break;
		}
		if(!(s.endsWith(Constants.AWAY) || s.endsWith(Constants.HOME))) {
			isValid = false;
			break;
		}
		// single value
		if(s.contains(Constants.SPLIT)) {
		
			String[] parts = s.split(Constants.SPLIT);
			if(parts.length > 1 ) {
				
				
				try {
				
				String secondScore = parts[1].replaceFirst(".$","");
				
				firstPart = Integer.parseInt(parts[0].trim());
				secondPart = Integer.parseInt(secondScore.trim());
				}catch(NumberFormatException nfe) {
					isValid = false;
					nfe.printStackTrace();
					
				}
				
			}
			
			
		}
		
		} 
		}//else
		  return isValid;

		
	}
	
}
