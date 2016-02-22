package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		assertEquals(5, calc.getTotal());
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.subtract(3);
		assertEquals(2, calc.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.multiply(3);
		assertEquals(15, calc.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(2);
		assertNotEquals(0, calc.getTotal()); // check for divide by zero error
		assertEquals(5, calc.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		calc.add(20);
		calc.subtract(5);
		calc.multiply(2);
		calc.divide(10);
		assertEquals("0 + 20 - 5 * 2 / 10", calc.getHistory());
	}

}
