package JavaBasicSyntax;

import java.util.*;
public class CheckDivisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		if(n%11 ==0) {
			System.out.print("Eleven");
		}else if(n%3 == 0) {
			System.out.print("Three");
		}else if(n%2 == 0) {
			System.out.print("Two");
		}else {
			System.out.print("-1");
		}

	}

}
