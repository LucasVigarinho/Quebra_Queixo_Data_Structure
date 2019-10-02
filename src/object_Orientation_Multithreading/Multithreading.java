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

/** Creating the main class, Multithreading as a driver class */
public class Multithreading {

	
	
	/** Creating the main method of the Multithreading class */
	public static void main(String[] args) throws Exception {
		
		
		/** Creating new objects and instantiating */
		Coin p1 = new Coin(0,0);
		Coin p2 = new Coin(0,0);
		Coin p3 = new Coin(0,0);
		
		/** Creating the Threads */
			
		Thread player01 = new Thread(p1);
		Thread player02 = new Thread(p2);
		Thread player03 = new Thread(p3);
		
		/** Setting names of the Threads, to make possible identify */
		//It was defined as a player, flipping coins concurrently
		player01.setName("Marcos");
		player02.setName("Paulo");
		player03.setName("Joao");


		
		//Starting all the threads
		player01.start();
		player02.start();
		player03.start();

		//opening a try catch , in case of interrupt 
		try {
			//utilizing join, to make possible ends the threads before the follow instructions
			player01.join();
			player02.join();
			player03.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//closing catch statement


		/** printing out the results, to be analyzed   */
		System.err.println(" ");
		System.err.println(" " + player01.getName() + " - Record Head: \t" + p1.getRecordHead());
		System.err.println(" " + player01.getName() + " - Record Tail: \t" + p1.getRecordTail());
		System.err.println(" ");
		System.err.println(" " + player02.getName() + " - Record Head: \t" + p2.getRecordHead());
		System.err.println(" " + player02.getName() + " - Record Tail: \t" + p2.getRecordTail());
		System.err.println(" ");
		System.err.println(" " + player03.getName() + " - Record Head: \t" + p3.getRecordHead());
		System.err.println(" " + player03.getName() + " - Record Tail: \t" + p3.getRecordTail());
		System.err.println(" ");
		
		
		/** printing out the highest general results, bringing the responsible, using a method from the Record class*/
		Record.displayGeneralRecord();
		
	}//closing the main method

}//closing the Multithreading class
