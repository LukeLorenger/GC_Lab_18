import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class StringCalculatorTest {

	@Test
	void StringCalculatorTest1() {
		//arrange
		String expected = "7";

		//act
		String actual = StringCalculator.add("7");

		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	void StringCalculatorTest2() {
		
		//arrange
		String expected = "100";

		//act
		String actual = StringCalculator.add("100");

		//assert
		assertEquals(expected, actual);
	}
	
	@Test 
	void StringCalculatorTest3() {
		
		//arrange
		String expected = "0";

		//act
		String actual = StringCalculator.add("");

		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	void StringCalculatorTest4() {
		
		//arrange
		String expected = "0";

		//act
		String actual = StringCalculator.add("");

		//assert
		assertEquals(expected, actual);
	}

	@Test
	void StringCalculatorTest5() {
		
		//arrange
		String expected = "-1";

		//act
		String actual = StringCalculator.add("-1");

		//assert
		assertEquals(expected, actual);
	}
	
	
	@Test
	void StringCalculatorTest6() {
		
		//arrange
		String expected = null;

		//act
		String actual = StringCalculator.add("0");

		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	void StringCalculatorTest7() {
		
		//arrange
		String expected = "101";

		//act
		String actual = StringCalculator.add("1,100");

		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	void StringCalculatorTest8() {
		
		//arrange
		String expected = "5";

		//act
		String actual = StringCalculator.add("2,3");

		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	void StringCalculatorTest9() {
		
		//arrange
		String expected = "-5";

		//act
		String actual = StringCalculator.add("-2,-3");

		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	void StringCalculatorTest10() {
		
		//arrange
		String expected = "5.0";

		//act
		String actual = StringCalculator.add("2.0,3.0");

		//assert
		assertEquals(expected, actual);
	}
	
}
