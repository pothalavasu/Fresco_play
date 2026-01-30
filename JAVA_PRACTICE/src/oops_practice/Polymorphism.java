package oops_practice;
import java.util.Scanner;

class Parent_control{
	void Parent_control1() {
		System.out.println("Parent is controlling TV now");
	}
}
class Child_control extends Parent_control{
	void Parent_control1() {
		super.Parent_control1();
		System.out.println("child is controlling TV now");
	}
	
}


public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_control obj = new Child_control();
		obj.Parent_control1();

	}

}
