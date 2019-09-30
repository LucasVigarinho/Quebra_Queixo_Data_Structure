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


/** Creating the class Circle inheriting from Shape class as super */
public class Circle extends Shape{
	
	//Creating the individuals attributes of its class (Circle)
	private double radius;
	private double pi;
	
	/** Creating the constructor of the Circle class, for a case of only the radius is informed, and also defining others variables */
	public Circle(double rad) {
		super();
		radius = rad;
		pi = Math.PI;
	}//Closing the first constructor 
	
	/** Creating the second constructor of the Circle class, inheriting also now from the super class Shape, the opacity variable */
	public Circle(double rad, double op) {
		super(op);
		radius = rad;
		pi = Math.PI;
	}//Closing the second constructor
	
	/** Creating the individual calculation of the Area, overriding the method */
	@Override
	public double calcArea() {
		return (pi * Math.pow(radius,2));
	}//Closing the calcArea method
	
	/** Creating the individual display, overriding the method */
	@Override
	public void display() {
		System.out.print(" Circle 	AREA 	--> ");
		System.out.printf("%.2f", calcArea());
		System.out.println(" ");
		System.out.print(" 		OPACITY	--> ");
		System.out.printf("%.2f", getOpacity());
	}//Closing the display method
}//closing the Circle class
