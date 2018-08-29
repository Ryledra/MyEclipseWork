package com.qa.jUnitTest.BlackJackJUnit;

public class Runner {

	public static void main(String[] args) {
		
		BlackJack jack = new BlackJack();
		
		System.out.println(jack.blackjack(20, 5));
		System.out.println(jack.blackjack(22, 5));
		System.out.println(jack.blackjack(20, 21));
		System.out.println(jack.blackjack(12, 22));
		System.out.println(jack.blackjack(22, 22));

	}

}
