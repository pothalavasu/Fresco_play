package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Array_list {
	public static void main(String[] args) {
		
		List<Integer> in = new ArrayList<Integer>();
		List<Integer> out = new ArrayList<Integer>();
		
		int i=0 ,id;
		System.out.print("\npress 1 to go in"
				+ "\npress 2 to go out"
				+ "\npress 3 to terminate code"
				+ "\nPress 4 to get(enter index) data: "
				+ "\npress 5 to sort the list: ");
		
		while(i!=3) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter your chooice : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("\nEnter you employee id: ");
			id = sc.nextInt();
			
			
			
				if (in.contains(id) ) {
				System.out.print("\nAccess declined");
				}
				else {
					in.add(id);
					out.add(id);
//					in.remove(Integer.valueOf(id));

						System.out.println("\nAccess Granted");
				}

			}
		
		else if(num ==2) {
					System.out.print("\nEnter you employee id: ");
					id = sc.nextInt();
						if (out.contains(id) ) {
						System.out.print("\nAccess garanted");
						out.remove(Integer.valueOf(id));
						}
						else {
					
							System.out.println("\nAccess declined");
						}
						
			}
			
		else if(num==3) {
						System.out.println("\n program terminated successful");
						i=3;
					}
						
		else if(num == 4) {
			System.out.print("\nEnter index number: ");
						int y=sc.nextInt();
						try {
						System.out.println("in: " + in.get(y) + "\nout: " + out.get(y));
						}
						catch(Exception e) {
							System.out.println("\nOut of boundry Exception");
						}
					}
		else if(num ==5 ) {
						Collections.sort(in);
						System.out.print("\n in going list : " + in);
						Collections.sort(out,Collections.reverseOrder());
						System.out.print("\n out going list : " + out);
					}
					else {
						System.out.println("\nwrong input try again");
					}
					
					
			}
		
		}
		}
		
	

