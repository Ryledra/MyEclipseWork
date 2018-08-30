package main;

public class Runner {
	public static void main(String[] args)	{
		MorseCode code = new MorseCode();
		
		System.out.println(code.stringToMorse("hello world"));
		
		System.out.println(code.morseToString(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"));
	}
}
