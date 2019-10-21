import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortTest {

	@Test
	void test() {
		Integer[] a = {1, 31, 12, -4, 88};
		Integer[] sortedA = {-4, 1, 12, 31, 88};
		
		Sort.sortMe(a);
		
		assertArrayEquals(sortedA, a);
		
		Double[] myDoubles = {1.4, 1.2, 2.7, -1.76, 4.2};
		Double[] mySortedDoubles = {-1.76, 1.2, 1.4, 2.7, 4.2};
		
		Sort.sortMe(myDoubles);
		
		assertArrayEquals(mySortedDoubles, myDoubles);
	}

}
