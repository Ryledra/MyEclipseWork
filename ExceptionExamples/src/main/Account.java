package main;

public class Account {
	public float netSalary(int salary, int absences) throws AbsentException	{
		float net = 0;
		if (absences >= 5)	throw new AbsentException();
		else net = (float)(salary * 0.15);
		return net;
	}
}
