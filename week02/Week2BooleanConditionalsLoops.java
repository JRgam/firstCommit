package week02;

public class Week2BooleanConditionalsLoops {

	public static void main(String[] args) {
		
		//create a variable named age and assign it a value of 14
		int age = 14;
		
		//print a boolean expression age >= 16 to the console and note the results.
		//change the value of age and rerun to see the result
		System.out.println(age >= 16);
		age = 18;
		System.out.println(age >=16);
		
		//using a conditional, print "You can drive" if age is greater than or equal to 16
		//and "You cannot drive" otherwise
		//change the value of age and rerun to see the results
		boolean hasLicense = false;
		
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
		//create two new variables - costOfMilk and thirstLevel
		//create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		//or if thirsLevel is greater than 6 and prints "No Thanks" otherwise
		//change the values and not the different results
		double costOfMilk = 3.15;
		int thirstLevel = 5;
		
		if (costOfMilk < 2.5 || thirstLevel > 6) {
			System.out.println("Milk PLease");
		} else {		
			System.out.println("No Thanks");
			int tokens = 12;
			int costToPlayArcadeGame = 3;

			System.out.println( tokens < costToPlayArcadeGame );
		}
		
		
		
	}

}
