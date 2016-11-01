/**
 * Subclass of Vehicle. See Client code
 */
package fuelefficiency;

public class Truck extends Vehicle {
 //variable declaration
 private double litres;
 
 /**
  * Constructor Method
  * Pre: none
  * Post: An initialized Object with related variables
  */
 Truck(double fuel) 
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
  double distance = litres/14.1*100;
  return(distance);
 }
}
