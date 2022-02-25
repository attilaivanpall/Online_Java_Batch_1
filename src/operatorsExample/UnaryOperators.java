package operatorsExample;

public class UnaryOperators {

	
	public static void main(String[] args) {
		
		// ++ --> increment operator
		//It increases the value of the operand by 1.
		//pre-increment (++operand) --> First I will increase the value and the next operation(s) will be performed.
		//post-increment (operand++) --> First rest of the operation(s) will be performed and then I will increase the value.
		
		
		int i = 10;
		
		System.out.println(++i); //11   increment (11) --> print (11)
		System.out.println(++i); //12   increment (12) --> print (12)
		System.out.println(i++); //12   print (12) --> increment (13)
		System.out.println(i); //13     print (13)
		System.out.println(i++); //13   print (13) --> increment (14)
		System.out.println(i); // 14    print (14)
		
		
		
		System.out.println(--i); //13   decrement (13) --> print (13)
		System.out.println(i--); //12   print (13) --> decrement (12)
		System.out.println(++i); //12   increment (13) --> print (13)
		System.out.println(--i); //13   decrement (12) -->  print (12)
		System.out.println(i); //13     print (12)

		i++;
		System.out.println(i);
		
		i = i++;
		System.out.println(i);
		
		
		
		for(int j = 1; j <= 10; j++) {
			
			System.out.println(j);
			
			
		}
		
		
		// ! --> it will convert true into false and vice-versa
		System.out.println(true);
		
		
		
		
		
	}
	
	
	
	
	
}
