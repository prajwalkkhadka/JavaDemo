package Assignment1;

public class TestArrayvalueQN10 {

	public static void main(String[] args) {
		// Testing if any array contains a specific value
		
		int [] abc = {100, 200, 201, 97, 473, 292, 8, 11, 21};
		
		int num = 201;
		
		int val = 0;
		
		for(int i = 0; i<abc.length; i++) {
			if (abc[i] == num)
{
				val++;

}
		}
		
		if(val==0)
			System.out.println("Number not found");
		else
			System.out.println("Yes the number found");
		
		

		
		
		

	}

}
