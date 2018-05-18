
package com.rcdts.utld;

import java.util.Arrays;
import java.util.List;

import com.rcdts.utld.inter.exception.ScoreInputException;

public class LeagueScoreApp {

	

	/**
	 * 
	 * @param args
	 * 
	 */

	public static int totalScore = 0;

	public int getTotalScore() {
		return totalScore;
	}

	public static void main(String[] args)throws Exception {

		// TODO Auto-generated method stub
		try {
		
		List<String> listArgs = Arrays.asList(args);
		StringBuilder builder = new StringBuilder();
		
		listArgs.forEach(eachargs-> {
			
			builder.append(eachargs.trim());
		});
	
		System.out.println("Your Arguments:" + builder.toString());
		
		totalScore = new ScoreProcessor().processScoreToPoints(builder.toString());
		
		System.out.println("Total Score:" + totalScore);
		
		}catch(Throwable e)
		{
			 
		}

	}

	



}
