package com.qa.jUnitTest.TooHotJUnit;

public class Runner {
	public static void main(String[] args)	{
		
		TooHot hot = new TooHot();
		System.out.println(hot.tooHot(55, false));
		System.out.println(hot.tooHot(75, false));
		System.out.println(hot.tooHot(95, false));
		System.out.println(hot.tooHot(105, false));
		
		System.out.println(hot.tooHot(55, true));
		System.out.println(hot.tooHot(75, true));
		System.out.println(hot.tooHot(95, true));
		System.out.println(hot.tooHot(105, true));
	}
}
