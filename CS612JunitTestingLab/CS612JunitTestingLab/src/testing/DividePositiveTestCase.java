package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DividePositiveTestCase {

	@Test
	void test() {
		JunitTesting Positivetest =new JunitTesting();
		double output= Positivetest.divide(36, 6);
		assertEquals(6, output);
		
	}

}
