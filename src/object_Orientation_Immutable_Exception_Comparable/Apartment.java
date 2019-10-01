package object_Orientation_Immutable_Exception_Comparable;



/** 
 * 
 *  @author lucasmaximo 2989295
 *  
 * */


/** Creating the Apartment class --  
 * 1. Write a program that manages apartments.  */
public final class Apartment implements Comparable<Apartment> {

	/** Creating the final attributes, immutable, as asked on the exercise 
	 * 	Because apartments cannot change after they were built, they should be made immutable.
	 * */
	private final String address;	
	private final Dimensions kitchen;
	private final Dimensions living;
	private final Dimensions bedroom;
	private final Dimensions bathroom;
	
	
	/** Creating the constructor of apartment, detailing the measures of each room */
	public Apartment( String address, Dimensions kitchen, Dimensions living,  Dimensions bedroom, Dimensions bathroom) {

		//Absorbing the data sent
		this.address = address;	
		this.kitchen = kitchen;
		this.living = living;
		this.bedroom = bedroom;
		this.bathroom = bathroom;

	}//closing constructor
	
	/** Creating the getters to use the information in the program  */
	
	//Creating the get Address method
	public String getAddress() {
		return address;
	}//closing getter getAddress
	
	//Creating the getter for the kitchen, utilizing the Dimensions class as a type 
	public Dimensions getKitchen() {
		return kitchen;
	}//closing getter kitchenDimensions
	
	//Creating the getter for the Living Room, utilizing the Dimensions class as a type 
	public Dimensions getLiving() {
		return living;
	}//closing getter livingroom dimensions
	
	//Creating the getter for the Bedroom, utilizing the Dimensions class as a type
	public Dimensions getBedroom() {
		return bedroom;
	}//closing the getter bedroom dimensions
	
	//Creating the getter for the Bedroom, utilizing the Dimensions class as a type
	public Dimensions getBathroom() {
		return bathroom;
	}//closing bathroom dimensions
	
	
	
	/** Create the to String method - overriding 
	 *  5. Apartments should have a toString() method that displays all apartment details in text format.
	 * */
	@Override
	public String toString() {
		//give the return data, printing out all the details of the Apartment 
		return 	" ----------------------------------------------------- " + "\n" +
				" \n" + 
				" Apartment Address      -> " + getAddress()  +  " \n" +
				" Kitchen Dimensions     -> " + getKitchen()  +  " \n" +
				" Living Room Dimensions -> " + getLiving()   +  " \n" +
				" Bedrom Dimensions 	-> " + getBedroom()  +  " \n" +
				" Bathroom Dimensions    -> " + getBathroom();			
		
	}//Closing the to String method
	
	/** Creating the compare To, following the instructions
	 * 
	 *     	6. Apartments should implement a Comparable interface. 
	 *    		Apartments are first compared based on the sum of their living room and bedroom dimensions.
	 *     		If the difference is less than 10%, 
	 *     		kitchen and bathroom are also included in the calculation and the result is recalculated.
	 *  */
	public int compareTo(Apartment x) {
		//Creating a local variable in order to calculate the first part, if the apartment is in between of the 10% higher or lower
		double percentsDiff = (((x.living.calcArea() + x.bedroom.calcArea()) / 
								(living.calcArea() + bedroom.calcArea())) * 100) - 100;
		//creating the if statement and utilizing the local variable to compare the values
        if (percentsDiff < 10 && percentsDiff > -10) {
        	//incrementing the values in the local variable, in case of the objects of the comparison are in the gap of the 10%
        	percentsDiff = (x.living.calcArea() + x.bedroom.calcArea() + x.kitchen.calcArea() + x.bathroom.calcArea()) / 
        					  (living.calcArea() + bedroom.calcArea() + kitchen.calcArea() + bathroom.calcArea()) * 100 - 100;
        	//Casting the return, because all the attributes calculate were double and the method requires an integer return
            return (int) percentsDiff;
        }
        else
        	//Casting the return, because all the attributes calculate were double and the method requires an integer return
            return (int) percentsDiff;
	}//close the compareTo method


	
	/** Creating the equals methods, following the instructions
	 * 
	 *    4. Apartments should have an equals() method. 
	 *     	 Two apartments are considered equal if all of their rooms have the same dimensions.
	 *  */
	@Override
	public boolean equals(Object x) {
		//Creating the if statement using the instance of, in order to check if the object has the patter necessary of the Apartment objects, to be analyzed
		if(!(x instanceof Apartment)) 	
			//return statement false if the object does not has the patter necessary
			return false;
			//create the local variable to absorb the object considered an Apartment
			Apartment temp = (Apartment) x;
			//creating the if statement comparing between the objects/apartments, all the rooms
			if (temp.kitchen.equals(kitchen)  && temp.living.equals(living) &&
				temp.bedroom.equals(bedroom) && temp.bathroom.equals(bathroom)){
					//Giving the return statement as true if they have the same dimensions
					return true;
				}else
					//Giving the return statement as false if they did not have the same dimensions calculated above
					return false;		
	}//closing the equals method 
	

}//closing the apartment class
