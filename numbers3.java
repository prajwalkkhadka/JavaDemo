package Assignment1;
import java.util.Scanner;

public class numbers3 {

	public static void main(String[] args) {
		// Accept three numbers from the keyboard and print the sum and average of them
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Ender second number");
		int num2 = sc.nextInt();
		System.out.println("Enter third number");
		int num3 = sc.nextInt();
		
		System.out.println("The sum of three numbers" + (num1+num2+num3));
		System.out.println("The average of three numbers" +(num1+num2+num3/3));
	
		sc.close();

	}

}
