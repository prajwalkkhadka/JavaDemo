package Assignment1;

import java.util.Arrays;

public class SortandArrayQN9 {

	public static void main(String[] args) {
		// Q. Num.9 Sort a numeric array and a string array		
		
		
		//Declaring and initializing an integer array
		int [] array1 = { 2200, 3030,1987,3087,2219,6143,5434};
		
		
		//Declaring and initializing a string array
		String [] array2 = {"Ford", "Toyota", "Honda", "Maruti", "Nissan", "Audi" };
		
		//Printing the original array.
		System.out.println("Original numeric Array: " + Arrays.toString(array1) +"\n");
		
		//Sorting the numeric array
		Arrays.sort(array1);
		
		//Printing the sorted numeric array
		System.out.println("Sorted numeric Array: " + Arrays.toString(array1)+"\n");
		
		
		//Printing the original string array
		System.out.println("Original String Array: " + Arrays.toString(array2)+"\n");
		
		//Sorting the string array
		Arrays.sort(array2);
		
		//printing the sorted string array
		System.out.println("Sorted String Array: " + Arrays.toString(array2)+"\n");		
	}

}
