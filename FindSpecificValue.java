package Assignment1;

public class FindSpecificValue {

	public static void main(String[] args) {
		// 
		
		//Q.N.10- Write a Java Program to test if any array contains a specific value

		 
		
		int [] userInput = {4, 6, 80, 30, 11};
		int specificElement = 30;
		
		FindSpecificValue.getSpecificValue(userInput,specificElement);
		
	}
	
	
	      public static void getSpecificValue(int[]userInput, int specificElement) {
	    	
	    	  int[] input = userInput;
	    	  int element = specificElement;
	    	  
	    	  for(int i = 0; i < input.length; i++ ) {
	    		 
	    		  
	    		  if( input[i]==element) {
	    			  System.out.println("Yes");
	    		  }
	    	  }
	    	  
	    	  
		
	}

}
