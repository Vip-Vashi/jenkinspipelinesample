package com.testing.JunitTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncOrdTest {

	@Test
	void testIncreasingOrder() {
		assertTrue(IncOrd.IncreasingOrder(12346));;
	}

}
