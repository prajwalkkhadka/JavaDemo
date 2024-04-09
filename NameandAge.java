package Assignment1;
import java.util.Scanner;


public class NameandAge {

	public static void main(String[] args) {
		//  WJP accept Name, Age, Gender and Address (single line) of a person from the user and print them in separate lines 
		
			Scanner sc = new Scanner(System.in);
			String name;
			int age;
			String Gender;
			String Address;

			System.out.println("Enter your name");
			name=sc.next();
			
			System.out.println("Enter your Age");
			age=sc.nextInt();
			
			System.out.println("Enter your Gender");
			Gender=sc.next();
			
			System.out.print("Enter your Address");
			Address=sc.nextLine();
			

			System.out.println("Name: " +name);
			
			System.out.println("Age: " +age);
			
			System.out.println("Gender: " +Gender);
			
			System.out.print("Address: " +Address);
		
		sc.close();
		
		

	}

}
