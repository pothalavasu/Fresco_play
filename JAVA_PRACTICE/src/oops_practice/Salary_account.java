package oops_practice;

class Salary extends User_input{
	int salary = 20000;
	void get_Salary() {
		System.out.println("Salary : " + salary);
	}
}

public class Salary_account {
public static void main(String[] args) {
	Salary obj = new Salary();
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
    obj.get_Salary();

}
}
