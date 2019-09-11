import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {
		assertEquals(0, Car.getNumberOfCars());
		
		Car jalopy = new Car();
		assertEquals(1, Car.getNumberOfCars());
		assertEquals("black", jalopy.toString());
		
		Car sportsCar = new Car("red", Transmission.MANUAL);
		assertEquals(2, Car.getNumberOfCars());
		assertEquals("red", sportsCar.toString());
		
	}

}
