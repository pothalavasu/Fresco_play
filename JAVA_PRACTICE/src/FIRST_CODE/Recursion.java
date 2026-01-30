package FIRST_CODE;
import java.util.Scanner;

class Sum {
	
	int plus(int num) {
	if (num <=1)
		return 1;
	return num + plus(num - 1);	
		
	}
}
public class Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number to find sum of first 'N' natural numbers : " );
		int n = sc.nextInt();
		Sum obj = new Sum();
		System.out.println("sum is : " + obj.plus(n));
		
	}
  
}
