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


/** Creating the Record Class*/
public class Record {


	//Creating the variable to absorb the general records
	private static int recordGHead;
	private static int recordGTail;
	
	//Creating the variable to absorb which coin was the one with more consecutive heads and tails
	private static String threadHeads;
	private static String threadTails;
	
	/** Creating getters and setters to identify the results */
	/** Creating getter of the Thread which had the higher consecutive times of heads */	
	public synchronized static String getThreadHeads() {
		return threadHeads;
	}//close getthreadHeads()
	
	/** Creating getter of the Thread which had the higher consecutive times of tails */	
	public synchronized static String getThreadTails() {
		return threadTails;
	}//close getThreadTails()
	
	/** Creating getter of the higher number of consecutive heads */
	public synchronized static int getRecordGHead() {
		return recordGHead;
	}//getRecordGHead()

	/** Creating setter of the higher number of consecutive head and the respective responsible Thread */
	public synchronized static void setRecordGHead(int recordHead, String name) {
		
		//create an if statement to increment the higher number of consecutive heads,
		//only if the number coming is higher than the last number inserted in the record
		if(recordHead > getRecordGHead()) {
			recordGHead = recordHead; /** incrementing record */
			threadHeads = name; /** Thread of the coin */
			System.out.println(" " + "Player:  " + name + ",  \t Consecutive Tails: \t" + recordHead );

		}//closing if statement
		
	}//close setRecordGHead

	/** Creating getter of the higher number of consecutive tails */
	public static int getRecordGTail() {
		return recordGTail;
	}//closing getRecordGTail()

	/** Creating setter of the higher number of consecutive Tail and the respective responsible Thread */
	public  synchronized static void setRecordGTail(int recordTail, String name) {
		
		//create an if statement to increment the higher number of consecutive tails,
		//only if the number coming is higher than the last number inserted in the record
		if(recordTail > getRecordGTail()) {
			recordGTail = recordTail;/** incrementing record */
			threadTails = name;	/** Thread of the coin */
			System.out.println(" " + "Player:  " + name + ",  \t Consecutive Heads: \t" + recordTail);
		}//closing if statement
		
	}//closing setRecordGTail
	
	/** Creating a display method to print out the the higher general record and the thread responsible */
	public static void displayGeneralRecord() {
		
	
	System.err.println(" " + "HIGHER GENERAL HEAD: \t" + getRecordGHead() + "  --  " +  getThreadHeads());
	System.err.println(" " + "HIGHER GENERAL TAIL: \t" + getRecordGTail() + "  --  " +  getThreadTails());
	
	}//closing displayGeneralRecord()
	
}//closing the Record class