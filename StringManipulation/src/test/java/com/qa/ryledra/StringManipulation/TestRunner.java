package com.qa.ryledra.StringManipulation;

import static org.junit.Assert.*;

import org.junit.*;

public class TestRunner {

	@Test
	public void reverse()	{
		StrManip str = new StrManip();
		assertEquals("trebevilctreb", str.reverse("bertclivebert"));
	}
	
	@Test
	public void trimFront4()	{
		StrManip str = new StrManip();
		assertEquals("clivebert", str.trimFront4("bertclivebert"));
	}
	
	@Test
	public void trimBert()	{
		StrManip str = new StrManip();
		assertEquals("clive", str.removeBert("bertclivebert"));
	}
	
	@Test
	public void returnMiddle()	{
		StrManip str = new StrManip();
		assertEquals("clive", str.returnMiddle("xxbertclivebertyy"));
	}
}
