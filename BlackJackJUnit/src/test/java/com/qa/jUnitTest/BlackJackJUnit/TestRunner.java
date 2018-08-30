package com.qa.jUnitTest.BlackJackJUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRunner {

	@Test
	public void test1() {

		BlackJack jack = new BlackJack();

		assertEquals(20, jack.blackjack(20, 5));
		assertEquals(5, jack.blackjack(22, 5));
		assertEquals(21, jack.blackjack(20, 21));
		assertEquals(12, jack.blackjack(12, 22));
		assertEquals(0, jack.blackjack(22, 22));
	}
}
