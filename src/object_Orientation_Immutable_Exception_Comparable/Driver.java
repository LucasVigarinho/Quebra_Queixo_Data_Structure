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
 *    	@author lucasmaximo
 * 
 * */

/** Creating the Driver class, in order to test the application, functions and methods */
public class Driver {


	/** Creating the main method in order to manipulate and manage the program */
	public static void main(String[] args) {
		
		//Instantiating the ApartmentCollection class, to be accessed from the driver class
		ApartmentsCollection apartmentCollection = ApartmentsCollection.getApartmentsColletction();
		
		//Creating the variables to be using when inserting a new apartment. 
		//Defining dimensions of the first apartment
		Dimensions kitchen  = new Dimensions (3, 2);
		Dimensions living 	= new Dimensions (4, 5);
		Dimensions bedroom 	= new Dimensions (4, 5);
		Dimensions bathroom = new Dimensions (4, 5);
		//Creating the first apartment, instantiating it to the Apartment final class
		Apartment  ap1 		= new Apartment	 ("Av. Bartolomeu de Gusmão, 1", kitchen, living,  bedroom, bathroom);
		
		//Defining dimensions of the second apartment
		kitchen  = new Dimensions (3, 2);
		living   = new Dimensions (4, 5);
		bedroom  = new Dimensions (4, 5);
		bathroom = new Dimensions (4, 5);
		//Creating the second apartment, instantiating it to the Apartment final class
		Apartment ap2 = new Apartment("Av. Bartolomeu de Gusmão, 2", kitchen, living,  bedroom, bathroom);

		//Defining dimensions of the third apartment
		kitchen	 = new Dimensions (3, 2);
		living 	 = new Dimensions (4, 10);
		bedroom  = new Dimensions (4, 5);
		bathroom = new Dimensions (4, 5);
		//Creating the third apartment, instantiating it to the Apartment final class
		Apartment ap3 = new Apartment("Av. Jeronimooooooo 3", kitchen, living,  bedroom, bathroom);

		//Defining dimensions of the fourth apartment
		kitchen  = new Dimensions (4, 3);
		living   = new Dimensions (5, 6);
		bedroom  = new Dimensions (5, 6);
		bathroom = new Dimensions (6, 7);
		//Creating the fourth apartment, instantiating it to the Apartment final class
		Apartment ap4 = new Apartment("Av. Jeroberus 4 ", kitchen, living,  bedroom, bathroom);

		//Defining dimensions of the fifth apartment
		kitchen  = new Dimensions (6, 4);
		living   = new Dimensions (8,10);
		bedroom  = new Dimensions (8,10);
		bathroom = new Dimensions (8,50);
		//Creating the fifth apartment, instantiating it to the Apartment final class
		Apartment ap5 = new Apartment("Av. Jeroberus 4 ", kitchen, living,  bedroom, bathroom);
		
		//Defining dimensions of the sixth apartment
		kitchen  = new Dimensions (3, 2);
		living   = new Dimensions (4, 5);
		bedroom  = new Dimensions (4, 5);
		bathroom = new Dimensions (4, 5);
		//Creating the sixth apartment, instantiating it to the Apartment final class
		Apartment ap6 = new Apartment("Av. Bartolomeu de Gusmão, 2", kitchen, living,  bedroom, bathroom);

		
		//adding the apartments to the array List
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" Inserting apartments - following the instructions. ");
		System.out.println(" ----------------------------------------------------- ");
		System.out.println(" ");
		apartmentCollection.addApart(ap1);
		apartmentCollection.addApart(ap2);
		apartmentCollection.addApart(ap3);
		apartmentCollection.addApart(ap4);
		apartmentCollection.addApart(ap5);//Should be not add, because has the same address, of the forth apartment ap2
		apartmentCollection.addApart(ap6);//Should be not add, because has the same address, of the second apartment ap2
		
		//printing out all the apartments inserted in the array list
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" Printing out all the apartments inserted in the array list. ");
		System.out.println(" ----------------------------------------------------- ");
		System.out.println(" ");
		apartmentCollection.displayDetailsF();

		//Checking two apartments if they are equals, following the instructions
		//	4. Apartments should have an equals() method. 
		//     Two apartments are considered equal if all of their rooms have the same dimensions.
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" Verifying if equals two apartments, following the instructions. ");
		System.out.println(" ----------------------------------------------------- ");
		System.out.println(" Verifying if equals apart 1 - Av. Bartolomeu de Gusmão, 1 X apart 4 - Av. Jeroberus 4 ");
		System.out.println(" ");
		if((ap1.equals(ap4))==true){ System.out.println(" Apartment equal");   } else { System.out.println(" Apartment is not equal");};
		
		//Checking two apartments if they are equals, following the instructions
		//	4. Apartments should have an equals() method. 
		//     Two apartments are considered equal if all of their rooms have the same dimensions.
		System.out.println(" ");
		System.out.println(" Verifying if equals two apartments, following the instructions. ");
		System.out.println(" ----------------------------------------------------- ");
		System.out.println(" Verifying if equals apart 1 - Av. Bartolomeu de Gusmão, 1 X apart 2 - Av. Bartolomeu de Gusmão, 2");
		System.out.println(" ");
		if((ap1.equals(ap2))==true){ System.out.println(" Apartment equal");   } else { System.out.println(" Apartment is not equal");};
		
		//Checking two apartments, comparing between them, following the instructions
		//	6. Apartments should implement a Comparable interface. 
		//     Apartments are first compared based on the sum of their living room and bedroom dimensions.
		//     If the difference is less than 10%, 
		//     kitchen and bathroom are also included in the calculation and the result is recalculated.
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" Comparing two apartments, following the instructions. ");
		System.out.println(" ----------------------------------------------------- ");
		System.out.println(" Comparing apart 1 - Av. Bartolomeu de Gusmão, 1 X apart 4 - Av. Jeroberus 4 ");
		System.out.println(" ");
		System.out.println(" " + (ap1.compareTo(ap4)) + "%");
		System.out.println(" ");
		System.out.println(" Comparing two apartments, following the instructions. ");
		System.out.println(" ----------------------------------------------------- ");
		System.out.println(" Comparing apart 1 - Av. Bartolomeu de Gusmão, 1 X apart 2 - Av. Bartolomeu de Gusmão, 2 ");
		System.out.println(" ");
		System.out.println(" " + (ap1.compareTo(ap2)) + "%");
		System.out.println(" ");
		//Checking if the apartment is there, utilizing the finding apartment 
		System.out.println(" ");
		System.out.println(" Searching for the address - Av. Jeronimooooooo 3");
		System.out.println(apartmentCollection.findingApartment("Av. Jeronimooooooo 3"));
		
		//Removing apartment from the array list
		apartmentCollection.removeAp(ap4);
		
		
				//printing out all the apartments inserted in the array list, after remotion or not
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" Printing out all the apartments inserted in the array list. \n "
						+ "After apartment address - Av. Jeroberus 4 - was removed  ");
				System.out.println(" ----------------------------------------------------- ");
				System.out.println(" ");
				apartmentCollection.displayDetailsF();


	}// main method
}//close driver class
