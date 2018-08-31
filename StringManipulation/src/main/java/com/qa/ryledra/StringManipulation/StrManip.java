package com.qa.ryledra.StringManipulation;

public class StrManip {

	public String reverse(String string) {
		String out = "";
		for (int i = string.length()-1; i >= 0; i--)	{
			out += string.charAt(i);
		}
		return out;
	}

	public String trimFront4(String string) {
		return string.substring(4);
	}

	public String removeBert(String string) {
		return string.substring(4, string.length()-4);
	}

	public String returnMiddle(String string) {
		int i = 0;
		while(!string.substring(i, i+4).equals("bert"))	{
			i++;
		}
		String str = string.substring(i+4);
		
		i = str.length();
		while(!str.substring(i-4,i).equals("bert"))	{
			i--;
			//if (i==4) break;
		}
		
		String out = str.substring(0, i-4);
		return out;
	}

}
