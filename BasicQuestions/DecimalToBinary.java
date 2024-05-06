package BasicQuestions;

import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		String ans = Integer.toBinaryString(n);
		
		String ans = "";
		
		if(n == 0) {
			ans = "0";
		}
		
		while(n>0) {
			ans = (n%2) + ans;
			n = n/2;
		}
		
		System.out.print(ans);

	}

}
