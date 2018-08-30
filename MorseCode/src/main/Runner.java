package main;

public class Runner {
	public static void main(String[] args)	{
		MorseCode code = new MorseCode();
		
		System.out.println(code.stringToMorse("hello daily programmer good luck on the challenges today"));
		
		System.out.println(code.morseToString(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"));
	}
}
