package com.testing.junittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testSumOfdigits() {
		assertEquals(6, App.sumOfdigits(123));
	}

}
