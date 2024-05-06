package MathsQuestions;

import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int original = n;
		int sum = 0;
		
		while(n>0) {
			int rev = n%10;
			sum = (rev*rev*rev) + sum;
			n = n/10;
		}
		
		if(sum == original) {
			System.out.print("Armstrong");
		}else {
			System.out.print("not armstrong");
		}

	}

}
