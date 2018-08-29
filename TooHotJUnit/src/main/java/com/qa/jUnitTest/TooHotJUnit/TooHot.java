package com.qa.jUnitTest.TooHotJUnit;

public class TooHot {
	public Boolean tooHot(int temperature, Boolean summer)	{
		int[] range = {60,90};
		if (summer) range[1] = 100;
		
		if (temperature >= range[0] && temperature <= range[1])	return true;
		return false;
	}
}
