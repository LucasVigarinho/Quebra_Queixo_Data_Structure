package data_Structure_Sorting;

//import Scanner method
import java.util.Scanner;

/**
 * 
 * 		2.	InsertionSort.java 
 *			Create an array of integer data and sort it using the Insertion Sort algorithm. 
 *			Your method should be called insertionSort(), and should take in an array myArray. 
 *			Test your method by printing the array before and after you call your sorting algorithm.
 *
 */


/**
 * 
 * 	TIME COMPLEXITY
 * 	
 * 	InsertionSort.java			Best(Omega)		Average(Teta)		Worst(BigO)		
 * 		Average case - 	   	 	   (n)      		(n^2)			   (n^2)
 * 	
 * 
 * 	SPACE COMPLEXITY
 * 		Worst case 	 -		O(1)
 * 
 */

/** Creating the class Insertion Sort */ 
public class InsertionSort {

	/** Creating the static method integer with array return, receiving array myArray */ 
	public static int [] insertionSort(int [] myArray ) {
		
		//Creating a variable b, array, to receive myArray.
		int [] a = myArray;
		
		//Create the algorithm 
		for (int j = 0; j < a.length; j++) {
			int temp = a[j];
			int i = j -1;
			while(i >= 0 && a[i] > temp) {
				a[i+1]=a[i];
				i -= 1;
			}//while loop
			a[i+1] = temp;
		}//for loop
		//returning the array altered
		return a;
	}//method insertionSort

	/** Open the main method */
	public static void main(String[] args) {
		
		//Instantiating the Scanner method 
		Scanner input  = new Scanner (System.in);
		
		//Creating variable to receive the interaction with the user
		int size = 0;
		
		//Creating the array variable myArray 
		int [] myArray = null;
		
		//Creating the initialization of the program Insertion Sort
		System.out.println( "   ");
		System.out.println( "   ");
		System.out.println( "                    **************************                           " );
		System.out.println( "                    *     Insertion Sort     *                           " );
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
			System.out.println( " |1| Insert and Sort new number      |2| Create new array     |3| Exit          ");
			System.out.println( "   ");
			System.out.println( "   ");
			System.out.print(" Define an option -> ");
			
			//Create a switch statement inside of do looping, in order to create an interaction with the user
			switch (input.nextInt()) {
			
			//Create an option to insert new number
			case 1:
				System.out.println( "   ");
				
				
				//Print out myArray before insertion Sort method
				System.out.print(" MyyArray " + size + " positions BEFORE - Insert Sort  --> ");
				for(int i = 0; i < myArray.length; i++) {
				
						System.out.print(myArray[i] + " ,");
				
				}//for loop
				
				System.out.println( "   ");
				System.out.println( "   ");
				
				//print out myArray after insertion Sort method
				System.out.print(" MyyArray " + size + " positions AFTER  - Insert Sort  --> ");
				insertionSort(myArray);
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



