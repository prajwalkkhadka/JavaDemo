package Assignment1;

import java.util.Arrays;

public class InsertanelementQN13 {

	public static void main(String[] args) {
		// Insert an element (specific position) into an array
		
		
		int [] array111 = {60, 20, 13, 81, 99, 30, 41, 79, 45};
		
		int Index_position = 5;
		
		int newValue = 100;
		
		System.out.println("Original Array : " +Arrays.toString(array111));
		
		for (int i = array111.length - 1; i>Index_position; i--) {
			array111[i] = array111[i-1];
		}
		
		array111[Index_position] = newValue;
		
		System.out.println("New Array: " + Arrays.toString(array111));
		}

	}


