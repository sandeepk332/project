/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.rcdts.utld.LeagueScoreApp;

/**
 * @author sandeep
 *
 */
public class LeagueScoreAppTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testScoreAppSingleWithNoSpaceArguments() throws Exception {
		
		String [] args = {"4-1A,2-1H,1-1H"};
		
		LeagueScoreApp.main(args);
		assertEquals("Score for arguments should be 4",4,LeagueScoreApp.totalScore);
		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testScoreAppSingleWithNoSpaceMultiArguments() throws Exception{
		
		String [] args = {"4-1A,2-1H,1-1H,","4-1A,2-1H,1-1H,","4-1A,2-1H,1-1H"};
		
		LeagueScoreApp.main(args);
		assertEquals("Score for arguments should be 12",12,LeagueScoreApp.totalScore);
		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testScoreAppSingleWithNoSpaceLongArguments() throws Exception {
		
		String [] args = {"4-1A,2-1H,1-1H,4-1A,2-1H,1-1H,4-1A,2-1H,1-1H"};
		
		LeagueScoreApp.main(args);
		assertEquals("Score for arguments should be 12",12,LeagueScoreApp.totalScore);
		
		
		
	}
	
	@Test
	public void testScoreAppSingleArguments() throws Exception {
		
		String [] args = {"1-1H"};
		
		LeagueScoreApp.main(args);
		assertEquals("Score for arguments should be 1",1,LeagueScoreApp.totalScore);
		
		
		
	}
	
	@Test
	public void testScoreAppSingleWithSpaceLongArguments() throws Exception {
		
		String [] args = {"4-1A, 2-1H, 1-1H,4-1A,2-1H,1-1H,4-1A,2-1H,1-1H"};
		
		LeagueScoreApp.main(args);
		assertEquals("Score for arguments should be 12",12,LeagueScoreApp.totalScore);
		
		
		
	}

}
