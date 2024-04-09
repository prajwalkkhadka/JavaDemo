package Assignment1;

import java.util.Scanner;

public class Inputandprint {

	public static void main(String[] args) {
		// write a Java program that takes a number as input and prints 
		//its multiplication table upto 10
		
		int num;
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
		System.out.println(num+ "x" +i +"=" +num*i);
	 
		}
		sc.close();
	}
	}
		
		
	

