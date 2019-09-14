package data_Structure_Sorting;

import java.util.Scanner;

/** 
 * 		1.	SelectionSort.java 
 *			
 *			1.1 - Create an array of integer data and sort it using the Selection Sort algorithm. 
 *			1.2 - Your method should be called selectionSort(), and should take in an array myArray. 
 *			
 *			Important - Test your method by printing the array before and after you call your sorting algorithm.
 *
 */

/**
 * 
 * 	TIME COMPLEXITY
 * 	
 * 	SelectionSort.java			Best(Omega)		Average(Teta)		Worst(BigO)		
 * 		Average case - 	   	 	   (nˆ2)      		(n^2)			   (n^2)
 * 	
 * 
 * 	SPACE COMPLEXITY
 * 		Worst case 	 -		O(1)
 * 
 */

public class SelectionSort {

	/** Creating the selection sort method - static */
	public static int[] selectionSort(int myArray[]) {

		//create the smallestPlace variable and initiate it to be used in the algorithm
		int smallestPlace = 0;
		
		// Create the for loop, in order to analyze every space of the myArray
		for (int i = 0; i < myArray.length; i++) {
			smallestPlace = i; //define the smallestPlace variable everytime which the for loop turn
			//create a nested for loop to use the info of the last for loop and compare values in every space every loop
			for(int j = i+1; j < myArray.length; j++ ) {
				//compare the space of the loop with the space defined for the smallestplace
				if(myArray[j] < myArray[smallestPlace]) {
					smallestPlace = j;//if find a new smallest place, define a new space
				}//close if statement
			}//close for loop nested
			//Swap the smallest number 
			int temp = myArray[i];
			myArray[i] = myArray[smallestPlace];
			myArray[smallestPlace] = temp;
			
		}//close main for loop
		int [] b = myArray;
		return b; //if the number was located, showing the number reference position
	}//close the method selectionSort

	//** Create the main method */
	public static void main(String[] args) {

		// Create the variables 
		int size = 0;
		int[] myArray = new int[0];
	
		// Scanner method to interact with the user
		Scanner input = new Scanner(System.in);

		// Print out the introduction of the Selection Sort 
		System.out.println("  ");
		System.out.println(" **************************** WELCOME TO SELECTION SORT ****************************");
		System.out.println("  ");
		System.out.println(" =================================================================================== ");
		System.out.println("             Selection Sort - this method organizes the chosen array.");
		System.out.println(" =================================================================================== ");
		System.out.println("  ");
		System.out.print(" Define the Size of the array (integer)   --  TYPE HERE   --> ");
		
		// Give the opportunity to the user specify the size of the array
		size = input.nextInt();
		// Define the size of the myArray variable, according with the insertion of the user
		myArray = new int[size];
		
		System.out.println("  ");//visual motive
		
		//Populate the myArray variable with random numbers and print out 
		System.out.print("        Array created  ----> ");
		//create the for loop to populate and print out
		for (int a = 0; a < myArray.length; a++) {
			myArray[a] = (int) ((Math.random() * 50) + 1);
			System.out.print(myArray[a] + " ");
		}//closing the for loop
		
		System.out.println("  ");//visual motive
		
		// create the Do looping to interact through the menu with the user
		do {
			
			System.out.println("  ");//visual motive
			
			// Print out the menu
			System.out.println("(1)Selection Sort  (2)Create a new array  (3)EXIT");
			System.out.println("  ");//visual motives
			System.out.print("Define an option -> ");
			
			// Create the switch statement to give the options for the user interact
			switch (input.nextInt()) {

			// create the option 1, to use the static method selection sort
			case 1:
				System.out.println(" ");//visual motive
				//Print out the myArray before method
				System.out.print("        Before         ----> ");
				for(int i =0; i< myArray.length ; i++) {
					System.out.print(myArray[i] + " ");
				}//close for loope
				//use the method selectionSort
				selectionSort(myArray);
				System.out.println("  ");//visual motive
				//Print out the myArray after method
				System.out.print("        After          ----> ");
				for(int i =0; i< myArray.length ; i++) {
					System.out.print(+ myArray[i] + " ");
				}//close for loop
				System.out.println(" ");//visual motive
				break;
				
			// create the option 2, to give the possibility to the user create a new array
			case 2:
				System.out.println("  ");//visual motive
				//Print out the interaction with the user
				System.out.print("Define the Size of the NEW array (integer) - TYPE HERE --> ");
				size = input.nextInt();// Give the opportunity to the user specify the size of the new myArray
				myArray = new int[size];//define the size of the new myArry variable
				System.out.println("  ");//visual motive
				System.out.println("  ");//visual motive
				//Print out the new value of the myArray populated
				System.out.print("    New Array created  ----> ");
				//creating a for loop to populate the array created
				for (int a = 0; a < myArray.length; a++) {
					myArray[a] = (int) ((Math.random() * 50) + 1);
					System.out.print(myArray[a] + " ");
				}//closing the for loop
				System.out.println("  ");//visual motive
				break;
				
				
			// create the option 3, to give the possibility to the user finalize the program
			case 3:
				System.out.println(" ");
				System.out.println("                           THE END    ");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong insertition");

			}// closing the switch statement
		} while (myArray.length != 0);
		input.close();// closing the Scanner object
	}// closing the main method
}//Closing the LinearSearch class












