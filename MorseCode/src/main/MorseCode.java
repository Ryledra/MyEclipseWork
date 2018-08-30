package main;

import java.util.HashMap;

public class MorseCode {
	HashMap<String, String> codeForward = new HashMap<>();
	HashMap<String, String> codeReverse = new HashMap<>();
	
	public MorseCode()	{
		codeForward.put("a", ".-"); codeForward.put("h", "...."); codeForward.put("o", "---"); codeForward.put("v", "...-"); codeForward.put("3", "...--"); codeForward.put("0", "-----");
		codeForward.put("b", "-..."); codeForward.put("i", ".."); codeForward.put("p", ".--."); codeForward.put("w", ".--"); codeForward.put("4", "....-");  codeForward.put(" ", "/");
		codeForward.put("c", "-.-."); codeForward.put("j", ".---"); codeForward.put("q", "--.-"); codeForward.put("x", "-..-"); codeForward.put("5", ".....");
		codeForward.put("d", "-.."); codeForward.put("k", "-.-"); codeForward.put("r", ".-."); codeForward.put("y", "-.--"); codeForward.put("6", "-....");
		codeForward.put("e", "."); codeForward.put("l", ".-.."); codeForward.put("s", "..."); codeForward.put("z", "--.."); codeForward.put("7", "--...");
		codeForward.put("f", "..-."); codeForward.put("m", "--"); codeForward.put("t", "-"); codeForward.put("1", ".----"); codeForward.put("8", "---..");
		codeForward.put("g", "--."); codeForward.put("n", "-."); codeForward.put("u", "..-"); codeForward.put("2", "..---"); codeForward.put("9", "----.");
		
		codeReverse.put(".-", "a"); codeReverse.put("....", "h"); codeReverse.put("---", "o"); codeReverse.put("...-", "v"); codeReverse.put("...--", "3"); codeReverse.put("-----", "0");
		codeReverse.put("-...", "b"); codeReverse.put("..", "i"); codeReverse.put(".--.", "p"); codeReverse.put(".--","w"); codeReverse.put("....-", "4");  codeForward.put("/", " ");
		codeReverse.put("-.-.", "c"); codeReverse.put(".---", "j"); codeReverse.put("--.-", "q"); codeReverse.put("-..-", "x"); codeReverse.put(".....", "5");
		codeReverse.put("-..","d"); codeReverse.put("-.-", "k"); codeReverse.put(".-.", "r"); codeReverse.put("-.--", "y"); codeReverse.put("-....", "6");
		codeReverse.put(".", "e"); codeReverse.put(".-..", "l"); codeReverse.put("...", "s"); codeReverse.put("--..", "z"); codeReverse.put("--...", "7");
		codeReverse.put("..-.", "f"); codeReverse.put("--", "m"); codeReverse.put("-", "t"); codeReverse.put(".----", "1"); codeReverse.put("---..", "8");
		codeReverse.put("--.", "g"); codeReverse.put("-.", "n"); codeReverse.put("..-", "u"); codeReverse.put("..---", "2"); codeReverse.put("----.", "9");
	}
	
	public String stringToMorse(String input)	{
		String out = "";
		String temp = "";
		for (int i = 0; i < input.length(); i++)	{
			temp = String.valueOf(input.charAt(i));
			out += codeForward.get(temp) + " ";
		}
		return out;
	}
	
	public String morseToString(String input)	{
		String out = "";
		String[] inputSplit = input.split(" ");
		for (String i : inputSplit)	{
			String temp = "";
			temp = codeReverse.get(i);
			if (temp == null) out+= " ";
			else out += codeReverse.get(i);
		}
		return out;
	}
}
