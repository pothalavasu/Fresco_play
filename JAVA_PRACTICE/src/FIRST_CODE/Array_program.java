package FIRST_CODE;
import java.util.Scanner;

class Array_class{
	Scanner sc = new Scanner(System.in);
	
	void Create_Array() {
		int[] newArray = new int[20];
			System.out.println("\nEnter the array Elements");
			for (int i = 0 ; i<5; i++) {
				System.out.print("\nEnter the " + i  + " Element :  ");
				newArray[i] = sc.nextInt();
				}
			
			System.out.print("\nYour array is = ");
			for (int i = 0; i<5;i++) {
				System.out.print(" " + newArray[i]);
			}
			
			System.out.print("\n\nEnter index number to retrive the data: ");
			int find = sc.nextInt();
			System.out.println("\ndata at that index is " + newArray[find]);
		}

}
public class Array_program {
	public static void main(String[] args) {
		Array_class obj = new Array_class();
		obj.Create_Array();
	}

}
