package fizz.buzz;

import java.util.Scanner;

public class FizzBuzz {

	private static final String FIZZ = "Fizz";

	private static final String BUZZ = "Buzz";

	private static final String FIZZ_BUZZ = "Fizz Buzz";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int number = sc.nextInt();

		System.out.println(process(number));
		
	}
	
	public static String process(int number) {
		StringBuilder result = new StringBuilder();

		for (int i = 1; i <= number; i++) {
			result.append(printNumber(i));
			
			if(i < number) {
				result.append(" ");
			}
		}
		
		return result.toString();
	}

	public static String printNumber(int number) {
		 if (multipleOfThreeAndFive(number)) {
			return FIZZ_BUZZ;
		}else if (multipleOfThree(number)) {
			return FIZZ;
		} else if (multipleOfFive(number)) {
			return BUZZ;
		}
		 
		return String.valueOf(number);
	}

	public static boolean multipleOfThree(int number) {
		return (number % 3) == 0;
	}

	public static boolean multipleOfFive(int number) {
		return (number % 5) == 0;
	}

	public static boolean multipleOfThreeAndFive(int number) {
		return multipleOfThree(number) && multipleOfFive(number);
	}

}
