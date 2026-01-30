package coding_problems;

class ATM{
	private double balance=0;
	
	public void withdraw(int withDraw) {
		if(withDraw>balance) {
			System.out.println("\ninsufficent balance");
		}
		else {
			balance-=withDraw;
			System.out.println("\nwithdraw complete");
		}
	}
	public void deposite(int deposite ) {
		balance+= deposite;
		System.out.println("\ndeposite complete");
	}
	public void get_balance() {
		System.out.println("\nBalance: " + balance); ;
	}
}


class Saving_account extends ATM{
	
	public void saving_withdraw(int s_withdraw) {
		super.withdraw(s_withdraw);
	}
	
	public void saving_deposite(int s_deposite) {
		super.deposite(s_deposite);
	}
	
	 public void saving_balance() {
		 super.get_balance();
	 }
	
	
}


class Current_account extends ATM{
	
	public void current_withdraw(int s_withdraw) {
		super.withdraw(s_withdraw);
	}
	
	public void current_deposite(int s_deposite) {
		super.deposite(s_deposite);
	}
	
	 public void current_balance() {
		 super.get_balance();
	 }
	
}
public class problem2 {

	public static void main(String[] args) {
		
		Current_account c_acc = new Current_account();
		Saving_account s_acc = new Saving_account();
		
		c_acc.current_withdraw(20000);
		s_acc.saving_deposite(50000);
		s_acc.saving_balance();
	}
}
