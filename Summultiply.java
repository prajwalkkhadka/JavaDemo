package Assignment1;

import java.util.Scanner;

public class Summultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner in = new Scanner(System.in);
			  
			  System.out.print("Enter the first number : ");

			      int num1 = in.nextInt();

			  System.out.print("input the second number: ");
			  
			  int num2 = in.nextInt();
			  
			  System.out.println(num1 + "+" + num2 + "=" + (num1 + num2)); 

			  System.out.println(num1 + "-" + num2 + "=" +  (num1-num2));

			  System.out.println(num1 + "*" + num2 + "=" +(num1*num2));

			  System.out.println(num1 + "/" + num2 + "=" +(num1/num2));
			  
			  System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
			  
			  in.close();

	}

}