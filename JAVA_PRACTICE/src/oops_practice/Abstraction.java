package oops_practice;
import java.util.Scanner;

abstract class hide{
	abstract void personal();
}
class age extends hide{
	Scanner sc = new Scanner(System.in);
	void personal() {
		
		System.out.print("\nEnter your id to access: ");
		int ID = sc.nextInt();
		if (ID%10==0)
			System.out.print("\nYou got access ");
		else 
			System.out.print("\n You are not allowed");
	}
	
}
class salary extends hide{
	Scanner sc = new Scanner(System.in);
	void personal() {
		
		System.out.print("\nEnter your password to access : ");
		String psw = sc.nextLine();
		if (psw.matches("[a-zA-Z0-9]+"))
			System.out.print("\nYou got access ");
		else 
			System.out.print("\n You are not allowed");

	}
	
}
class job_role extends hide{
	Scanner sc = new Scanner(System.in);
	void personal() {
		System.out.print("\nEnter your password to access : ");
		String secret_name = sc.nextLine();
		if (secret_name == "vasu")
			System.out.print("\nYou got access ");
		else 
			System.out.print("\n You are not allowed");

	}
	}
	

public class Abstraction {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	hide secret1 = new age();
	hide secret2= new salary();
	hide secret3= new job_role();
	secret1.personal();
	secret2.personal();
	secret3.personal();
	
}
}
