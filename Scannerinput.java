package Assignment1;

import java.util.Scanner; 


public class Scannerinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to use scanner class to
		 * 1. Read an int, double, float, Boolean
		 * 2. Store the values inside variables
		 * 3. Print the values
		 * 4. Perform some arithmetic
		 */
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number");
			int intValue = sc.nextInt();
			
			
			System.out.println("Enter double number");
			double doubleValue =sc.nextDouble();
			
			System.out.println("Enter float number");
			float floatValue = sc.nextFloat();
			
			System.out.print("Enter a boolean (true/false): ");
			boolean booleanValue = sc.nextBoolean();
			
			System.out.println(intValue);
			System.out.println(doubleValue);
			System.out.println(floatValue);
			System.out.println(booleanValue);
			
			sc.close();
			
	}

}
