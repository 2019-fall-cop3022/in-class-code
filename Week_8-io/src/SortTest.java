import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortTest {

	@Test
	void test() {
		int[] a = {1, 31, 12, -4, 88};
		int[] sortedA = {-4, 1, 12, 31, 88};
		
		Sort.sortMe(a);
		
		assertArrayEquals(sortedA, a);
	}

}
