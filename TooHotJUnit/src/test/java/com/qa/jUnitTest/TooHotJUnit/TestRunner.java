package com.qa.jUnitTest.TooHotJUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRunner {
	
	@Test
	public void notSummer()	{
		TooHot hot = new TooHot();
		assertFalse(hot.tooHot(55, false));
		assertTrue(hot.tooHot(75, false));
		assertFalse(hot.tooHot(95, false));
		assertFalse(hot.tooHot(105, false));
	}
	
	@Test
	public void summer()	{
		TooHot hot = new TooHot();
		assertFalse(hot.tooHot(55, true));
		assertTrue(hot.tooHot(75, true));
		assertTrue(hot.tooHot(95, true));
		assertFalse(hot.tooHot(105, true));
	}
}
