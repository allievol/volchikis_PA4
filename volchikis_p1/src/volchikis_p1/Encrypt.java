package volchikis_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int totalDigits = 4;
		int [] originalDigits = new int [totalDigits];
		int i;
		int [] modDigits = new int [totalDigits];
		int [] newDigits = new int [totalDigits];
		int [] decryptDigits = new int [totalDigits];
		int [] reverseDigits = new int [totalDigits];
		
	
		System.out.print("Enter 4 digits of your choice.\n");
		
		//Prompt User for 4 digits and store them
		for (i = 0; i <totalDigits; ++i) {
			System.out.print("Digit: ");
			originalDigits[i] = scnr.nextInt();
			}
		
		
		//Encrypt each digit
		for (i = 0; i < totalDigits; ++i) {
			modDigits[i] = (originalDigits[i] + 7) % 10;
		
			}
		
		//Swap out digits
		newDigits[0] = modDigits[2];
		newDigits[1] = modDigits[3];
		newDigits[2] = modDigits[0];
		newDigits[3] = modDigits[1];
		
		//Call new digits
		System.out.print("\nEncrypted Digits:");
		System.out.println(" " + newDigits[0] + " " + newDigits[1] + " " + newDigits[2] + " " + newDigits[3]);
		
		//Time to decrypt
		decryptDigits[0] = newDigits[2];
		decryptDigits[1] = newDigits[3];
		decryptDigits[2] = newDigits[0];
		decryptDigits[3] = newDigits[1];
		
		
		//Revert modified digits to original
		for(i = 0; i < totalDigits ; ++i) {
			
			if (decryptDigits[i] >=7) {
				
				decryptDigits[i] =(decryptDigits[i] - 7);
			}
			else {
				
				decryptDigits[i] = (decryptDigits[i] + 3);
			}
		}
		
		//Call decrypted digits
		System.out.print("\nDecrypted Digits:");
		System.out.print(" " + decryptDigits[0] + " " + decryptDigits[1] + " " + decryptDigits[2] + " " + decryptDigits[3]);
		
		
		
	}

}
