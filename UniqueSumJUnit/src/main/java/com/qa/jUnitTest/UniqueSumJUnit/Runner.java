package com.qa.jUnitTest.UniqueSumJUnit;

public class Runner {

	public static void main(String[] args) {
		
		UniqueSum sum = new UniqueSum();
		
		System.out.println(sum.uniqueSum(1,2,3));
		System.out.println(sum.uniqueSum(3,3,3));
		System.out.println(sum.uniqueSum(1,1,2));
	}

}
