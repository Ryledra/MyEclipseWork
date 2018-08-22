import java.util.ArrayList;

public class Prime {
	public ArrayList<Integer> primes = new ArrayList<Integer>();
	public ArrayList<Double> primesL = new ArrayList<>();
	
	public Prime()	{
		int a = 2;
		double b = 2;
		this.primes.add(a);
		this.primesL.add(b);
	}
	
	public void addPrime(int a)	{
		this.primes.add(a);
	}
	
	public void addPrime(double a)	{
		this.primesL.add(a);
		System.out.println(a);
	}
	
	public Boolean checkPrime(int a)	{
		int i = 0;
		while (primes.get(i) <= Math.sqrt(a))	{
			if (a % primes.get(i) == 0)	{
				return false;
			}
			i++;
		}
		return true;
	}
	
	public Boolean checkPrime(double a)	{
		int i = 0;
		while (primesL.get(i) <= Math.sqrt(a))	{
			if (a % primesL.get(i) == 0)	{
				return false;
			}
			i+=1;
		}
		return true;
	}
}
