import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class YahtzeeGameTest {

	private YahtzeeGame yahtzee;

	@Before
	public void setUp() throws Exception {
		this.yahtzee = new YahtzeeGame();
	}

	@After
	public void tearDown() throws Exception {
		this.yahtzee = null;
	}

	@Test
	public void testChance11336scores14() {
		this.yahtzee.setRoll(new Roll(1, 1, 3, 3, 6));
		this.yahtzee.setCategory(new Chance());
		assertEquals(14, this.yahtzee.score());
	}

	@Test
	public void testYahtzee11111scores50() {
		this.yahtzee.setRoll(new Roll(1, 1, 1, 1, 1));
		this.yahtzee.setCategory(new Yahtzee());
		assertEquals(50, this.yahtzee.score());
	}

	@Test
	public void testYahtzee11121scores0() {
		this.yahtzee.setRoll(new Roll(1, 1, 1, 2, 1));
		this.yahtzee.setCategory(new Yahtzee());
		assertEquals(0, this.yahtzee.score());
	}

	@Test
	public void testOnes33345scores0() {
		this.yahtzee.setRoll(new Roll(3,3,3,4,5));
		this.yahtzee.setCategory(new Ones());
		assertEquals(0, this.yahtzee.score());
	} 

	@Test
	public void testOnes11121scores4() {
		this.yahtzee.setRoll(new Roll(1, 1, 1, 2, 1));
		this.yahtzee.setCategory(new Ones());
		assertEquals(4, this.yahtzee.score());
	}

	@Test
	public void testTwos23251scores4() {
		this.yahtzee.setRoll(new Roll(2,3,2,5,1));
		this.yahtzee.setCategory(new Twos());
		assertEquals(4, this.yahtzee.score());
	}

	@Test
	public void testThrees13333scores12() {
		this.yahtzee.setRoll(new Roll(1,3,3,3,3));
		this.yahtzee.setCategory(new Threes());
		assertEquals(12, this.yahtzee.score());
	}

	@Test
	public void testFours11244scores8() {
		this.yahtzee.setRoll(new Roll(1,1,2,4,4));
		this.yahtzee.setCategory(new Fours());
		assertEquals(8, this.yahtzee.score());
	}

	@Test
	public void testFives11245scores5() {
		this.yahtzee.setRoll(new Roll(1,1,2,4,5));
		this.yahtzee.setCategory(new Fives());
		assertEquals(5, this.yahtzee.score());
	}

	@Test
	public void testSixes11245scores0() {
		this.yahtzee.setRoll(new Roll(1,1,2,4,5));
		this.yahtzee.setCategory(new Sixes());
		assertEquals(0, this.yahtzee.score());
	}

	@Test 
	public void testPair33344scores8() {
		this.yahtzee.setRoll(new Roll(3,3,3,4,4));
		this.yahtzee.setCategory(new Pair());
		assertEquals(8, this.yahtzee.score());
	}

	@Test 
	public void testPair11626scores12() {
		this.yahtzee.setRoll(new Roll(1,1,6,2,6));
		this.yahtzee.setCategory(new Pair());
		assertEquals(12, this.yahtzee.score());
	}

	@Test 
	public void testPair33341scores0() {
		this.yahtzee.setRoll(new Roll(3,3,3,4,1));
		this.yahtzee.setCategory(new Pair());
		assertEquals(0, this.yahtzee.score());
	}

	@Test 
	public void testPair33331scores0() {
		this.yahtzee.setRoll(new Roll(3,3,3,3,1));
		this.yahtzee.setCategory(new Pair());
		assertEquals(0, this.yahtzee.score());
	}

	@Test
	public void testTriple33345scores9() {
		this.yahtzee.setRoll(new Roll(3,3,3,4,5));
		this.yahtzee.setCategory(new Triple());
		assertEquals(9, this.yahtzee.score());
	}

	@Test
	public void testTriple33456scores0() {
		this.yahtzee.setRoll(new Roll(3,3,4,5,6));
		this.yahtzee.setCategory(new Triple());
		assertEquals(0, this.yahtzee.score());
	}

	@Test
	public void testTriple33331scores0() {
		this.yahtzee.setRoll(new Roll(3,3,3,3,1));
		this.yahtzee.setCategory(new Triple());
		assertEquals(0, this.yahtzee.score());
	}

	@Test
	public void testQuadruple22225scores8() {
		this.yahtzee.setRoll(new Roll(2,2,2,2,5));
		this.yahtzee.setCategory(new Quadruple());
		assertEquals(8, this.yahtzee.score());
	}

	@Test
	public void testQuadruple22255scores0() {
		this.yahtzee.setRoll(new Roll(2,2,2,5,5));
		this.yahtzee.setCategory(new Quadruple());
		assertEquals(0, this.yahtzee.score());
	}

	@Test
	public void testQuadruple22222scores0() {
		this.yahtzee.setRoll(new Roll(2,2,2,2,2));
		this.yahtzee.setCategory(new Quadruple());
		assertEquals(0, this.yahtzee.score());
	}

	@Test
	public void testTwoPair11233scores8() {
		this.yahtzee.setRoll(new Roll(1,1,2,3,3));
		this.yahtzee.setCategory(new TwoPairs());
		assertEquals(8, this.yahtzee.score());
	}

	@Test
	public void testTwoPair11234scores0() {
		this.yahtzee.setRoll(new Roll(1,1,2,3,4));
		this.yahtzee.setCategory(new TwoPairs());
		assertEquals(0, this.yahtzee.score());
	}

	@Test
	public void testTwoPair11222scores0() {
		this.yahtzee.setRoll(new Roll(1,1,2,2,2));
		this.yahtzee.setCategory(new TwoPairs());
		assertEquals(0, this.yahtzee.score());
	}

	@Test
	public void testsmallStraight12345scores15() {
		this.yahtzee.setRoll(new Roll(1,2,3,4,5));
		this.yahtzee.setCategory(new SmallStraight());
		assertEquals(15, this.yahtzee.score());
	}
	@Test
	public void testsmallStraight13345scores0() {
		this.yahtzee.setRoll(new Roll(1,3,3,4,5));
		this.yahtzee.setCategory(new SmallStraight());
		assertEquals(0, this.yahtzee.score());
	}
	@Test
	public void testLargeStraight13456scores20() {
		this.yahtzee.setRoll(new Roll(1,3,4,5,6));
		this.yahtzee.setCategory(new LargeStraight());
		assertEquals(0, this.yahtzee.score());
	}
	

}
