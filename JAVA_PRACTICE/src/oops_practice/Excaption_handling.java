package oops_practice;
import java.util.Scanner;

class Division{
	void div(int a,int b) {
		try {
		 System.out.println(a/b);
		 
		}
		catch(ArithmeticException e){
			System.out.println("b should not be zero");
		}
	}
}

public class Excaption_handling {
	public static void main(String [] args) {
		Division obj = new Division();
		obj.div(5, 0);
	}

}
