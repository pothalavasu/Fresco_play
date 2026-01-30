package oops_practice;
import java.util.Scanner;

class Personal_details{
	void details() {
		String name = "Vasu Pothala";
		int age = 100;
//		double salary  = 20000;
		System.out.println("name : " + name +"\nage : " + age);
	}
	int otp_validation(int otp) {
		int i =0;
		while(otp>0) {
			otp/=10;
			i++;
		}
		return i;
	}
}
class User_input extends Personal_details {

	int take_otp(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter OTP to see your details: ");
		int otp = sc.nextInt();
		return otp;
	  }
	
}
public class Inheritance{
	public static void main(String[] args) {
		User_input obj = new User_input();// parent class
		Personal_details obj1 = new Personal_details();
		
	  
	  int chance =0;
      while(chance ==0) {
    	  int user_otp = obj.take_otp();
    	  int check = obj.otp_validation(user_otp);
	  if (check == 2){
		  obj.details();
		  chance =1;
	  }
	  else 
		  System.out.println("Wrong OTP \ntry again");
	  
		
	}
	}
}

