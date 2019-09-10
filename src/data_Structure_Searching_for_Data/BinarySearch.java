package data_Structure_Searching_for_Data;


import java.util.Arrays;
import java.util.Scanner;



/**
 * 		Binarysearch.java 
 *  
 * 			  Note; make sure that the data is sorted beforehand! 
 * 					You can either use one of the previous sorting techniques or you can generate a sorted array to begin with.
 * 
 * 		Nomenclature: start, end, mid, loc and n.
 *		
 *		@LucasVigarinho
 *  
 *  */


public class BinarySearch {


/** CREATING 1.2 - An private integer array as member data. */
private int[] binary;
private int valueToBeFound;
private int size;

/** CREATING 1.3 - A public constructor with the same name as the java class. */
public BinarySearch(int size, int valueToBeFound, int[] binaryN) {
	binary = binaryN;
	this.valueToBeFound = valueToBeFound;
	this.size = size;
}// closing the linearsearch method

/** Creating the get method to get the number of the variable linear */
public int[] getBinary() {
	return binary;
}// closing the getLinear method

/** Creating the set method to set the number of the variable linear */
public void setBinary(int[] binary) {
	this.binary = binary;
}// closing the setLinear method

/** Creating the get method to get the number of the variable valueToBeFound */
public int getValueToBeFound() {
	return valueToBeFound;
}// closing the getValueToBeFound method

/** Creating the set method to set the number of the variable valueToBeFound */
public void setValueToBeFound(int valueToBeFound) {
	this.valueToBeFound = valueToBeFound;
}// closing the setValueToBeFound method

/**
 * Creating the get method to get the size of the array which going to be
 * created
 */
public int getSize() {
	return size;
}// closing the getSize method

/**
 * Creating the set method to set the size defined by the user to the new array
 */
public void setSize(int size) {
	this.size = size;
}// closing the setSize method

/**
 * CREATING 1.4 - A public method called toString which when called will create
 * a string showing the private member data of the class.
 * 
 * @return
 */
public void toString(int a[]) {

	System.out.println(Arrays.toString(a));
}// closing the tostring method


/** CREATING 1.5 - A public method called binarySearch with accepts a variable valueToBeFound as a parameter. */
public int binarySearch(int arr [],int n) {
	int start = 0;
	int end = arr.length-1;
	int mid = (start +end)/2;
	int loc = 0;
	
	while( start < end && arr[mid] != n){
		if(n < arr[mid] ){
			end = mid-1;
		}else {
			start = mid +1;
		}//closing if statement
			mid = (start+end)/2;
		}//closing while

		if(arr[mid]==n) {
			loc = mid;
		}else {
			loc = - 1;
		}//closing if statement
		return loc;
}//closign the search method



/** CREATING 1.6 - A public main method WHICH: */
public static void main(String[] args) {

	// Create the variable to be used as the size of the array
	int size = 0;
	int vlu = 0;
	int[] b = new int[0];
	int temp = 0;
	//instantiating an object of the linear search class
	BinarySearch ls = new BinarySearch(size, vlu, b);
	
	// Instantiating an object of the Scanner method to absorb the menu choices, in
	// order to test the program
	Scanner input = new Scanner(System.in);

	// Print out the introduction of the Self Organizing Search Program
	System.out.println("  ");
	System.out.println(" ********************************* WELCOME TO BINARY SEARCH *********************************");
	System.out.println("  ");
	System.out.println(" =========================================================================================== ");
	System.out.println(" Searches for a specific value using the approach of the binary search, among sorted numbers.");
	System.out.println(" =========================================================================================== ");
	System.out.println("  ");
	System.out.print(" Define the Size of the array (integer) - TYPE HERE --> ");
	size = input.nextInt();// Give the opportunity to the user specify the size of the array
	b = new int[size]; // defining the size of the local array
	ls.setSize(size); //setting the size
	System.out.println("  ");
	
	System.out.print(" Which number dou you want to search? from 1 to 50  --> ");
	vlu = input.nextInt(); //Give the opportunity to the user specify the number to be searched 
	ls.setValueToBeFound(vlu);

	//creating a for loop to populate the array created
	for (int a = 0; a < b.length; a++) {
		b[a] = (int) ((Math.random() * 50) + 1);
	}//closing the for loop
	Arrays.sort(b);
	ls.setBinary(b);//setting the array created
	System.out.println("  ");
	System.out.print("                     ");
	ls.toString(ls.getBinary());
	
	// create the Do looping to interact through the menu with the user
	do {
		
		System.out.println("  ");//visual motive
		
		// Print out the menu
		System.out.println("(1)Binary Search   (2)Display content  (3)Create a new array  (4)Search a new number  (5)EXIT");
		System.out.println("  ");
		System.out.print("Define an option -> ");
		// Create the switch statement to give the test possibilities
		switch (input.nextInt()) {

		// create the option 1, to search the array
		case 1:
			System.out.println(" ");//visual motive
			temp = ls.binarySearch(ls.getBinary(), ls.getValueToBeFound());
			System.out.print("                     ");
			ls.toString(ls.getBinary());
			System.out.println(" ");//visual motive
			//Creating an if statement to inform the user about the search, using the boolean answer of the search method
			if ( temp == -1) {
				System.out.println(" The number selected " + ls.getValueToBeFound() + " is not in that array.");
			} else {
				System.out.println(" The number selected " + ls.getValueToBeFound()
						+ " is located in the array space -> " + (temp));
			} // closing if statement
			break;
			
		// create the option 2, to display the array
		case 2:
			System.out.println("  ");
			System.out.print("                     ");
			ls.toString(ls.getBinary());
			break;
			
		// create the option 3, to give the possibility to the user create a new array and define a new number to be search
		case 3:
			System.out.println(" ");
			System.out.print(" Define the Size of the NEW array (integer) - TYPE HERE --> ");
			size = input.nextInt();// Give the opportunity to the user specify the size of the Stack array
			b = new int[size];
			ls.setSize(size);//setting the size of the new array
			
			//creating a for loop to populate the new array created
			for (int a = 0; a < b.length; a++) {
				b[a] = (int) ((Math.random() * 50) + 1);
			}//closing the for loop
			Arrays.sort(b);
			ls.setBinary(b);//setting the new array created
			System.out.println("  ");
			System.out.print("                     ");
			ls.toString(ls.getBinary());
			break;
			
		// create the option 4, to give the possibility to the user create a new array and define a new number to be search	
		case 4:
			System.out.println(" ");
			System.out.print(" Choose a new number to search?       from 1 to 50    -> ");
			vlu = input.nextInt();//Give the opportunity to the user specify the new number to be searched 
			ls.setValueToBeFound(vlu); //set the new number to be searched
			temp = ls.binarySearch(ls.getBinary(), ls.getValueToBeFound());
			System.out.println(" ");
			System.out.print("                     ");
			ls.toString(ls.getBinary());
			System.out.println(" ");//visual motive
			//Creating an if statement to inform the user about the search, using the boolean answer of the search method
			if ( temp == -1) {
				System.out.println(" The number selected " + ls.getValueToBeFound() + " is not in that array.");
			} else {
				System.out.println(" The number selected " + ls.getValueToBeFound()
						+ " is located in the array space -> " + (temp));
			} // closing if statement
			break;
			
		// create the option 5, to give the possibility to the user finalize the program
		case 5:
			System.out.println(" ");
			System.out.println("     THE END    ");
			System.exit(0);
			break;
		default:
			System.out.println("Wrong insertition");

		}// closing the switch statement
	} while (ls.getBinary().length != 0);
	input.close();// closing the Scanner object
}// closing the main method
}//Closing the LinearSearch class













