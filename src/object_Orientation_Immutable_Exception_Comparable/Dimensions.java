package object_Orientation_Immutable_Exception_Comparable;


/** 
 * 
 *  *     	3. You will need to write your own dimensions class.
 *  
 *  @author lucasmaximo
 * */


/** Creating the class dimensions, in order to make all the measures of the apartment
 * 		3. You will need to write your own dimensions class.
 *  */
public class Dimensions {
	
	/**Creating the basics attributes of the Dimensions class */
	private double width;
	private double lenght;
	
	
	/** Creating the Dimensions class constructor */
	public Dimensions(double width, double lenght){
		this.width = width;
		this.lenght = lenght;
	}//closing the constructor
 
	
	/** Creating getters and setters */
	
	//Creating getter of the Width
	public double getWidth(){
		return width;
	}//closing getter of width
	
	//Creating getter of the Length
	public double getLenght() {
		return lenght;
	}//closing getter of length
	
	//Creating getter of the Width
	public void setWidth(double width) {
		this.width = width;
	}//closing the setWidth
	
	//Creating set of the Length
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}//closing the set of Length
	
	/** Creating the method to calculate the area, in order to make possible calculate area */
	public double calcArea() {
		return width * lenght;
	}//closing calculate area
	
	/** Create the to String method - overriding, to give the opportunity 
	 * to the objects been printed out, with description of the dimensions 
	 * */
	@Override
	public String toString() {
		return 	"Width - "+ getWidth() + " | Lenght - " + getLenght() ;		
	}//closing the toString override method
	
	/** Creating the bolean equals method */
	public boolean equals(Object a){
		//creating the if using the if statement in order to check the dimensions and analyzes them
		if (a instanceof Dimensions) {
			Dimensions temp = (Dimensions) a;
			if(temp.getWidth() == width && temp.getLenght() == lenght) {
				return true;
			}//closing the boolean equals method
		}//closing the if statement	
		return false;
	}//close boolean equals
	
}//closing dimensions class
