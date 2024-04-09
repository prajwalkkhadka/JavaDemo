package Assignment1;

public class FindAverageQN15 {

	public static void main(String[] args) {
		// Find the average of all the elements of an array
		
	       int [] num = new int [] {10, 11, 35, 65, 31, 55, 73};
	       int sum = 0;
	       
	       for (int i=0; i<num.length; i++) {
	    	   
	    	   sum = sum + num[i];
	       }
	       double average = sum/num.length;
	       
	       System.out.println("Average value of the array elements is: " +average);
	       
	       }
	
	

	}
