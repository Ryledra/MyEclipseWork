
public class Runner {

	public static void main(String[] args) {
		Prime prime = new Prime();
		
		for (int i = 3; i <= 3000000; i++) {
			if (prime.checkPrime(i)) prime.addPrime(i);
			//System.out.println(i);
		}
		System.out.println(prime.primes.size());
		
//		double end = 3e9;
//		
//		for (double i = 3; i <= end; i+=1) {
//			if (prime.checkPrime(i)) prime.addPrime(i);
//			//System.out.println(i);
//		}
//		System.out.println(prime.primesL.size());
	}

}
