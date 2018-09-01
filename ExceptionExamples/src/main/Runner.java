package main;

public class Runner {

	public static void main(String[] args) {
		float n;
		Account a = new Account();
		
		try	{
			n = a.netSalary(1000, 5);
		} catch(AbsentException ae)	{
			System.out.println("you've been gone a long time");
			n = 0;
		}
		System.out.println("you get £" + n + " salary");

	}

}
