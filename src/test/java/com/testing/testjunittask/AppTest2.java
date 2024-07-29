package com.testing.testjunittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.testing.junittask.App;

class AppTest {

	@Test
	void testSumOfdigits() {
		assertEquals(6, App.sumOfdigits(123));
	}

}
