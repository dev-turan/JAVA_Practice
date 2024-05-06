package Arrays_1D;

import java.util.*;
public class ConsecutiveSubtraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		//consecutive subtraction
	    int sum = arr[0];
		for(int i=1;i<n;i++) {
			sum-=arr[i];
		}
		
		System.out.print(sum);

	}

}
