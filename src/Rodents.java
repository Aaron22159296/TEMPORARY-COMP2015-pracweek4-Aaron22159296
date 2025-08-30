/**
 * 
Student ID: 22159296
Name: Aaron Doan
Campus: Parramatta South
Tutor Name: Tad Bak
Class Day: Wednesday
Class Time: 3pm - 5pm
 */
import java.util.Scanner;

public class Rodents {
	
	public static boolean intValidator(int number, int min) {
		return number >= min;
	}

	public static boolean floatValidator(double number, double min) {
		return number >= min;
	}
	
	public static void main(String[] args) {
		
		int iniPopulation;
		double percentIncrease;
		int numYears;
		int total;
		int numIncrease;
		
		System.out.println("Enter intial population of Rodents of Unusual Size:");
		Scanner keyboard = new Scanner(System.in);
		iniPopulation = keyboard.nextInt();
		while (!intValidator(iniPopulation, 300)) {
			System.out.print("Inital populaiton must be greater or equal to 300. Enter initial population:");
			iniPopulation = keyboard.nextInt();
		}
		System.out.println("Enter annual population increase as percentage:");
		percentIncrease = keyboard.nextDouble();
		while (!floatValidator(percentIncrease, 0.0)) {
			System.out.print("Percentage must be greater or equal to 0. Enter percentage:");
			percentIncrease = keyboard.nextDouble();
		}
		System.out.println("Enter number of years to estimate population:");
		numYears = keyboard.nextShort();
		while (!intValidator(numYears, 10)) {
			System.out.print("Years must be greater or equal to 10. Enter Years");
			numYears = keyboard.nextInt();
		}
		System.out.println("Year     Rous");
		System.out.println("----------------");
		
		double population = iniPopulation;
		for (int count = 1; count <= numYears; count++) {
			population = (iniPopulation * (1 + percentIncrease / 100));
			total = (int)Math.round(iniPopulation);
			System.out.println(count + "            " + total);
		}
	}

}
