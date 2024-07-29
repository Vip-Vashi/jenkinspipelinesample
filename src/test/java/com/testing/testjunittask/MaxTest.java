package com.testing.testjunittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.testing.junittask.Max;

class MaxTest {

	@Test
	void testMaxOfDigits() {
		assertEquals(9,Max.maxOfDigits(679));
	}

}
