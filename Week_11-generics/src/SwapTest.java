import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapTest {

	@Test
	void test() {
		Integer[] numbers = {1, 3, 5, 7, 9};
		
		Swap.Swap(numbers, 0, 2);
		assertEquals(5, numbers[0]);
		assertEquals(1, numbers[2]);
	}

	@Test
	void StringSwap() {
		String[] words = {"foo", "bar", "baz"};
		
		Swap.Swap(words, 0, 2);
		assertEquals("baz", words[0]);
		assertEquals("foo", words[2]);
	}
}
