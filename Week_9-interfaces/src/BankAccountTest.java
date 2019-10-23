import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		BankAccount checking = new BankAccount("123.05");
		assertEquals("$123.05", checking.getBalance());
	}

}
