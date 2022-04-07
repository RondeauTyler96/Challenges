package example;

public class FizzBuzzClass {

	public static String[] perform(int n) {
		/*
		 * Have you heard of the whiteboarding question called FizzBuzz?
		 * Well, this will be a slightly modified version of 'FizzBuzz'.
		 * 
		 * Description:
		 * 		Create a string array of length n. For each element, put a string containing the index. HOWEVER, if its index is
		 * 		divisible by 3, then instead of putting the number itself you'll put "Fizz" in that index of the array. If the index
		 * 		is divisible by 5, then instead of putting the number itself you'll put "Buzz" in that index of the array. Finally,
		 * 		if the index is divisible by 3 AND 5, then instead of putting the number itself you'll put "FizzBuzz" in that index
		 *		of the array.
		 *
		 *	Example:
		 *		perform(17) should return the following array:
		 *			["FizzBuzz", "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16"]
		 */
		
		if(n<0) {
			throw new IllegalArgumentException();
		}
		
		String[] returnArry = new String[n];
		
		for(int i = 0; i<returnArry.length; i++) {
			if(i == 0) {
				returnArry[i] = "FizzBuzz";
			}else if(i%3 == 0 && i%5 == 0) {
				returnArry[i] = "FizzBuzz";
			}else if(i%5 == 0) {
				returnArry[i] = "Buzz";
			}else if(i%3 == 0) {
				returnArry[i] = "Fizz";
			}else {
				returnArry[i] = "" + i;
			}
		}
		
		return returnArry; //Feel free to alter this line of code
	}
}
