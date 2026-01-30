package coding_problems;

class Employee_details{
	String designation;
	double salary;
	public void Employee_data(String desi, double sal) {
		designation = desi;
		salary = sal;
	}
	public void hike() {
		System.out.println("Hike will be based on your performance");
	}

	
}

class CEO extends Employee_details{
	
	public String get_designation() {
		return designation;
	}
	public double get_salary() {
		return salary;
	}
	public double calcu_salary() {
		return salary-20000;
	}
	public void hike() {
		System.out.println("we will let you know about you salary hike");
	}
}

class Manager extends Employee_details{
	
	public String get_designation() {
		return designation;
	}
	public double get_salary() {
		return salary;
	}
	public double calcu_salary() {
		return salary-2000;
	}
	
	public void hike() {
		System.out.println("we will let you know about you salary hike");
	}

}


public class problem_1 {

	public static void main(String[] args) {
		
		CEO emp = new CEO();
		emp.Employee_data("CEO",2000000.000);
		System.out.println("\nDesignation: " + emp.get_designation());
		System.out.println("Salary: " + emp.get_salary());
		System.out.println("In hand salary: " + emp.calcu_salary());

		 Manager emp2 = new Manager();
		emp2.Employee_data("Manager",208000.000);
		System.out.println("\nDesignation: " + emp2.get_designation());
		System.out.println("Salary: " + emp2.get_salary());
		System.out.println("In hand salary: " + emp2.calcu_salary());
		
		Employee_details emp3 = new CEO();
		emp3.hike();
	}

}

