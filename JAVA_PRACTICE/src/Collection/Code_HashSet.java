package Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Code_HashSet {
public static void main(String[] args) {
	
	HashSet<String> hs = new HashSet<String>();
	
	Scanner sc = new Scanner(System.in);
	
		int i=0;String food;
		
	System.out.println("click 1=> add food"
				+ "\nclick 2=> remove "
				+ "\nclick 3=>check list"
				+ "\nclick 4=>terminate program: ");
	while(i!=4) {
		System.out.print("\nEnter your choice: ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		if(choice == 1) {
			System.out.println("\nEnter food item to add : ");
			food = sc.nextLine();
			hs.add(food);
		}
		else if(choice == 2) {
			System.out.println("\nEnter food item to remove : ");
		      food = sc.nextLine();
		      if(hs.contains(food))
		          hs.remove(food);

		}
		else if(choice == 3) {
			if(hs.isEmpty())
				System.out.println("\nList is empty");
			else {
				System.out.println("\nlist of food items: " + hs);
				
			}
		}
		else if(choice == 4) {
			System.out.println("Program terminated");
			i=4;
		}
		else
			System.out.println("\nworng input Try again");
	}
}}