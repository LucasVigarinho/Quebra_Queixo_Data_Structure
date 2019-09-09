package data_Structure_Linear_Search;

import java.util.Scanner;

/** 
 * 2.	NaiveQueue.java 
 * 		
 * 		Implement and test our naïve Queue approach, as discussed in the lecture notes. 
 * 		
 * 		Create enqueue, dequeue, isEmpty, isFull methods, and test them in the main method.
 * 
 * 		@LucasVigarinho
 * */
public class NaiveQueue {



	//create attributes of the stack class
		public int head;
		public int capacity;
		public int [] naiveQueue;
		public int tail;

		
		/** Created the Stack class constructor */
		public NaiveQueue(int size) {
			//Initializing all the variables/attributes
			capacity = size;
			head = -1; //top in the Stack array is fix
			naiveQueue = new  int [capacity];
			tail = -1; //Key variable to control the position of the array insertions 
			
		}//closing the constructor
		
		
		/** Create the push method */ 
		public void enqueue () {
			//Create the if statement to test the Stack array
			if (isFull()) {
				//Print out message if is full
				System.out.println(" overflow");	
			}else {
				//Create the nest if statement in order to insert the number in the tail
				if(tail < naiveQueue.length) {
					naiveQueue [tail+1] = (int) ((Math.random()*50)+1);
				//Create the nest if statement in order to insert the last number, limited by the size of the Stack array			
				}else if (tail == naiveQueue.length){
					naiveQueue [tail] = (int) ((Math.random()*50)+1);		
					}
				tail +=1;
				}//closing the if statement
			
			//closing if statement
			
		}//Closing push method
		

		/** Create the pop method */ 
		public void dequeue () {
			//Create the if statement to test the Stack array
			if (isEmpty()) {
					tail = -1;
					head = -1;
					System.out.println("underflow");	
				
				}else { 
					//Create the nested if statement to move the numbers the left, limited by the size of the Stack array
					if(tail+1 > 0) {
						for(int i = head+1; i < (naiveQueue.length -1) ; i++ )  {
							naiveQueue[i] = naiveQueue [i+1];
						}//closing for loop
					//Create the nested if statement to move the numbers the left following the tail and the size of the array
					}else if (tail+1 == head+1){
						//Create the nested if statement to move the numbers up, limited by the size of the Stack array
						for(int i = (head+1); i < (naiveQueue.length  -1) ; i++ )  {
							naiveQueue[tail+1] = naiveQueue [i+1];
						}//Closing for loop
					}//closing if statement
				}//closing the if statement
			naiveQueue [capacity-1] = 0;
			tail--;
		}//closing the pop method
		
		
		/** Create the isfull test method */
		public boolean isFull() {
			if(tail == naiveQueue.length-1) {
				return true;
			}else {
				return false;
			}//closing if statement
		}//closing isFull method
		
		
		/** Create the isempty method */ 
		public boolean isEmpty() {
			if(tail < 0) {
				return true;
			}else {
				return false;
			}//closing if statement
		}//closing isEmpty method
		
		
		/** Creating display method to have a better presentation of the Stack */
		public void display() {
			System.out.print("       ");
				//Creating a for loop to print out the structure of the Stack 
				for(int n = 0; n < naiveQueue.length; n++) {
					System.out.print(( (n==tail+1)?" Tail":"       "));
				}//closing for loop
			System.out.println("");
			System.out.print("       ");
				//Creating a for loop to print out the structure of the Stack 
				for(int n = 0; n < naiveQueue.length; n++) {
					System.out.print( "_____ " + " ");
				}//closing for loop
			System.out.println("");
			System.out.print((head+1 == 0)?" Head ":"");
				//Creating a for loop to print out the structure of the Stack 
				for(int i = 0; i < naiveQueue.length; i++) {
					System.out.print( "   " + naiveQueue[i] + " | " );

				}//closing for loop
			System.out.println("");
			System.out.print("       ");
				for(int n = 0; n < naiveQueue.length; n++) {
					System.out.print( "----- " + " ");
				}//closing for loop
			System.out.println(" ");
			System.out.print("         ");
				//Creating a for loop to print out the structure of the Stack 
				for(int n = 0; n < naiveQueue.length; n++) {
				System.out.print(( n + "      "));
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
			System.out.println(" ************************ WELCOME TO NAIVE QUEUE ************************");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println(" Define what is the capacity of the Naive Queue, using integer.");
			System.out.println("  ");
			System.out.print(" Size of the Naive Queue array (integer) - TYPE HERE --> ");
			size = input.nextInt();//Give the opportunity to the user specify the size of the Stack array
			System.out.println("  ");
			NaiveQueue n = new NaiveQueue(size);//Instantiating the object of the class no static with the size informed by the user
			System.out.println("           Which test dou you want to try?         ");

			//create the Do looping to interact through the menu with the user
			do{
				System.out.println("  ");
				//Print out the menu      
				System.out.println("(1)enqueue   (2)dequeue   (3)isfull   (4)isempty   (5)Display   (6)EXIT");
				
				//Create the switch statement to give the test possibilities
				switch (input.nextInt()) {
				
				case 1:
					n.enqueue();
					System.out.println((n.isFull()==true?"overflow":" "));
					n.display();
					
					break;
				case 2:
					n.dequeue();
					if(n.isEmpty()==false) { 
						System.out.print(" ");
					}else{
						n.tail = -1;
					}
					n.display();
					break;			
				case 3:
					
					n.isFull();
					System.out.println((n.isFull()==true?"overflow":"Is not full"));
					break;
				case 4:
					n.isEmpty();
					System.out.println((n.isEmpty()==false?"Is not empty":"underflow"));
					
					break;
				case 5:
					n.display();
					break;
				case 6:
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
