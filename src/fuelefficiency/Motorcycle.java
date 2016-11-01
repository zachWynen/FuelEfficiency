/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;
/**
 * Subclass of Vehicle. See Client code
 */
public class Motorcycle extends Vehicle 
{
 //Declaring variables   
 private double litres;

 /**
  * Constructor Method
  * Pre: none
  * Post: An initialized Object with related variables
  */
 Motorcycle(double fuel)
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
  double distance = litres/6.3*100;
  return(distance);
 }
}
