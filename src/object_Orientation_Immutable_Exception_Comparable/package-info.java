/**
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
 *      4. Apartments should have an equals() method. 
 *     	 	Two apartments are considered equal if all of their rooms have the same dimensions.
 *     
 *     	5. Apartments should have a toString() method that displays all apartment details in text format.
 *     
 *     	6. Apartments should implement a Comparable interface. 
 *    		Apartments are first compared based on the sum of their living room and bedroom dimensions.
 *     			If the difference is less than 10%, 
 *     				kitchen and bathroom are also included in the calculation and the result is recalculated.
 * 
 */

/**
 * @author lucasmaximo
 *
 */
package object_Orientation_Immutable_Exception_Comparable;