package com.rcdts.utld.bus;

import com.rcdts.utld.Constants;
import com.rcdts.utld.inter.ScoreSplitter;

public class ScoreSplitterImpl {
	
	public ScoreSplitter scoreSplitter = (String argument) -> {

		String[] eachScore = argument.split(Constants.EACH_SCORE_COMMA);

		return eachScore;

	};

}
