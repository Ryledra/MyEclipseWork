
public class Recursion {
	public static void main(String[] args) {
		System.out.println(power(5,3));
	}
	
	public static int power(int base, int index)	{
		if (index == 0)	return 1;
		else return power(base, index - 1) * base;
	}
}
