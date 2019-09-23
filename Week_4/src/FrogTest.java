import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrogTest {

	@Test
	void test() {
		Frog kermit = new Frog();
		assertEquals("green and hopping", kermit.move());
		
		Frog dartFrog = new Frog("red", 7);
		assertEquals("red and hopping", dartFrog.move());
	}

}
