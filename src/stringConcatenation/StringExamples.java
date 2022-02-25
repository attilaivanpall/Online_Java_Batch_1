package stringConcatenation;

public class StringExamples {

	
	public static void main(String[] args) {
		
		//String concatenation
		
		String s1 = "way";
		String s2 = "2";
		String s3 = "automation";
		
		System.out.println(10 + 20); // 30
		//System.out.println(s1 + s2 + s3); //way2automation
		
		
		
		System.out.println(s1 + 10 + 15 + s2 + s3); //way10152automation
		
		System.out.println(2+2/2); //3
		
		System.out.println(10 + 15 + s1 + s2 + s3); //25way2automation
		
		System.out.println(s1 + 10 * 15 + s2 + s3); //way1502automation
		
		System.out.println(s1 + s2 + s3 + 10 * 15); //way2automation150
		
		//System.out.println(s1 + s2 + s3 + 10 - 5); //compilation error
		
		System.out.println(s1 + (10 + 15) + s2 + s3); //way252automation
		
		System.out.println(10 - 5 + s1 + s2 + s3); //5way2automation
		
	}
	
	
}
