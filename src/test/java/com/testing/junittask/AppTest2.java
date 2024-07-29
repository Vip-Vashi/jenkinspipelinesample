package com.testing.junittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.testing.junittask.App;
@SuppressWarnings("unused")
class AppTest {

	@Test
	void testSumOfdigits() {
		assertEquals(6, App.sumOfdigits(123));
	}

}
