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


/** Creating the class Square inheriting from Rectangle class as super */
public class Square extends Rectangle{
	
	/** Creating the constructor of the Square class, inheriting from the super class Rectangle from for a case of only the width and Height is informed */
	public Square(double side) {
		super(side, side);
	}//Closing the first constructor
	/** Creating the constructor of the Square class, inheriting from the super class Rectangle from for a case the width, Height and opacity is informed */
	public Square(double side,  double opa) {
		super(side, side, opa);
	}//Closing the second constructor

	
	/** Creating the individual display, overriding the method */
	@Override
	public void display() {
		if(calcArea() == 0) {
			System.out.print(" Square ");
			System.out.println(" 	Square can’t have different Width and Height. ");
			System.out.print(" 	     	********************************************* ");
		}else {
			System.out.print(" Square 	AREA 	--> ");
			System.out.printf("%.2f", calcArea());
			System.out.println(" ");
			System.out.print(" 		OPACITY	--> ");
			System.out.printf("%.2f", getOpacity());
		}//closing the if statement
	}//closing the display method
}//closing the Square class
