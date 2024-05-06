package Arrays_1D;

import java.util.*;
public class UnionsOfArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr1[] = new int [n];
		
		for(int i=0 ; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		HashSet<Integer> ans = new HashSet<Integer>();
		
		for(int i=0; i<n; i++) {
			ans.add(arr1[i]);
		}
		for(int i=0; i<m; i++) {
			ans.add(arr2[i]);
		}
		
		System.out.print(ans.size());

	}

}
