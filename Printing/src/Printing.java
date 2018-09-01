
public class Printing {
	public void printing1(String str)	{
		for(String s : str.split(" ")) System.out.println(s);
	}
	
	public void printingWithEquals(String str)	{
		for (int i = 0; i < str.length(); i++)	{
			if (String.valueOf(str.charAt(i)).equals(" ")) System.out.println();
			else System.out.print(str.charAt(i));
		}
	}
	
	public void printing2(String str)	{
		String[] strParts = str.split(" ");
		for (int i = strParts.length-1; i >= 0; i--)	{
			System.out.println(strParts[i]);
		}
	}
}
