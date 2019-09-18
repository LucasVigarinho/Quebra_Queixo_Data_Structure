package data_Structure_Sorting;


/**
 * 
 * 		3.	QuickSort.java 
 *		
 *
 */


/**
 * 
 * 	TIME COMPLEXITY
 * 	
 * 	QuickSort.java			Best(Omega)		Average(Teta)		Worst(BigO)		
 * 		Average case - 	   	(n log(n))       (n log(n))			  (nˆ2)					    
 * 	
 * 
 * 	SPACE COMPLEXITY
 * 		Worst case 	 -		 (n log(n))
 * 
 */

import java.util.Scanner;

/** Creating QuickSort class */
public class QuickSort {


	/** Creating the static void method in order to sort  myArray, receiving  myArray */ 
	public static void  quickSort(int [] myArray ) {
		quickSort(myArray, 0, myArray.length - 1);


	}//closing method quick sort

	public static void quickSort(int[] myArray, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(myArray, first, last);
			quickSort(myArray, first, pivotIndex - 1);
			quickSort(myArray, pivotIndex + 1, last);

		}//closing if statement
	}//closing method quick sort overloaded

	/** Creating method for partition myArray */
	public static int partition(int[] myArray, int first, int last) {
		int pivot = myArray[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search
		
		while (high > low) {
			// Search forward from left
			while (low <= high && myArray[low] <= pivot)
				low++;

			// Search backward from right
			while (low <= high && myArray[high] > pivot)
				high--;

			// Swap two elements in the list
			if (high > low) {
				int temp = myArray[high];
				myArray[high] = myArray[low];
				myArray[low] = temp;
			}//closing if statement
		}//closing first while statement

		while (high > first && myArray[high] >= pivot)
			high--;

		// Swap pivot with list[high]
		if (pivot > myArray[high]) {
			myArray[first] = myArray[high];
			myArray[high] = pivot;
			return high;
		}else {
			return first;
		}//closing if statement
	}//closing partition method


	/** Open the main method */
	public static void main(String[] args) {

		//Instantiating the Scanner method 
		Scanner input  = new Scanner (System.in);

		//Creating variable to receive the interaction with the user
		int size = 0;

		//Creating the array variable myArray 
		int [] myArray = null;

		//Creating the initialization of the program Buble Sort
		System.out.println( "   ");
		System.out.println( "   ");
		System.out.println( "                    **************************                           " );
		System.out.println( "                    *       QuickSort        *                           " );
		System.out.println( "                    **************************                           " );
		System.out.println( "   ");
		System.out.println( "   ");

		//Print out the interaction with the user, to absorb the size of the array to be sorted
		System.out.print(" Define the size of the array to be sorted   --> ");
		size = input.nextInt();
		myArray = new int [size]; 
		System.out.println( "   ");
		System.out.println( "   ");

		//Print out myArray defined
		System.out.print(" The array created with " + size + " positions         --> ");
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = ((int) (Math.random()*26)+1);
			System.out.print(myArray[i] + " ,");
		}//for loop

		//Create do loop in order to make a menu possible 
		do {
			System.out.println( "   ");
			System.out.println( "   ");
			System.out.println( "   ");
			System.out.println( "                               MENU                                     ");
			System.out.println( "   ");
			System.out.println( " |1| Quick sort myArray      |2| Create new array     |3| Exit          ");
			System.out.println( "   ");
			System.out.println( "   ");
			System.out.print(" Define an option -> ");

			//Create a switch statement inside of do looping, in order to create an interaction with the user
			switch (input.nextInt()) {

			//Create an option to insert new number
			case 1:
				System.out.println( "   ");


				//Print out myArray before Bubble Sort
				System.out.print(" MyyArray " + size + " positions BEFORE - Insert Sort  --> ");
				for(int i = 0; i < myArray.length; i++) {
					System.out.print(myArray[i] + " ,");
				}//for loop

				System.out.println( "   ");
				System.out.println( "   ");

				//print out myArray after Bubble Sort method
				System.out.print(" MyyArray " + size + " positions AFTER  - Insert Sort  --> ");
				quickSort(myArray);
				for(int i = 0; i < myArray.length; i++) {
					System.out.print(myArray[i]+ " ,");
				}//for loop
				System.out.println( "   ");
				break;

				//Create an option to create a new array
			case 2:
				System.out.println( "   ");
				//Print out the interaction with the user, to absorb the size of the NEW array to be sorted
				System.out.print(" Define the size of the NEW array to be sorted--> ");
				size = input.nextInt();
				myArray = new int [size]; 

				System.out.println( "   ");
				System.out.println( "   ");

				//Print out the NEW myArray defined
				System.out.print(" The New array created with " + size + " positions         --> ");
				for(int i = 0; i < myArray.length; i++) {
					myArray[i] = ((int) (Math.random()*26)+1);
					System.out.print(myArray[i] + " ,");
				}//for loop
				break;

				//Create an option to exit of the system
			case 3:
				System.out.println( "   ");
				System.out.println( "                          The End                                     ");
				System.exit(0);
				break;

			default:
				System.out.println( "   ");
				System.out.println("Wrong inserction");
				System.out.println( "   ");
			}//close switch


		}while (myArray.length != 0);

		input.close();

	}//main method
}//insertionSort class



