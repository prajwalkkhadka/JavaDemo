package Assignment1;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// 
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the numbers");
		int n = sc.nextInt();
		double[]array=new double[n];
		System.out.println("Enter "+n+" elements in an array:");
		for(int i=0; i <n; i++)
		{
		array[i] = sc.nextDouble();

		}
		System.out.println("Average is: +sum/n");

     sc.close();

	}

}
