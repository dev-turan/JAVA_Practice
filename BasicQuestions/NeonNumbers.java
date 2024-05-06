package BasicQuestions;

import java.util.*;
public class NeonNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int square = n*n ;
		int sum = 0;
		
		while(square>0) {
			int rev = square%10;
			sum = rev + sum;
			square /=10;
		}
		
		if(sum == n) {
			System.out.print("Neon");
		}else {
			System.out.print("not neon");
		}

	}

}
