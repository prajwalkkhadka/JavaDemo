package Assignment1;


import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		/* Write a Java program to print the area (width*height) and perimeter (2*(width+height))
		 * of a rectangle
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the width of the Rectangle ");
		double width = scanner.nextDouble();
		
		
		System.out.print("Enter the height of the Rectangle ");
		double height = scanner.nextDouble();
		
		double area = width*height;
		double perimeter = (2*(width+height));
		
		System.out.println("The are of the Rectangle is: "+ area);
		System.out.print("The perimeter of the Rectangel is: " +perimeter);
	
	    scanner.close();
		
	}	
	
	}
