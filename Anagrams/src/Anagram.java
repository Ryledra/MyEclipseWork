import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Anagram {
	public ArrayList<String> words = new ArrayList<>();
	public ArrayList<String> hashs = new ArrayList<>();
	
	public Anagram()	{
		this.getWords();
	}
	
	public void getWords()	{
		File file = new File("C:\\Users\\Admin\\Desktop\\EclipseWorkspace\\Anagrams\\src\\words.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedReader br = new BufferedReader(fr);

		String readLine = "";

		do {
			try {
				readLine = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (readLine == null) break;
			words.add(readLine);
		} while (readLine != null);
	}
	
	public String shuffle(String str)	{
		Random rand = new Random();
		int randNo;
		char temp;
		String out = str;
		for (int i = 0; i < 10; i++)	{
			randNo = rand.nextInt(str.length());
			temp = out.charAt(0);
			if (randNo == 0) continue;
			if (randNo == str.length()) out = out.substring(1, str.length()) + temp;
			else
				out = (out.substring(1, randNo) + temp + out.substring(randNo,str.length()));
		}
		return out;
	}
}
