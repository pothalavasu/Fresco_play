package FIRST_CODE;
import java.util.Scanner;

class String_Example{
	Scanner sc = new Scanner(System.in);
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
	}
	
}

public class String_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Example obj = new String_Example();
		obj.String_example();

	}

}
