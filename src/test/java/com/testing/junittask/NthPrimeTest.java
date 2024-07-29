package com.testing.junittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.testing.junittask.NthPrime;

class NthPrimeTest {

	@Test
	void testNthPrime() {
		assertEquals(3, NthPrime.nthPrime(2));
	}

}
