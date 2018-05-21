package test;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.rcdts.utld.ScoreProcessor;
import com.rcdts.utld.inter.exception.ScoreInputException;

public class ScoreProcessorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessCommaSeparatedListedScore() throws Exception {
		
		String scores = "44-1A, 991-1H, 1-1H";
		
		int totalScore = new ScoreProcessor().processScoreToPoints(scores);
		
		
		assertEquals("Score for arguments should be 4", 4, totalScore);
		
		
		
	}
	
	@Test
	public void testProcessSingleScore() throws Exception {
		
		String scores = "9-1H";
		
		int totalScore = new ScoreProcessor().processScoreToPoints(scores);
		
		
		assertEquals("Score for arguments should be 3", 3, totalScore);
		
		
		
	}
	
	@Test(expected = ScoreInputException.class)
	public void testProcessSingleScoreInvalidInput() throws Exception {
		
		String scores = "ty-23H";
		
		new ScoreProcessor().processScoreToPoints(scores);
		
		
		
		
		
	}
	
	@Test(expected = com.rcdts.utld.inter.exception.ScoreInputException.class)
	public void testProcessLongScoreInvalidCommaInput() throws Exception {
		
		
		String scores = ",,,,,,ty-9U";
		new ScoreProcessor().processScoreToPoints(scores);

		
		
		
	}
	@Test(expected = com.rcdts.utld.inter.exception.ScoreInputException.class)
	public void testProcessInvalidCommaInput() throws Exception {
		
		
		String scores = ",,,,,,";
		new ScoreProcessor().processScoreToPoints(scores);

		
		
		
	}
	@Test(expected = com.rcdts.utld.inter.exception.ScoreInputException.class)
	public void testProcessInvalidCharInput() throws Exception {
		
		
		String scores = "31-1h";
		new ScoreProcessor().processScoreToPoints(scores);

		
		
		
	}
	
	@Test(expected = com.rcdts.utld.inter.exception.ScoreInputException.class)
	public void testProcessInvalidatedIfAnyInputWrong() throws Exception {
		
		
		String scores = "31-1h, 1-1H";
		new ScoreProcessor().processScoreToPoints(scores);

		
		
		
	}
	
	@Test
	public void testValidateInvalid() throws Exception {
		
		
		String [] scores = {"31-1h", "1-1H"};
		assertFalse(new ScoreProcessor().validate(Arrays.asList(scores)));

		
		
		
	}
	
	@Test
	public void testValidateInvalidWithNull() throws Exception {
		
		
		
		assertFalse(new ScoreProcessor().validate(null));

		
		
		
	}

}
