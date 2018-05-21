package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rcdts.utld.ScoreProcessor;
import com.rcdts.utld.bus.ScoreSplitterImpl;

public class ScoreSplitterTest {

	@Test
	public void testCommaSplittingScore() throws Exception {
		
		String allScore = "1-1H,3-1H";
		
		ScoreSplitterImpl scoreSplitterImpl = new ScoreSplitterImpl();

		String[] eachScoreArray = scoreSplitterImpl.scoreSplitter.getEachScoreFromInput(allScore);
		
		
		assertEquals("Score for arguments should be 1-1H", "1-1H",eachScoreArray[0]);
		assertEquals("Score for arguments should be 3-1H", "3-1H",eachScoreArray[1]);
		
		
		
	}

}
