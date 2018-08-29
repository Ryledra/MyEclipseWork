package com.qa.jUnitTest.UniqueSumJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRunner {

	@Test
	public void Test1()	{
		
		UniqueSum sum = new UniqueSum();
		
		assertEquals(6,sum.uniqueSum(1,2,3));
		assertEquals(0,sum.uniqueSum(3,3,3));
		assertEquals(2,sum.uniqueSum(1,1,2));
	}
}
