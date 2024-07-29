package com.testing.junittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibTest {

	@Test
	void testFibo() {
		assertEquals(3, Fib.fibo(5));
	}

}
