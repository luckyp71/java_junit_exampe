package org.example.junit_example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestOnly {

	@Test
	public void testOnly() {
		String expected ="ok";
		String actual = "ok";
		
		assertEquals(expected, actual);
	}
	
	
}
