import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	void test() {
		Integer[] numbers = { 1, 984, 12, 7642, -12, 932, 1287 };
		Integer max = Max.getMax(numbers);
		assertEquals(7642, max);
	}

}
