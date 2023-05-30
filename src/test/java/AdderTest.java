import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdderTest {

	@Test
	void testMultiply() {
		Adder tester = new Adder();
		assertEquals("NEGATIVE", tester.subtract(1, 5), "10 x 5 must be 50");
	}

}
