
public class Runner {

	public static void main(String[] args) {
		
		Anagram hash = new Anagram();
		
//		for (String word : hash.words)	System.out.println(word);
		for (String word : hash.words)	hash.hashs.add(hash.shuffle(word));
		for (int i = 0; i < hash.words.size(); i++)	{
			System.out.println(hash.words.get(i) + " " + hash.hashs.get(i));
		}

	}

}
