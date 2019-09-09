package data_Structure_Linear_Search;

import java.util.Scanner;

/** 
 * 3.	CircularQueue.java 
 * 		Implement and test our Circular Queue approach, also discussed in the lecture notes. 
 * 		
 * 		Create enqueue, dequeue, isEmpty, isFull methods, and test them in the main method
 * 
 * 		@Lucas_Vigarinho_HDC_PDS_2989295_Workbook2_Stacks_and_Queues
 * */
public class CircularQueue {


	
		//create attributes of the stack class
			public int head;
			public int capacity;
			public int [] circularQueue;
			public int tail;
	

			
			/** Created the Stack class constructor */
			public CircularQueue(int size) {
				//Initializing all the variables/attributes
				capacity = size;
				head = 0; //top in the Stack array is fix
				circularQueue = new  int [capacity];
				tail = 0; //Key variable to control the position of the array insertions 
			
				
			}//closing the constructor
			
			
			/** Create the enqueue method */ 
			public void enqueue () {
				//Create the if statement to test the Stack array
				if (isFull()) {
					//Print out message if is full
					System.out.println(" overflow");	
				}else {
					circularQueue [tail] = (int) ((Math.random()*50)+1);
					//Create the nest if statement in order to insert the number in the tail
					if(tail == circularQueue.length-1) {
						tail = 0;
					//Create the nest if statement in order to insert the last number, limited by the size of the Stack array			
					}else {
						tail = tail + 1;
					}//closing if statement
				}//closing the if statement
			}//Closing enqueue method
			
			
			/** Create the dequeue method */ 
			public void dequeue () {
				//Create the if statement to test the Stack array
				if (isEmpty()) {
					System.out.println("underflow");	
				}else { 
					circularQueue[head] = 0;
					//Create the nested if statement to move the numbers the left, limited by the size of the Stack array
					if(head == circularQueue.length-1) {
						head=0;
					}else {
						head++;
					}//closing if statement	
				}//closing if statement
			}//closing the pop method
			
			
			/** Create the isfull test method */
			public boolean isFull() {
				if (head == tail + 1 ||
						(head == 0 && tail == circularQueue.length-1)) {
					return true;
				}else {
					return false;
				}//closing if statement
			}//closing isFull method
			
			
			/** Create the isempty method */ 
			public boolean isEmpty() {
				if(head==tail ) {
					return true;
				}else {
					return false;
				}//closing if statement
			}//closing isEmpty method
			
			
			
			
		
			/** Create the main method */
			public static void main(String[] args) {
				
				//Create the variable to be used as the size of the array
				int size = 0;
				//Instantiating an object of the Scanner method to absorb the menu choices, in order to test the program
				Scanner input = new Scanner (System.in);
				
				//Print out the introduction of the Stack array
				System.out.println(" ************************ WELCOME TO CIRCULAR QUEUE ************************");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println(" Define what is the capacity of the Circular Queue, using integer.");
				System.out.println("  ");
				System.out.print(" Size of the Circular Queue array (integer) - TYPE HERE --> ");
				size = input.nextInt();//Give the opportunity to the user specify the size of the Stack array
				System.out.println("  ");
				CircularQueue n = new CircularQueue(size);//Instantiating the object of the class no static with the size informed by the user
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
						n.display();
						System.out.println((n.isFull()==true?"overflow":"Is not full"));
						break;
					case 2:
						n.dequeue();
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