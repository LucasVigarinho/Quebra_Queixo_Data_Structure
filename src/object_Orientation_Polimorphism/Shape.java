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

/** Creating the class Shape */
public class Shape {
	
	//creating variable opacity which is going to be the attribute of every shape by inheritance
	private double opacity;
	
	/** creating a constructor of the opacity attribute, setting 100% by default if not specified */
	public Shape() {
		opacity = 100;
	}
	/** creating the constructor with the opacity, in case of it be specified */
	public Shape(double op) {
		opacity = op;
	}
	/** Creating a method to find out the opacity of each shape using getOpacity() */
	public double getOpacity(){
		return opacity;
	}
	/** Creating a method to be overriding to calculate its area using calcArea() */
	public  double calcArea() {
		return 0;
	}
	/** Creating a method to be overriding to make possible display individually each shape  */
	public void display() {
		
	}
	
}
