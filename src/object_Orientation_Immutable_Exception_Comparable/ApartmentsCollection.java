package object_Orientation_Immutable_Exception_Comparable;

/** 
 * 
 * 	   	Week 9: Immutable Objects, Exception Handling, & Comparable
 *			
 *     1. Write a program that manages apartments. 
 *     	  	Because apartments cannot change after they were built, they should be made immutable.
 *     
 *     2. Each apartment has an address 
 *     							kitchen dimensions, 
 *     							living room dimensions, 
 *     							bedroom dimensions and 
 *     							bathroom dimensions.
 *     
 *     	3. You will need to write your own dimensions class.
 *     
 *  	4. Apartments should have an equals() method. 
 *     	 	Two apartments are considered equal if all of their rooms have the same dimensions.
 *     
 *     	5. Apartments should have a toString() method that displays all apartment details in text format.
 *     
 *  	6. Apartments should implement a Comparable interface. 
 *    		Apartments are first compared based on the sum of their living room and bedroom dimensions.
 *     			If the difference is less than 10%, 
 *     				kitchen and bathroom are also included in the calculation and the result is recalculated.
 *     
 *     	7. Apartments should be stored in ApartmentsCollection. 
 *     		ApartmentsCollection should be a Singleton and contain an Arraylist with apartments. 
 *     			It should have a method for adding a new apartment, 
 *     			making sure another apartment with the same address doesn’t exist already. 
 *     				A method for displaying details of all apartments. 
 *     				And a method for finding an apartment by its address and deleting it.
 * 
 * */

import java.util.ArrayList;
import java.util.Scanner;

/** Creating apartmentsCollection class as a singleton class */
public class ApartmentsCollection {
	
	/** Creating the basics attributes of the class and the final and unique instance, and also the array List, to manipulate all the data */
	private static ApartmentsCollection apColl = null;
	private ArrayList<Apartment> apartmentCollection; 
	
	/** Creating the constructor of the class */
	private ApartmentsCollection() {
		apartmentCollection = new ArrayList<Apartment>();
	}//closing the constructor of the class ApartmentsCollection
 
	/** Creating the method getApartmentsCollection, utilizing the class as bases and analyzing it, avoiding more than one instance*/
	public static ApartmentsCollection getApartmentsColletction(){ 
		if (apColl == null) {
			apColl = new ApartmentsCollection(); 
		}//close if statement	
		return apColl; 
	}//closing the Apartment Collection


	/**  Creating the Add method, following the instruction
	 *    7. It should have a method for adding a new apartment, 
	 *       making sure another apartment with the same address doesn’t exist already.
	 **/
	public void addApart(Apartment x) {
			//Creating an if statement, utilizing the finding apartment method, to avoid two apartments with the same address
			if (apColl.findingApartment(x.getAddress()) == null) {
				//adding apartment to the Array list, apartment collection, if has not any other apartment with the same address
				apColl.apartmentCollection.add(x);
				System.out.println(" ");
				//Printing out a message to confirm that the apartment has been added
				System.out.println(" The apartment address - " + x.getAddress() + ". was successfuly added!");
			//if has another apartment with the same address	
			}else {
				System.out.println(" ");
				//printing out the message in case of other appartment has the same address
				System.out.println(" Sorry! It's impossible add the apartment " + x.getAddress() + 
								 " \n Because there is another apartment with the same address.");
			}//close if statement
	}//close addApart

	/** Creating a method display details, for one apartment
	 *  */
	public static void displayDetails(Apartment x) {
		//Printing out all the necessary informations
		System.out.println( " \n" +
						    " Apartment address      : " + x.getAddress()  + "\n" + 
						    " Kitchen      dimensions: " + x.getKitchen()  + "\n" +
						    " Living Room  dimensions: " + x.getLiving()   + "\n" +
						    " Beddroom dimensions    : " + x.getBedroom()  + "\n" +
						    " Bathroom dimensions    : " + x.getBathroom());
	}//Closing the display details method
	
	/** Creating a method display details, for all apartment of the array list
	 *  7. A method for displaying details of all apartments.
	 *  */
	public  void displayDetailsF() {
		for(int i = 0; i < apColl.apartmentCollection.size(); i++) {
			System.out.println( " \n" +
				    " Apartment address      : " + apColl.apartmentCollection.get(i).getAddress()  + "\n" + 
				    " Kitchen      dimensions: " + apColl.apartmentCollection.get(i).getKitchen()  + "\n" +
				    " Living Room  dimensions: " + apColl.apartmentCollection.get(i).getLiving()   + "\n" +
				    " Beddroom dimensions    : " + apColl.apartmentCollection.get(i).getBedroom()  + "\n" +
				    " Bathroom dimensions    : " + apColl.apartmentCollection.get(i).getBathroom()         );
			
		}//close for loop	
	}//close display Details method to print all the apartments

	
	/**  Creating a method finding apartments, in order to locate equals addresses in the array list 
	 *    7. And a method for finding an apartment by its address and deleting it. 
	 * @return */
	public  Apartment findingApartment(String address) {
		//creating a for loop utilizing the size of the array list as a parameter to run all the array which was populated
		for (int i = 0; i < apColl.apartmentCollection.size(); i++) {
			//if any apartment has the same address of the apartment checked
			if(apColl.apartmentCollection.get(i).getAddress().equals(address)) {
				//return which apartment is that
				return apColl.apartmentCollection.get(i);
			}//close if statement
		}return null;
	}//close finding apartment method

	/** Creating the remove method, utilizing the finding method 
	 * 		7. And a method for finding an apartment by its address and deleting it.
	 * */
	public void removeAp(Apartment x) {
		Scanner temp = new Scanner (System.in);
		String ans = null;
		Apartment ap = (Apartment) x;
		//creating a if statement to check if has any apartment using the same address, utilizing the finding apartment method
		if(apColl.findingApartment(ap.getAddress()) != null) {
			System.out.println(" ");
			//Print out the message to interact with the user, before remove the apartment
			System.out.print(" Are you sure, that you want remove the apartment " + ap.getAddress() + " ?" + " (y) or (n) ? ->");
			//absorb the user answer
			ans = temp.nextLine();
			//if statement to remove or not according to the user answer
			if(ans.contains("y")) {
				//Create a for loop to identify the apartment by its address and identify its index
				for (int i = 0; i<	apColl.apartmentCollection.size(); i++) {
					//if statement to verify if the address is equals, finding the index
					if(ap.getAddress().equals(apColl.apartmentCollection.get(i).getAddress())){
						//removing the apartment utilizing the remove by index
						apColl.apartmentCollection.remove(i);
					}//close if statement
				}//close for loop
							
				System.out.println(" ");
				System.out.println(" The apartment " + ap.getAddress() + " was suscessfuly removed!");
			}//close if statement
		//if the apartment was no found
		}else {
			//Print out the message to let the user know what happened
			System.out.println(" The apartment was not found or it does not exist. ");
		}//close if statement
		temp.close();
	}//close remove apartment method
}//close the main class
