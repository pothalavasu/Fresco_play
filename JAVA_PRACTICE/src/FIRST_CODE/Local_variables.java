package FIRST_CODE;
import java.util.Scanner;

class Maths{
	public static final double PIE= 3.14;
	public static int even;
	Scanner sc = new Scanner(System.in);
	public int sum() {
		
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		return a+b;
	}
	public void buffer() {
		System.out.println("\nCalculating.....\n");
	}
	void Create_Array() {
	int[] newArray = new int[20];
		System.out.println("\nEnter the array Elements");
		for (int i = 0 ; i<5; i++) {
			System.out.print("Enter the " + i  + " Element : \n ");
			newArray[i] = sc.nextInt();
			}
		
		System.out.print("Your array is = ");
		for (int i = 0; i<5;i++) {
			System.out.print(newArray[i]);
		}
		
		System.out.print("\nEnter index number to retrive the data: ");
		int find = sc.nextInt();
		System.out.println("\n data at that index is " + newArray[find]);
	}
	
	void String_example() {
		System.out.print("\n Enter your name : ");
		String name = sc.nextLine();
        System.out.print("\nplease Enter U(upper) or L(lower) or T(trime) : ");
        char converter = sc.next().charAt(0);
        
        if (converter == 'u' ||converter == 'U') 
        	System.out.println("\nYour name is : " + name.toUpperCase());
        
        else if(converter == 'l' || converter =='L')
        	System.out.println("\nYour name is : "+ name.toLowerCase());
        else
        	System.out.println("\nYour name is : "+ name.trim());
	}void String_example1() {
		System.out.print("\n Enter your name : ");
		String name = sc.nextLine();
        System.out.print("\nplease Enter U(upper) or L(lower) or T(trime) : ");
        char converter = sc.next().charAt(0);
        
        if (converter == 'u' ||converter == 'U') 
        	System.out.println("\nYour name is : " + name.toUpperCase());
        
        else if(converter == 'l' || converter =='L')
        	System.out.println("\nYour name is : "+ name.toLowerCase());
        else
        	System.out.println("\nYour name is : "+ name.trim());
	}
	
	
}

public class Local_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths math = new Maths();
//		int show = math.sum();
//		math.buffer();
//		String result = (show!=0)?((show%2==0)?"an Even Number":"an Odd Number"):"Zero";
//		if (show % 2 == 0)
//			System.out.println(show + " is a EVEN number");
//		else if (show == 0)
//			System.out.println(show + " is ZERO");
//		else
//			System.out.println(show + " is a ODD number");
//        System.out.println("sum is : " + show);	
//	    System.out.println("\nSum is " + result);
//	    math.Create_Array();
		math.String_example();
		

	}

}