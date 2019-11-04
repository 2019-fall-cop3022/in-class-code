import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test	
	void test() {
		Student<Character> s = new Student<Character>("ADM Grace Hopper", 'A');
		assertEquals("ADM Grace Hopper", s.getName());
		assertEquals('A', s.getGrade());
	}

	@Test	
	void test1() {
		Student<Integer> s = new Student<Integer>("ADM Grace Hopper", 97);
		assertEquals("ADM Grace Hopper", s.getName());
		assertEquals(97, s.getGrade());
	}
}
