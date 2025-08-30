/**
 * 
Student ID: 22159296
Name: Aaron Doan
Campus: Parramatta South
Tutor Name: Tad Bak
Class Day: Wednesday
Class Time: 3pm - 5pm
 */

public class PowerTestMethod {

	public static void main(String[] args) {
		
	}
	
	public static long power(int base, int exponent) {
		if (exponent < 0) {
			System.out.println("Please enter non negative number");
			long result = 0;
			for (int count = 0; count < exponent; count++) {
				result = result * base;
			}
		}
		return exponent;
	}
	
	public static boolean NonNegativeNumberValidator (int number) {
		return number >= 0;
	}
}
