public class ExampleClass {

	
	public String outHelloWorld()	{
		return "Hello World!";
	}
	
	public void printString(String str)	{
		System.out.println(str);
	}
	
	public int addition(int a, int b)	{
		if (a == 0 || b == 0) return a + b;
		else return a + b;
	}
	
	public int addition(int a, int b, Boolean c)	{
		if (c) return a + b;
		else return a * b;
	}
	
	public int blackjack(int a, int b)	{
		if (a <= 21 && b <= 21)	{
			if (a > b) return a;
			else return b;
		}
		else if (b <= 21) return b;
		else if (a <= 21) return a;
		else return 0;
	} 
	
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
	
	public Boolean tooHot(int temperature, Boolean summer)	{
		int[] range = {60,90};
		if (summer) range[1] = 100;
		
		if (temperature >= range[0] && temperature <= range[1])	return true;
		return false;
	}
}
