/**
 *      ZACH WYNEN      ICS4U       OCTOBER 31ST, 2016
 *      This program uses OOP, inheritance and abstract classes to
 *      allow a user to specify a number of Litres, and calculates how
 *      far different cars can go with it.
 */
package fuelefficiency;

import java.util.Scanner;

public class FuelEfficiency {
 //Declaring variables
 static Scanner kb = new Scanner(System.in);
 static double input;
   
    public static void main(String[] args) {
     //prompting for user input
     Vehicle truck, car, hybrid, cycle;
     System.out.println("How many Litres would you like the cars to run on?\n");
     input = kb.nextDouble();
     
     //instantiating objects
     truck = new Truck(input);
     car = new Car(input);
     hybrid = new HybridCar(input);
     cycle = new Motorcycle(input);
     
     //final output
     System.out.println("\nThe truck travels "+Double.toString(truck.getDistance())+" kilometres with that amount of fuel.");
     System.out.println("\nThe car travels "+Double.toString(car.getDistance())+" kilometres with that amount of fuel.");
     System.out.println("\nThe hybrid car travels "+Double.toString(hybrid.getDistance())+" kilometres with that amount of fuel.");
     System.out.println("\nThe motorcyle travels "+Double.toString(cycle.getDistance())+" kilometres with that amount of fuel.");
    }
}
