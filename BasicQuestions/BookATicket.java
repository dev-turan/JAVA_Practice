package BasicQuestions;

import java.util.*;
public class BookATicket {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("no of tickets available: ");
//		int n = sc.nextInt();
//		
//		System.out.print("Tickets requested by John: ");
//		int a = sc.nextInt();
//		
//		System.out.print("Tickets requested by mike: ");
//		int b = sc.nextInt();
//		
//		if(a<n) {
//			System.out.println("john: booked:"+a);
//		}else {
//			System.out.println("john: not booked");	
//		}
//		
//		
//		if(b<(n-a) && a<n) {
//			System.out.println("mike: booked:"+b);
//		}
//		else {
//			System.out.println("john: not booked");
//		}
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of tickets available: ");
	        int availableTickets = sc.nextInt();

	        System.out.print("Enter tickets requested by John: ");
	        int johnTickets = sc.nextInt();

	        System.out.print("Enter tickets requested by Mike: ");
	        int mikeTickets = sc.nextInt();

	        int totalRequested = johnTickets + mikeTickets;

	        if (totalRequested <= availableTickets) {
	            if (johnTickets <= availableTickets) {
	                System.out.println("John: tickets booked: " + johnTickets);
	                availableTickets -= johnTickets;
	            } else {
	                System.out.println("John: not booked");
	            }

	            if (mikeTickets <= availableTickets) {
	                System.out.println("Mike: tickets booked: " + mikeTickets);
	                availableTickets -= mikeTickets;
	            } else {
	                System.out.println("Mike: not booked");
	            }
	        } else {
	            System.out.println("Tickets requested by John and Mike combined exceed available tickets.");
	        }
	}

}
