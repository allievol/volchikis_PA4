package volchikis_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double weightInPounds;
		double heightInInches;
		double weightInKilograms;
		double heightInMeters;
		int option;
		double option1;
		double option2;
		
		System.out.println("Hello, you have two options to measure your BMI.\n");
		System.out.println("Option 1: BMI =\n \t\t(703 * (weight in pounds) / (height in inches * height in iches)\n");
		System.out.println("Option 2: BMI =\n \t\t(weight in kilograms) / (height in meters * height in meters)\n");
		
		System.out.println("For option 1, press #1.\nFor option 2, press #2.");
		option = scnr.nextInt();
	
		if (option == 1) { 
			
			System.out.println("Enter your weight in lbs: ");
			weightInPounds = scnr.nextDouble();
			
			System.out.println("Enter your height in inches: ");
			heightInInches = scnr.nextDouble();
			
			option1 = (703 * weightInPounds) / (heightInInches * heightInInches);
			System.out.println("BMI: " + option1);
		}
		
		else if (option == 2) {
			
			System.out.println("Enter your weight in kilograms: ");
			weightInKilograms = scnr.nextDouble();
			
			System.out.println("Enter your height in meters: ");
			heightInMeters = scnr.nextDouble();
			
			option2 = (weightInKilograms) / (heightInMeters * heightInMeters);
			System.out.println("BMI: " + option2);
		}
	
		
		else {
			
			System.out.print("ERROR: That was not an option\n");
		}
	
			

		if (option == 1 || option == 2) { 
			
		System.out.println("\nBMI Categories:");
		System.out.println("\tUnder weight  = < 18.5");
		System.out.println("\tNormal weight = 18.5-24.9");
		System.out.println("\tOverweight    = 25-29.9");
		System.out.println("\tObesity       = 30+");
		}
	}

}
