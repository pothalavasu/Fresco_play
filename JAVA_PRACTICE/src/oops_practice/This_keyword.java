package oops_practice;

class TV{
	String brand;
	int cost;
	void TV() {
		System.out.println("Unable to fetch the TV details");
	}
	void TV(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
		System.out.println("we got your TV details");
		System.out.println("You have choosen \nTV brand : " + brand + "\ncost : " + cost + "\nYou have a good tast Mr/Ms");
	}
	
}

public class This_keyword {
public static void main(String[] args) {
	TV tv = new TV();
	tv.TV("Samsung",40000);
}
}
