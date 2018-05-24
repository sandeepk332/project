package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rcdts.utld.ScoreProcessor;
import com.rcdts.utld.bus.ScoreCalculatorImpl;

public class ScoreCalculatorTest {

	@Test
	public void testCalculateScoreAway() throws Exception {
		
		ScoreCalculatorImpl scoreCalculatorImpl= new ScoreCalculatorImpl();
		
		String score = "1-1A";
		
		scoreCalculatorImpl.scoreCalculatorRCDTSUtld.calculateScore(score);
		
		
		assertEquals("Score for arguments should be 1", 1, scoreCalculatorImpl.getTotalScore());
		
		
		
	}
	
	@Test
	public void testCalculateScoreHome() throws Exception {
		
		ScoreCalculatorImpl scoreCalculatorImpl= new ScoreCalculatorImpl();
		
		String score = "3-1H";
		
		scoreCalculatorImpl.scoreCalculatorRCDTSUtld.calculateScore(score);
		
		
		assertEquals("Score for arguments should be 3", 3, scoreCalculatorImpl.getTotalScore());
		
		
		
	}

}
