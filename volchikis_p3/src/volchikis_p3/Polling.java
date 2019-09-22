package volchikis_p3;

import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[][] ratings = new int [5][10];
		String[] topic = new String[5];
		int i, j;
		int end = 1;
		int ans;
		
		//Set topics
		topic[0] = "World Hunger";
		topic[1] = "Global Warming";
		topic[2] = "Forest Fires";
		topic[3] = "Trafficking";
		topic[4] = "Gun Violence";
		
		System.out.println("Rate the following 5 topics 1 to 10 (10 being the most imprtant): \n");
	
		while (end != 0) {
		for (i=0; i< topic.length; ++i ) {
			System.out.print(topic[i] + ": ");
			ans = scnr.nextInt();
			}
		
		System.out.print("Press any number to continue rating, press 0 to exist.");
		end = scnr.nextInt();
		
		
		
		}
		
	}
	}
	
	
	


