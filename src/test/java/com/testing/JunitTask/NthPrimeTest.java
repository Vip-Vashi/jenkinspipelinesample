package com.testing.JunitTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NthPrimeTest {

	@Test
	void testNthPrime() {
		assertEquals(3, NthPrime.nthPrime(2));
	}

}
