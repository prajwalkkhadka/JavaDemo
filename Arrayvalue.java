package Assignment1;

public class Arrayvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java Program to find the maximum and minimum value of an array
		
		int valueArray[] = {20,98,66,45,72,1,31,77,23,11,07};
		
		
			int maximum = valueArray[0];
			int minimum = valueArray[0];
			
			for(int i=0; i<=10; i++){
			
			if(valueArray[i] < minimum) minimum = valueArray[i];
			if (valueArray[i]> maximum)  maximum = valueArray[i];
			
	}
	
			System.out.println("The minimum value of an array is: " + minimum);
			System.out.println("The maximum value of an array is: " + maximum);
	}		
	}


