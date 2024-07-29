package com.testing.junittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testSumOfdigits() {
		assertEquals(10, App.sumOfdigits(1234));
	}

}
