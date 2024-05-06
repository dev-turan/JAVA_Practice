package BasicQuestions;

import java.util.*;
public class BreakThePillars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;
		
		for(int i =0 ;i<arr.length; i++) {
			if( x%arr[i] == 0  && y%arr[i] == 0) {
				count ++;
			}
		}
		
		System.out.print(count);
	}

}
