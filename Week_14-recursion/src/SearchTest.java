import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchTest {

	@Test
	void test() {
		Integer[] numbers = {12, 13, 19, 23, 39, 498, 583, 679, 1001, 1003};
		
		assertEquals(0, BinarySearch.search(numbers, 0, numbers.length - 1, 12));
	}

}
