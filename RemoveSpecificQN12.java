package Assignment1;

import java.util.Arrays;

public class RemoveSpecificQN12 {

	public static void main(String[] args) {
		// Remove a specific element from an array
		
		
		int[] arrayint = {10, 18, 13, 15, 9, 6, 14, 50, 3, 22, 31};
		
		System.out.println("Original Array : " + Arrays.toString(arrayint));
		
		int removeIndex = 7;
		
		for(int i = removeIndex; i < arrayint.length - 1; i++) {
			arrayint[i] = arrayint[i + 1];
		}
			System.out.println("After removing the element: " +Arrays.toString(arrayint));
	
		
	}
}
