package com.testing.JunitTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest2 {

	@Test
	void testSumOfdigits() {
		assertEquals(6, App.sumOfdigits(123));
	}

}
