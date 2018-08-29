package com.qa.jUnitTest.UniqueSumJUnit;

public class UniqueSum {
	public int uniqueSum(int a, int b, int c)	{
		Boolean[] unique = {true, true, true};
		int[] values = {a, b, c};
		if (a == b)	{
			unique[0] = false;
			unique[1] = false;
		}
		if (a == c)	{
			unique[0] = false;
			unique[2] = false;
		}
		if (b == c)	{
			unique[1] = false;
			unique[2] = false;
		}
		
		int output = 0;
		
		for (int i = 0; i < 3; i++)	{
			if (unique[i]) output += values[i];
		}
		
		return output;
	}
}
