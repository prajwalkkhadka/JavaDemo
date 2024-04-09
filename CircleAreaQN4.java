package Assignment1;

import java.util.Scanner;

//Print the area (r2) and perimeter(2 r) of a circle


public class CircleAreaQN4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double PI = 3.14, area;
		int r;
		System.out.print("Enter radius of circle");
		Scanner obj = new Scanner(System.in);
		
		r = obj.nextInt();
		 
		
		area = PI * r * r;
		System.out.println("Area of circle is: " +area);
				

	}

}
