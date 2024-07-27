package com.testing.JunitTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	void testMaxOfDigits() {
		assertEquals(9,Max.MaxOfDigits(679));
	}

}
