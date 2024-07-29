package com.testing.junittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	void testMaxOfDigits() {
		assertEquals(9,Max.maxOfDigits(679));
	}

}
