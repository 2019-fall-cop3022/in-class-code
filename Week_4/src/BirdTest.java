import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BirdTest {

	@Test
	void test() {
		Bird bigBird = new Bird();
		assertEquals("yellow and flapping", bigBird.move());
		
		Bird cardinal = new Bird("red");
		assertEquals("red and flapping", cardinal.move());
	}

}
