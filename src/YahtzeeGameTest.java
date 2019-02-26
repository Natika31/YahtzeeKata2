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

}
