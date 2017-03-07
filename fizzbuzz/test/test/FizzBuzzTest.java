package test;

import org.junit.Assert;
import org.junit.Test;

import fizz.buzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void test_MultipleOfThree() {
		Assert.assertTrue(FizzBuzz.multipleOfThree(3));
		Assert.assertFalse(FizzBuzz.multipleOfThree(5));
		Assert.assertTrue(FizzBuzz.multipleOfThree(9));
		Assert.assertFalse(FizzBuzz.multipleOfThree(10));
	}
	
	@Test
	public void test_MultipleOfFive() {
		Assert.assertFalse(FizzBuzz.multipleOfFive(3));
		Assert.assertTrue(FizzBuzz.multipleOfFive(5));
		Assert.assertFalse(FizzBuzz.multipleOfFive(9));
		Assert.assertTrue(FizzBuzz.multipleOfFive(10));
	}
	
	@Test
	public void test_MultipleOfThreeAndFive() {
		Assert.assertFalse(FizzBuzz.multipleOfThreeAndFive(3));
		Assert.assertFalse(FizzBuzz.multipleOfThreeAndFive(5));
		Assert.assertFalse(FizzBuzz.multipleOfThreeAndFive(9));
		Assert.assertFalse(FizzBuzz.multipleOfThreeAndFive(10));
		Assert.assertTrue(FizzBuzz.multipleOfThreeAndFive(15));
	}
	
	@Test
	public void test_PrintNumber() {
		Assert.assertEquals("2", FizzBuzz.printNumber(2));
		
		Assert.assertEquals("Fizz", FizzBuzz.printNumber(3));
		
		Assert.assertEquals("Buzz", FizzBuzz.printNumber(5));
		
		Assert.assertEquals("Fizz Buzz", FizzBuzz.printNumber(15));
	}
	
	@Test
	public void test_Process() {
		Assert.assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz", FizzBuzz.process(15));
	}


}
