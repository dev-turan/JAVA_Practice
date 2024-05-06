package BasicQuestions;

import java.util.*;
public class BitCounts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = Integer.bitCount(n);
		
		System.out.print(count);

	}

}
