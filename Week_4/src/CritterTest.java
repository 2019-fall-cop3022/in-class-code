import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CritterTest {

	@Test
	void test() {
		//Critter c = new Critter();
		//assertEquals("yellow", c.getColor());
		
		Critter[] zoo = new Critter[10];
		
		zoo[0] = new Frog();
		Frog f = new Frog();
		
		assertEquals("green and hopping", zoo[0].move());
		zoo[1] = new Bird("blue");
		assertEquals("blue and flapping", zoo[1].move());
		
		assertEquals("blue", zoo[1].getColor());
		
		assertEquals(12, f.getWartCount());
		
		if (zoo[1] instanceof Frog)
		{
			System.out.println("fee");
			Frog f1 = (Frog)zoo[1];
			assertEquals(12, f1.getWartCount());
		}
	}

}
