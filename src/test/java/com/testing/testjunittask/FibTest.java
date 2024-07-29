package com.testing.testjunittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.testing.junittask.Fib;

class FibTest {

	@Test
	void testFibo() {
		assertEquals(3, Fib.fibo(5));
	}

}
