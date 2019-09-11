package data_Structure_Linear_Search;



/** 
 * 	Stack.java 
 * 		Implement a Stack in Java. Use an array. 
 * 
 * 			Your stack should have push, pop, isfull and isempty and top methods. 
 * 	
 * 				You can choose what the parameters & return type of these functions are. 
 * 
 * 				In your main method use each of the methods, and test out your Stack. 
 * 			
 * 				The Stack should be able to store integers. 
 * 
 * 				N.B. What should the difference between pop and top be?  
 * 
 *     @LucasVigarinho
 * */

/**
 * 
 * 	BigO Notation - TIME COMPLEXITY
 * 	
 * 	Stack.java				Access		Search		Insertion		Deletion
 * 		Average case - 		 O(n)		 O(n)         O(1)			  O(1)
 * 		Worst case	 -		 O(n)		 O(n)		  O(1)            O(1)
 * 
 * 	BigO Notation - SPACE COMPLEXITY
 * 		Worst case 	 -		O(n)
 * 
 */

import java.util.Scanner;
	
/** Created the Stack class*/ 
public class Stack {
	
	//create attributes of the stack class
	public int top;
	public int capacity;
	public int [] stack;
	public int key;

	
	/** Created the Stack class constructor */
	public Stack(int size) {
		//Initializing all the variables/attributes
		capacity = size;
		top = -1; //top in the Stack array is fix
		stack = new  int [capacity];
		key = -1; //Key variable to control the position of the array insertions 
		
	}//closing the constructor
	
	
	/** Create the push method */ 
	public void push () {
		//Create the if statement to test the Stack array
		if (isFull()) {
			top();
			
		}else {
			//Create the nest if statement in order to insert the first number
			if(key < 0) {
				stack [top+1] = (int) ((Math.random()*50)+1);
			//Create the nest if statement in order to make the number inserted move to the next field down, limited by the size of the Stack array			
			}else if(key==0) {
				for(int i = capacity-1; i > top+1; i-- ) {
					stack[i] = stack [i-1];
				}
				stack [top+1] = (int) ((Math.random()*50)+1);
			//Create the nest if statement in order to make the number inserted move to the next field down, limited by the size of the Stack array 
			}else {
				for(int i = capacity-1; i > top+1; i-- ) {
					stack[i] = stack [i-1];
				}
				stack [top+1] = (int) ((Math.random()*50)+1);		
			}//closing the if statement
			key++;
		}//closing if statement
		top();
	}//Closing push method
	
	
	/** Create the pop method */ 
	public void pop () {
		//Create the if statement to test the Stack array
		if (isEmpty()) {
			top();					
			}else { 
				//Create the nested if statement to move the numbers up, limited by the size of the Stack array
				if(key > 0) {
					for(int i = top+1; i < (capacity -1) ; i++ )  {
						stack[i] = stack [i+1];
					}
				//Create the nested if statement to move the numbers up, limited by the size of the Stack array
				}else if(key==capacity-1) {
					for(int i = top+1; i < (capacity -1) ; i++ )  {
						stack[i] = stack [i+1];
					}
					//Erasing the number which was repeated when going up
					stack [capacity-1] = 0;
				}else {
					//Create the nested if statement to move the numbers up, limited by the size of the Stack array
					for(int i = top+1; i < (capacity -1) ; i++ )  {
						stack[i] = stack [i+1];
					}//Closing for loop
				}//closing if statement
				
			}//closing the if statement
		stack [capacity-1] = 0;
		key--;
		top();
	}//closing the pop method
	
	
	/** Create the isfull test method */
	public boolean isFull() {
		if(key == stack.length-1) {
			return true;
		}else {
		return false;
		}//closing if statement
	}//closing isFull method
	
	
	/** Create the isempty method */ 
	public boolean isEmpty() {
		if(key == -1) {
			return true;
		}else {
			return false;
		}//closing if statement
	}//closing isEmpty method
	
	
	/** Create the top method */ 
	public void top() {
		if (isEmpty()) {
			System.out.println("underflow");
		}else if (isFull()){
			System.out.println("overflow");
		}else {
			System.out.println("The top is in the position - " + (top+1));
			System.out.println("\nThe Last Number inserted was - " + stack [top+1]);
			System.out.println("");
			
		}
	}
	/** Creating display method to have a better presentation of the Stack */
	public void display() {
		
		//Creating a for loop to print out the structure of the Stack 
		for(int i = 0; i < stack.length; i++) {
			System.out.println("  " + (i) + "   |   " + stack[i] + "  |  " + (( i == 0) ?"Top":" "));
			System.out.println("      ========");
		}//closing for loop
		System.out.println(" ");
	}//closing display method
	
	/** Create the main method */
	public static void main(String[] args) {
		
		//Create the variable to be used as the size of the array
		int size = 0;
		//Instantiating an object of the Scanner method to absorb the menu choices, in order to test the program
		Scanner input = new Scanner (System.in);
		
		//Print out the introduction of the Stack array
		System.out.println(" ************************ WELCOME TO STACK ************************");
		System.out.println("  ");
		System.out.println("                         (Last In First Out)                       ");
		System.out.println("  ");
		System.out.println(" Define what is the capacity of the Stack, using integer.");
		System.out.println("  ");
		System.out.print(" Size of the Stack array (integer) - TYPE HERE --> ");
		size = input.nextInt();//Give the opportunity to the user specify the size of the Stack array
		System.out.println("  ");
		Stack n = new Stack(size);//Instantiating the object of the class no static with the size informed by the user
		System.out.println("           Which test dou you want to try?         ");

		//create the Do looping to interact through the menu with the user
		do{
			System.out.println("  ");
			//Print out the menu
			System.out.println("(1)push   (2)pop   (3)isfull   (4)isempty   (5)top   (6)Display   (7)EXIT");
			
			//Create the switch statement to give the test possibilities
			switch (input.nextInt()) {
			
			case 1:
				n.push();
				n.display();
				break;
			case 2:
				n.pop();
				n.display();
				break;			
			case 3:
				n.isFull();
				System.out.println((n.isFull()==false?"Is not full":"overflow"));
				break;
			case 4:
				n.isEmpty();
				System.out.println((n.isEmpty()==false?"Is not empty":"underflow"));
				break;
			case 5:
				n.top();
				break;
			case 6:
				n.display();
				break;
			case 7:
				System.out.println(" ");
				System.out.println("     THE END    ");
				System.exit(0);
				break;
			default: 
				System.out.println("Wrong insertition");
				
			}//closing the switch statement
			
		}while(n.isFull() != true);

		input.close();//closing the Scanner object
		

	}//closing the main method

}//closing the Stack class
