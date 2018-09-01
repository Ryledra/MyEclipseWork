
public class Printing {
	
	public void printing1(String str)	{
		for (int i = 0; i < str.length(); i++)	{
			if (str.charAt(i) == ' ') System.out.println();
			else System.out.print(str.charAt(i));
		}
	}

	public void printing2(String str)	{
		String out = "";
		for (int i = str.length()-1; i >= 0; i--)	{
			if (str.charAt(i) == ' ') {
				System.out.println(out);
				out = "";
			} else out = str.charAt(i) + out;
		} System.out.println(out);
	}
}
