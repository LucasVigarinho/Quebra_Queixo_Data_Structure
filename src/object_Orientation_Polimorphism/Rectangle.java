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


/** Creating the class Rectangle inheriting from Shape class as super */
public class Rectangle extends Shape {

	//Creating the individuals attributes of its class (Rectangle)
	private double width;
	private double height;
	
	/** Creating the constructor of the Rectangle class, for a case of only the width and Height is informed */
	public Rectangle(double wid, double hei) {
		super();
		width = wid;
		height = hei;
	}//Closing the first constructor
	/** Creating the second constructor of the Rectangle class, inheriting also from the super class Shape, the opacity variable */
	public Rectangle(double wid, double hei, double op) {
		super(op);
		width = wid;
		height = hei;
	}//Closing the second constructor
	
	/** Creating the individual calculation of the Area, overriding the method */
	@Override
	public double calcArea() {
		return (getWidth()*getHeight());
	}//Closing the calcArea method
	/** Creating a method to find out the Width using getWidth() */
	public double getWidth() {
		return width;
	}//closing the getWidth
	/** Creating a method to find out the Height using getHeight() */	
	public double getHeight() {
		return height;
	}//closing the getHeight
	/** Creating the individual display, overriding the method */
	@Override
	public void display() {
		System.out.print(" Rectangle AREA 	--> ");
		System.out.printf("%.2f", calcArea());
		System.out.println(" ");
		System.out.print(" 		OPACITY	--> ");
		System.out.printf("%.2f", getOpacity());
	}//closing the display method
}//closing the rectangle class
