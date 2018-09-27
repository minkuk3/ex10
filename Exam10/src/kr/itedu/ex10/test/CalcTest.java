package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(3, Calc.sum(1, 2));
		assertEquals(6, Calc.sum(3, 3));
		assertEquals(10, Calc.sum(5, 5));
	}

}
