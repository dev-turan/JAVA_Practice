package Arrays_1D;

import java.util.*;
public class FindThePipes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(arr[0]);
		int a = arr[0];
		for(int i=1; i<n-1; i++) {
			if(arr[i]<a) {
				System.out.print(arr[i]);
			}
		}
	}

}
