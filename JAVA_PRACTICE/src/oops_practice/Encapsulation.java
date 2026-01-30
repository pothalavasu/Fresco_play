package oops_practice;
import java.util.Scanner;

class Bank{
	private int acc_no;
	int  take_input(int num) {
		acc_no = num;
		return num;
	}
	void show() {
		System.out.println("Your account number : " + acc_no );
	}
	
}

public class Encapsulation {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	Bank bank_obj = new Bank();
	System.out.println("Enter your account number : " );
	int acc_no = sc.nextInt();
	bank_obj.take_input(acc_no);
	bank_obj.show();
}
}
