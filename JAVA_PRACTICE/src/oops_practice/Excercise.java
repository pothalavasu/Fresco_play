package oops_practice;
import java.util.Scanner;

class Person{
	private String name;
	Scanner sc = new Scanner(System.in);
	
	String P_name() {
	System.out.print("\n Enter your name : ");
	name = sc.nextLine();
	return name;
	}
	
}

class Employee extends Person{
	void Employee() {
		System.out.println("Welcom! oopsss");
	}
	void Employee(String employee_name,double salary,) {
	System.out.println("Name : ");
}

public class Excercise {
	public static void main(String[] args) {
		
	}

}
