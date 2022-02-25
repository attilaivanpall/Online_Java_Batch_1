package methods;

import java.util.Scanner;

public class Test {

	int i = 10;
	
	
	
	public static void main(String[] args) {
		
		Test obj = new Test();
		//obj.addTwoValues1();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first integer value.");
		int a = scan.nextInt();
		
		System.out.println("Please enter second integer value.");
		int b = scan.nextInt();
		
		
		int result = obj.addTwoValues2(a, b);
		obj.printAdditionResult(result);
		
		
		//obj.subtractsTwoValues();
		
		
		//obj.multiplyTwoValues();
		
		
		//obj.dividesTwoValues();
		
	}
	
	
	//Write a method to add 2 integer values and print the final output.
	//functionality --> addition
	//pre-requisites: need 2 int values
	//step1: add the 2 int values
	//step2: store the output into a variable
	//step3: print the final value
	
	public void addTwoValues1() {
		
		int var1 = 100;
		int var2 = 200;
		int sum = var1 + var2;
		System.out.println(sum);
	}
	
	
	
	public int addTwoValues2(int var1, int var2) {
		
		int sum = var1 + var2;
		//System.out.println("The addition of two values is: " + sum);
		
		return sum;
	}
	
	
	public void printAdditionResult(int result) {
		
		System.out.println("The addition of two values is: " + result);
		
	}
	
	
	public void subtractsTwoValues() {
		
		int var1 = 100;
		int var2 = 200;
		int sum = var2 - var1;
		System.out.println(sum);
	}
	
	public void multiplyTwoValues() {
		
		int var1 = 10;
		int var2 = 20;
		int sum = var1 * var2;
		System.out.println(sum);
	}
	
	
	public void dividesTwoValues() {
		
		int var1 = 10;
		int var2 = 20;
		int sum = var2 / var1;
		System.out.println(sum);
	}
	
}
