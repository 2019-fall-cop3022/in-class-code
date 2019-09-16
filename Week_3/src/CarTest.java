import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {
		assertEquals(0, Car.getNumberOfCars());
		
		Car jalopy = new Car();
		assertEquals(1, Car.getNumberOfCars());
		jalopy.accelerate(10);
		assertEquals("black car going 10 mph in drive", jalopy.toString());
		
		Car sportsCar = new Car("red", Transmission.MANUAL);
		assertEquals(2, Car.getNumberOfCars());
		assertEquals("red car going 0 mph in 1", sportsCar.toString());
		sportsCar.accelerate(40);
		assertEquals("red car going 40 mph in 2", sportsCar.toString());
		
	}

}
