package com.testing.testjunittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.testing.junittask.IncOrd;

class IncOrdTest {

	@Test
	void testIncreasingOrder() {
		assertTrue(IncOrd.increasingOrder(12346));;
	}

}
