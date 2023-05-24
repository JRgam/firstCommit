//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		System.out.println("Week 1 Lab");
		
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availablePlaneSeats = 10;
		
		// 2. Create a variable to hold the cost of groceries at checkout
          double costOfGroceries = 14.00;
		
		// 3. Create a variable to hold a person's middle initial
          char middleInitial = 'T';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
          boolean isHotOutide = false;
		
		// 5. Create a variable to hold a customer's first name
          String customerFirstName = "Enresto";
		
		// 6. Create a variable to hold a street address
          String streetAddress = "1972 Eisenhower Dr";
		

		// 7. Print all variables to the console
          System.out.println("Available seats left on the plane: " + availablePlaneSeats);
          System.out.println(costOfGroceries + " is the price for groceries");
          System.out.println("The person middle initial is " + middleInitial);
          System.out.println("It is hot outside - " + isHotOutide);
          System.out.println("The customers first name is " + customerFirstName);
          System.out.println(streetAddress + " is where the person lives.");
          System.out.println();
          
          
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
          availablePlaneSeats = availablePlaneSeats - 2;
          availablePlaneSeats -= 2;
          System.out.println(availablePlaneSeats);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
          costOfGroceries += 2.15;
          System.out.println(costOfGroceries);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
          middleInitial = 'J';
          System.out.println(middleInitial);
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
          isHotOutide =  !isHotOutide;
          System.out.println(isHotOutide);
          


       


	

		
		
	}
}


		