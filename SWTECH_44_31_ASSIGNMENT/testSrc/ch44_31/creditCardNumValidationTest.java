package ch44_31;

import static org.junit.Assert.*;

import org.junit.Test;

public class creditCardNumValidationTest {

	public static long trueCardNumber = 4388576018410707L;
	public static long falseCardNumber = 4388576018402626L;
	
	//test overall validation of numbers
	@Test
	public void testIsValidTrue() {
		assertFalse(creditCardNumValidation.isValid(falseCardNumber));
		assertTrue(creditCardNumValidation.isValid(trueCardNumber));
	}
	
	//test addition method for multiplying even spaces by 2 and adding together
	@Test 
	public void testsumOfDoubleEvenPlace() {
		assertEquals(creditCardNumValidation.sumOfDoubleEvenPlace(trueCardNumber), 29);
		assertEquals(creditCardNumValidation.sumOfDoubleEvenPlace(falseCardNumber), 37);
	}
	
	// testing the sum of odd places
	@Test
	public void testSumOfOddPlace () {
		assertEquals(creditCardNumValidation.sumOfOddPlace(trueCardNumber), 41);
		assertEquals(creditCardNumValidation.sumOfOddPlace(falseCardNumber), 38);
	}
	
	//testing that the prefix method is matching correctly
	@Test
	public void testPrefixMatched() {
		//true cases
		assertTrue(creditCardNumValidation.prefixMatched(trueCardNumber, 4));
		assertTrue(creditCardNumValidation.prefixMatched(5388576018410707L, 5));
		assertTrue(creditCardNumValidation.prefixMatched(6388576018410707L, 6));
		assertTrue(creditCardNumValidation.prefixMatched(3788576018410707L, 37));
	}
	
	//ensuring the size counter is operating correctly
	@Test
	public void testGetSize() {
		assertEquals(creditCardNumValidation.getSize(trueCardNumber), 16);
		assertEquals(creditCardNumValidation.getSize(123456789012345L), 15);
		assertEquals(creditCardNumValidation.getSize(12345678901234L), 14);
		assertEquals(creditCardNumValidation.getSize(1234567890123L), 13);
		assertEquals(creditCardNumValidation.getSize(123456789012L), 12);
	}
	
	//tests the adding method within isValid
	@Test
	public void testIsValidIsAlgorithmSum() {
		assertEquals(creditCardNumValidation.sumOfOddPlace(trueCardNumber) + (creditCardNumValidation.sumOfDoubleEvenPlace(trueCardNumber)), 70);
		assertEquals(creditCardNumValidation.sumOfOddPlace(falseCardNumber) + (creditCardNumValidation.sumOfDoubleEvenPlace(falseCardNumber)), 75);
	}
	
	// tests division method within isValid
	@Test
	public void testIsValidIsDivisible() {
		assertEquals((creditCardNumValidation.sumOfOddPlace(trueCardNumber) + (creditCardNumValidation.sumOfDoubleEvenPlace(trueCardNumber)) % 10), 0);
		assertEquals((creditCardNumValidation.sumOfOddPlace(falseCardNumber) + (creditCardNumValidation.sumOfDoubleEvenPlace(falseCardNumber)) % 10), 5);
	}
	
	@Test
	public void test() {
		System.out.println("Test ran");
	}

}
