package stringConcatenation;

public class BinaryOperators {

	
	
	public static void main(String[] args) {
		
		// + --> addition/concatenation
		// - --> subtraction
		// * --> multiplication
		// / --> quotient
		// % --> remainder
		
		int a = 13;
		double b = 2;
		
		System.out.println(a/b); 
		
		int var1 = 100;
		var1 = var1 + 10; //max(int, byte, int) --> int
		System.out.println(var1);
		
		
		long l = 100l;
		float f = 10.5f;
		//l = l + f;
		
		
		short s = 10;
		char c = 'a';
		
		System.out.println(s + c);
		
		//s = s + c;
		System.out.println(s);
		
		
		boolean b1 = true;
		boolean b2 = false;
		
		//System.out.println(b1 + b2);
		
		
		int a2 = 100;
		int b3 = 200;
		
		System.out.println(a2 % b3);
		
		
	}
	
	
	
}
