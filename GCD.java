import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// input from user
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// logic for gcd
		while(b!=0) {
			int temp = b;  
			b = b%a;       // storing remainder
			a = temp;      // updating a with previous b
		}
		
		System.out.print(a);   

	}

}
