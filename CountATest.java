package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountATest {

	@Test
	public void test() {
		JunitTesting test= new JunitTesting();
		int output = test.count("javabean");
		assertEquals(3,output);
		System.out.println("Test 1 Successful");
	}
 
}
