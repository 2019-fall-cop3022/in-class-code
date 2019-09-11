import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {
		Car jalopy = new Car();
		assertEquals("black", jalopy.toString());
		Car sportsCar = new Car("red", Transmission.MANUAL);
		assertEquals("red", sportsCar.toString());
		
	}

}
