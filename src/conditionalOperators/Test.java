package conditionalOperators;

public class Test {

	
	public static void main(String[] args) {
		
		int i = 10; 
		int j = 20;
		
		//System.out.println(i && j); //compilation error
		
		System.out.println((i<j) && (j>i)); //true
		System.out.println((i<j) && (j==i)); //false
		System.out.println((i<j) || (j==i)); //true
		
		
		String s1 = "Rahul";
		String s2;
		s2 = s1;
		String s3 = new String("Rahul");
		System.out.println((s1 == s2) && (s1 == s3)); //false
		System.out.println(s1.equals(s2) && s1.equals(s3));
		
	}
	
	
	
	
}
