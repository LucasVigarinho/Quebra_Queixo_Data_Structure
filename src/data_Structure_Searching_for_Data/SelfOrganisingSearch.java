package data_Structure_Searching_for_Data;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 	2.	SelfOrganisingSearch.java 
 * 			
 * 		Let’s implement an example of Self Organising Search. 
 * 	
 * 		2.1 - Rewrite your search() method, but this time, each time an item is found, 
 * 			  move it to the first position in the list (and move everything else back one space to make room). 
 * 
 * 		2.2 - Test your search algorithm by printing the contents of the array every time you do a search to see how it changes. 
 * 
 * 		3.3 - Your array should print horizontally like follows using a toString method which you will write.
 *
 *										A = 1 2 3 4 5		(rather than in vertically)
 *		
 *		@LucasVigarinho
 *  
 *  */

/**
 * 
 * 	BigO Notation - TIME COMPLEXITY
 * 	
 * 	SelfOrganisingSearch.java		Access		Search		Insertion		Deletion
 * 		Average case - 		 
 * 		Worst case	 -		
 * 
 * 	BigO Notation - SPACE COMPLEXITY
 * 		Worst case 	 -		
 * 
 */

public class SelfOrganisingSearch {

	/** CREATING 1.2 - An private integer array as member data. */
	private int[] linear;
	private int valueToBeFound;
	private int size;

	/** CREATING 1.3 - A public constructor with the same name as the java class. */
	public SelfOrganisingSearch(int size, int valueToBeFound, int[] linearN) {
		linear = linearN;
		this.valueToBeFound = valueToBeFound;
		this.size = size;
	}// closing the linearsearch method

	/** Creating the get method to get the number of the variable linear */
	public int[] getLinear() {
		return linear;
	}// closing the getLinear method

	/** Creating the set method to set the number of the variable linear */
	public void setLinear(int[] linear) {
		this.linear = linear;
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

	/**
	 * CREATING 1.5 - A public method called search with accepts a variable
	 * valueToBeFound as a parameter.
	 */
	public int selfOrganisingSearch(int arr[], int n) {

		// Creating the local variable
		int i = 0;
	
		// creating while statement to define for how long the variable í is going to
		// increase
		while (i < arr.length && arr[i] != n) {
			i++;
		} // close while statement
		

		// creating an if statement to give the return number of the search
		if (i == arr.length) {
			return -1; //if the number was not located in the array
		//creating on if else more to avoid mistake of array space and crash the program 
		} else if (i == 0) {
				return i; //if the number was located, showing the number reference position
		}else {
		int temp = arr[i-1];
		arr[i-1] = arr[i];
		arr[i] = temp;
		i -= 1;
		setLinear(arr);
		return i; //if the number was located, showing the number reference position
		} // closing the if statement
	}// closing search method


	/** CREATING 1.6 - A public main method WHICH: */
	public static void main(String[] args) {

		// Create the variable to be used as the size of the array
		int size = 0;
		int vlu = 0;
		int[] b = new int[0];
		int temp = 0;
		//instantiating an object of the linear search class
		SelfOrganisingSearch ls = new SelfOrganisingSearch(size, vlu, b);
		
		// Instantiating an object of the Scanner method to absorb the menu choices, in
		// order to test the program
		Scanner input = new Scanner(System.in);

		// Print out the introduction of the Self Organizing Search Program
		System.out.println("  ");
		System.out.println(" **************************** WELCOME TO SELF ORGANIZING SEARCH ****************************");
		System.out.println("  ");
		System.out.println(" =========================================================================================== ");
		System.out.println(" Searches for a specific value in the array and move its value, one space back of the array.");
		System.out.println(" =========================================================================================== ");
		System.out.println("  ");
		System.out.print(" Define the Size of the array (integer)   --  TYPE HERE   --> ");
		size = input.nextInt();// Give the opportunity to the user specify the size of the array
		b = new int[size]; // defining the size of the local array
		ls.setSize(size); //setting the size
		System.out.println("  ");
		
		System.out.print(" Which number dou you want to find/move? -- from 1 to 50  --> ");
		vlu = input.nextInt(); //Give the opportunity to the user specify the number to be searched 
		ls.setValueToBeFound(vlu);

		//creating a for loop to populate the array created
		for (int a = 0; a < b.length; a++) {
			b[a] = (int) ((Math.random() * 50) + 1);
		}//closing the for loop
		ls.setLinear(b);//setting the array created
		System.out.println("  ");
		System.out.print("                     ");
		ls.toString(ls.getLinear());
		
		// create the Do looping to interact through the menu with the user
		do {
			
			System.out.println("  ");//visual motive
			
			// Print out the menu
			System.out.println("(1)Self Organizing   (2)Display content  (3)Create a new array  (4)Search a new number  (5)EXIT");

			System.out.println("  ");
			System.out.print("Define an option -> ");
			// Create the switch statement to give the test possibilities
			switch (input.nextInt()) {

			// create the option 1, to search the array
			case 1:
				System.out.println(" ");//visual motive
				temp = ls.selfOrganisingSearch(ls.getLinear(), ls.getValueToBeFound());
				System.out.print("                     ");
				ls.toString(ls.getLinear());
				System.out.println(" ");//visual motive
				//Creating an if statement to inform the user about the search, using the boolean answer of the search method
				if ( temp == -1) {
					System.out.println(" The number selected " + ls.getValueToBeFound() + " is not in that array.");
				} else {
					System.out.println(" The number selected " + ls.getValueToBeFound()
							+ " was located in the array space -> " + (temp+1));
					System.out.println(" The number selected " + ls.getValueToBeFound()
					+ " now moved and its location to the array space -> " + (temp));
				} // closing if statement
				break;
				
			// create the option 2, to display the array
			case 2:
				System.out.println("  ");
				System.out.print("                     ");
				ls.toString(ls.getLinear());
				break;
				
			// create the option 3, to give the possibility to the user create a new array and define a new number to be search
			case 3:
				System.out.println("  ");
				System.out.print(" Define the Size of the NEW array (integer) - TYPE HERE --> ");
				size = input.nextInt();// Give the opportunity to the user specify the size of the Stack array
				b = new int[size];
				ls.setSize(size);//setting the size of the new array
				
				//creating a for loop to populate the new array created
				for (int a = 0; a < b.length; a++) {
					b[a] = (int) ((Math.random() * 50) + 1);
				}//closing the for loop
				ls.setLinear(b);//setting the new array created
				System.out.println("  ");
				System.out.print("                     ");
				ls.toString(ls.getLinear());
				break;
				
			// create the option 4, to give the possibility to the user create a new array and define a new number to be search	
			case 4:
				System.out.println("  ");
				System.out.print("           Choose a new number to search/move?        -> ");
				vlu = input.nextInt();//Give the opportunity to the user specify the new number to be searched 
				ls.setValueToBeFound(vlu); //set the new number to be searched
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
		} while (ls.getLinear().length != 0);
		input.close();// closing the Scanner object
	}// closing the main method
}//Closing the LinearSearch class