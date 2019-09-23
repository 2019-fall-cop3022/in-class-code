import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CritterTest {

	@Test
	void test() {
		Critter c = new Critter();
		assertEquals("yellow", c.getColor());
		
		Critter[] zoo = new Critter[10];
		
		zoo[0] = new Frog();
		zoo[1] = new Bird("blue");
	}

}
