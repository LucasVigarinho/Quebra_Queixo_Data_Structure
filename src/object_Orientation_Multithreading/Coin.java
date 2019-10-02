package object_Orientation_Multithreading;

/** 
 * 
 * 		Week 11: Multithreading
 *		Write a program where 3 separate threads simulate flipping a coin. 
 *		The 3 threads should execute concurrently and each thread should do 1000 flips. 
 *		Keep track of what is currently the record number of consecutive heads/tails (separately) 
 *		and which thread produced that sequence. Every time a thread produces a longer sequence, 
 *		display a message on the screen. Make sure other threads can’t interfere when updating the current record.
 * 
 * */

/**
 * 
 * * @author Lucas Vigarinho - Multithreading
 */

import java.util.Random;

/** Creating the Coin class, implements the Runnable to allow concurrent accesses */
public class Coin implements Runnable  {

	/** Creating the variables to be used in the class for each thread */
	private Integer flips;
	private Integer lastHead;
	private Integer consecutiveHeads;
	private Integer lastTail;
	private Integer consecutiveTails;
	private Integer recordHead;
	private Integer recordTail;
	Random random = new Random();

	/** Creating the constructor of the class initializing all the variables */
	public Coin (int x, int y) {
		flips = 1000;
		lastHead = 0;
		consecutiveHeads = 0;
		lastTail = 0;
		consecutiveTails = 0;
		this.recordHead = x;
		this.recordTail = y;
	}//closing the constructor of the Coin class
	
	/** Creating getter to make possible others classes get to value of recordHead */
	public synchronized int getRecordHead() {
		return this.recordHead;
	}//close getRecordHead()

	/** Creating setter to make possible others classes set the value of recordHead
	 *  if the value which is coming were higher/greater them the value in the RecordHead */
	public synchronized void setRecordHead(int recordHead) {
		
		//create the if statement to limited only higher/greater number that the number in there already
		if(recordHead > getRecordHead()) {
			this.recordHead = recordHead;
		}//if statement 
		
	}//close setTecordHead

	/** Creating getters to make possible others classes get to value of recordHead */
	public synchronized int getRecordTail() {
		return this.recordTail;
	
	}//closing the getRecordTail()

	/** Creating setter to make possible others classes set the value of recordTail
	 * 	if the value which is coming were higher/greater them the value in the RecordTail */
	public synchronized void setRecordTail(int recordTail) {
		
		//create the if statement to limited only higher/greater number that the number in there already
		if(recordTail > getRecordTail()) {
			this.recordTail = recordTail;
		}//closing the if statement
		
	}//close setRecordTail
	
	/** Creating the run method of the class, to me run concurrently */
	public void run() {

		
		//open the try catch to take the interrupts
		try {
			
			//open the while loop to limit number of times flipping the coin
			while (this.flips >= 0) {
				
				//create the boolean variable randomly to simulate flip coin each loop (as the teacher ask to change)
				boolean auxiliarLastMatch = random.nextBoolean();
				
				// if is Tail
				if (auxiliarLastMatch == true) {
					
					/** if the last flip was different them zero  */
					if (this.lastTail != 0) {
						this.lastTail++; //increment the last tail counter
						this.consecutiveTails = this.lastTail; //increment the consecutive tails variable
						
						/** if the the record absorb before was smaller them the number coming now */
						if (getRecordTail() < this.consecutiveTails) {
							setRecordTail (this.consecutiveTails);/** insert the new value in the individual setRecordTail */
							Record.setRecordGTail(this.consecutiveTails, Thread.currentThread().getName());/** insert the new value in the general setRecordTail */
						}//if statement
						
						//give the zero to the variable of the opposite side of the coin
						this.consecutiveHeads = 0;
						this.lastHead = 0;
						
					} else {
						//give the zero to the variable of the opposite side of the coin(Head), and increment the last Tail
						this.lastHead = 0;
						this.lastTail++;
					}//closing the if for the tail
					
				} else {//if is Head
					
					/** if the last flip was different them zero */
					if (this.lastHead != 0) {
						this.lastHead++;//increment the last head counter
						this.consecutiveHeads = this.lastHead;//increment the consecutive heads variable
						
						/** if the the record absorb before was smaller them the number coming now */
						if (getRecordHead() < this.consecutiveHeads) {
							setRecordHead(this.consecutiveHeads);/** insert the new value in the individual setRecordhead */
							Record.setRecordGHead(this.consecutiveHeads, Thread.currentThread().getName());/** insert the new value in the general setRecordHead */
						}//if statement
						
						//give the zero to the variable of the opposite side of the coin
						this.consecutiveTails = 0;
						this.lastTail = 0;
						
					} else {
						//give the zero to the variable of the opposite side of the coin(Tail), and increment the last Head
						this.lastTail = 0;
						this.lastHead++;
					}//closing the if for the head
					
				}//closing if statement of both head or tail
				
				//giving the value to flip, in order to make sure that the thread which had used does not keep looping
				this.flips = this.flips - 1;
				Thread.sleep(5); //make the thread sleep temporarily 
				
			}//closing the while loop
			
		} catch (InterruptedException e) {
			
			//print out he name of the Thread if it was interrupted
			System.out.println(Thread.currentThread().getName() + ", Interrupted");
		}//closing the try Catch

	}//closing the run method

}//closing the coin class




