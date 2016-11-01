/**
 * Subclass of Vehicle. See Client code
 */
package fuelefficiency;

/**
 *
 * @author Zachary
 */
public class Car extends Vehicle {
 //Declaring variables 
 private double litres;

 /**
 * Constructor Method
 * Pre: none 
 * Post: An initialized Object with related variables
 */
 Car(double fuel) 
 {
  litres = fuel;    
 }


 /**
  * Getter method
  * pre: an initialized Object with valid variables
  * post: a returned value based on the distance this car 
  * would travel with the specified fuel amount
  */     
 @Override 
 public double getDistance() 
 {
  double distance = litres/9.4*100;
  return(distance);
 }
}
