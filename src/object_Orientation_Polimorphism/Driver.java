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

/** Creating the class Drive with the main method */
public class Driver {
	
	/** Creating the constructor of the Driver class */
	public Driver() {
	}
	
	/** creating the main method */
	public static void main(String[] args) {

		//Creating an array with 10 different shapes (Circle, Rectangle, Square and Triangle).
		Shape [] shapes =  {new Rectangle(10, 6, 20), 
							new Rectangle(10, 6, 30), 
							new Circle(5, 40), 
							new Circle(10, 50), 
							new Square(4, 60), 
							new Square(8), 
							new Triangle(10, 4, 8, 80), 
							new Triangle(8, 8, 9),
							new Circle(10), 
							new Square(10, 10)};
		
		/** create a loop that displays each shape’s area and opacity
		 *  making sure that a square can’t have different width and height. */
		for(int i = 0; i < shapes.length; i++) {
			System.out.println(" ");
			
			System.out.print((i+1)+ " -> "); shapes[i].display();
			System.out.println(" ");
		}//closing the for loop	
	}//closing the main method
}//closing the class Driver
