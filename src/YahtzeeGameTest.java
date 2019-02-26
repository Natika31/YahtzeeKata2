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

}
