package com.testing.junittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncOrdTest {

	@Test
	void testIncreasingOrder() {
		assertTrue(IncOrd.increasingOrder(12346));;
	}

}
