
package com.compensation.employee;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
	Employee object;
	
	@Before
	public void newClassFahrenheit() {
		object = new Employee();
	}
	/* Input Boundary Testing */
	@Test
	public void testResultID61113239Input61113239() {
		String input = "61113239";
		object.setEmpId(input);
		String expected = "61113239";
		String actual = object.getEmpId();
		assertEquals(expected,actual);
	}
	@Test
	public void testResultNameWittawatInputWittawat() {
		String input = "Wittawat Chuaypanang";
		object.setEmpName(input);
		String expected = "Wittawat Chuaypanang";
		String actual = object.getEmpName();
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseInputSalaryMinus20000() {
		double input = -20000;
		boolean expected = false;
		boolean actual = object.isSalaryInBoundary(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseInputSalary0() {
		double input = 0;
		boolean expected = false;
		boolean actual = object.isSalaryInBoundary(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputSalary1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isSalaryInBoundary(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputSalary20000() {
		double input = 20000;
		boolean expected = true;
		boolean actual = object.isSalaryInBoundary(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputSellMinus20000() {
		double input = -20000;
		boolean expected = false;
		boolean actual = object.isSellInBoundary(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputSell0() {
		double input = 0;
		boolean expected = false;
		boolean actual = object.isSellInBoundary(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputSell1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isSellInBoundary(input);
		assertEquals(expected,actual);
	}
	public void testResultTrueInputSell2() {
		double input = 2;
		boolean expected = true;
		boolean actual = object.isSellInBoundary(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputSell49999() {
		double input = 49999;
		boolean expected = true;
		boolean actual = object.isSellInBoundary(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputSell50000() {
		double input = 50000;
		boolean expected = true;
		boolean actual = object.isSellInBoundary(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputSell60000() {
		double input = 60000;
		boolean expected = true;
		boolean actual = object.isSellInBoundary(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputSell75000() {
		double input = 75000;
		boolean expected = true;
		boolean actual = object.isSellInBoundary(input);
		assertEquals(expected,actual);
	}

	@Test
	public void testSalary10000InputSalary10000() {
	double input = 10000;
	double expected = 10000;
	object.setSalary(input);
	double actual = object.getSalary();
	assertEquals(expected,actual,2);
	}
	
	@Test
	public void testSalary20000InputSalary20000() {
	double input = 20000;
	double expected = 20000;
	object.setSalary(input);
	double actual = object.getSalary();
	assertEquals(expected,actual,2);
	}
	
	@Test
	public void testSell50000InputSalary10000() {
	double input = 10000;
	double expected = 10000;
	object.setSalary(input);
	double actual = object.getSalary();
	assertEquals(expected,actual,2);
	}
	
	/* Testing calculating function according to requirement 4.2.3 */
	
	@Test
	public void testCompensationInputSalary10000SellMinus20000() {
		double inputSalary = 10000;
		double inputSell = -20000;
		double expected = 10000;
		object.setSalary(inputSalary);
		object.setSell(inputSell);
		double actual = object.getCompensation();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testCompensationInputSalary10000Sell0() {
		double inputSalary = 10000;
		double inputSell = 0;
		double expected = 10000;
		object.setSalary(inputSalary);
		object.setSell(inputSell);
		double actual = object.getCompensation();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testCompensationInputSalary10000Sell1() {
		double inputSalary = 10000;
		double inputSell = 1;
		double expected = 10000.05;
		object.setSalary(inputSalary);
		object.setSell(inputSell);
		double actual = object.getCompensation();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testCompensationInputSalary10000Sell2() {
		double inputSalary = 10000;
		double inputSell = 2;
		double expected = 10000.1;
		object.setSalary(inputSalary);
		object.setSell(inputSell);
		double actual = object.getCompensation();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testCompensationInputSalary10000Sell25000() {
		double inputSalary = 10000;
		double inputSell = 25000;
		double expected = 11250;
		object.setSalary(inputSalary);
		object.setSell(inputSell);
		double actual = object.getCompensation();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testCompensationInputSalary10000Sell49999() {
		double inputSalary = 10000;
		double inputSell = 49999;
		double expected = 12499.95;
		object.setSalary(inputSalary);
		object.setSell(inputSell);
		double actual = object.getCompensation();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testCompensationInputSalary10000Sell50000() {
		double inputSalary = 10000;
		double inputSell = 50000;
		double expected = 12500;
		object.setSalary(inputSalary);
		object.setSell(inputSell);
		double actual = object.getCompensation();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testCompensationInputSalary10000Sell50001() {
		double inputSalary = 10000;
		double inputSell = 50001;
		double expected = 15000.10;
		object.setSalary(inputSalary);
		object.setSell(inputSell);
		double actual = object.getCompensation();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testCompensationInputSalary10000Sell75000() {
		double inputSalary = 10000;
		double inputSell = 75000;
		double expected = 17500;
		object.setSalary(inputSalary);
		object.setSell(inputSell);
		double actual = object.getCompensation();
		assertEquals(expected,actual,2);
	}
}