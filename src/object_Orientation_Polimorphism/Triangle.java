package object_Orientation_Polimorphism;
/**	Create classes Shape, 
 * 					     Circle, Rectangle, Square and Triangle with the correct hierarchy. 
 * 
 * 						Circle class should have a radius attribute. 
 * 						Rectangle and Square should have width and height attributes. 
 * 						Triangle should have the lengths of its three sides. 
 * 						
 * 						These attributes should be assigned using constructors. 
 * 						
 * 						Each shape should have two constructors, one that has an additional parameter opacity, and one that doesn’t. 
 * 						If opacity was not specified, it should be set to 100% by default. 
 * 
 * 			For each shape it should be possible to calculate its area using calcArea() 
 * 			and find out its opacity using getOpacity().
 * 	
 * 	Write a Driver class that has an array with 10 different shapes (Circle, Rectangle, Square and Triangle). 
 * 	Then create a loop that displays each shape’s area and opacity. 
 * 	Make sure that a square can’t have different width and height. 
 * 
 * 	@Lucas_Vigarinho_POLIMORPHISM;
 * */


/** Creating the class Triangle inheriting from Shape class as super */
public class Triangle extends Shape {

	//Creating the individuals attributes of its class (Triangle)
	private double length1;
	private double length2;
	private double length3;

	/** Creating the constructor of the Triangle class, for a case of only the lengths be is informed */
	public Triangle(double l1, double l2, double l3) {
		super();
		length1 = l1;
		length2 = l2;
		length3 = l3;
	}//Closing the first constructor
	/** Creating the second constructor of the Triangle class, inheriting also from the super class Shape, the opacity variable */
	public Triangle(double l1, double l2, double l3, double op) {
		super(op);
		length1 = l1;
		length2 = l2;
		length3 = l3;
	}//Closing the second constructor
	
	/** Creating the methods to find out the lengths using getLengths1, 2 and 3() */
	public double getLength1() {
		return length1;
	}//Closing the getLength1
	public double getLength2() {
		return length2;
	}//Closing the getLength2
	public double getLength3() {
		return length3;
	}//Closing the getLength3
	/** Creating the individual calculation of the Area, overriding the method */
	@Override
	public double calcArea() {
		double s = (getLength1() + getLength2() +getLength3())/2;
		
		return Math.sqrt(s*(s-getLength1())*(s-getLength2())*(s-getLength3()));
	}//Closing calcArea
	
	/** Creating the individual display, overriding the method */
	@Override
	public void display() {
		System.out.print(" Triangle 	AREA 	--> ");
		System.out.printf("%.2f", calcArea());
		System.out.println(" ");
		System.out.print(" 		OPACITY	--> ");
		System.out.printf("%.2f", getOpacity());

	}//closing display method
}//closing the Triangle class
