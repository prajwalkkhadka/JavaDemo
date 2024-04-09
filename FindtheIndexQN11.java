package Assignment1;

import java.util.ArrayList;

public class FindtheIndexQN11 {

	public static void main(String[] args) {
		//Find the index of an array element


		
		int []  array = {25, 80, 55, 21, 65, 35};
		
		System.out.println("Index position of 25 is: " + findIndex(array, 25));
	}
		
		public static int findIndex(int arr[], int t)
		
		{
			if (arr ==null) {
				return -1;
			}
		int len = arr.length;
		int i = 0;
		
		while(i< len) {
			if (arr[i]== t) {
				return i;
			}
			else {
				i = i + 1;
			}
		}
		return -1;
		
		}
}
