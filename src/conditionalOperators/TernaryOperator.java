package conditionalOperators;

public class TernaryOperator {

	
	public static void main(String[] args) {
		
		
		//(condition)?<executed if condition is true>:executed if condition is false
		
		System.out.println(true?"This is a true condition":"This is a false condition");
		
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(c>a && c>b ? c + " is larger than " + a + " and " + b : c + " is smaller than " + a + " and " + b);
		
		
		
		int d = 100;
		int e = 20;
		int f = 30;
		
		System.out.println(d>e ? (d>f ? d + " is the largest" : f + " is the largest") : e>f ? e + " is the largest" : f + " is the largest");
		
		
	}
	
	

	
	
	
}
