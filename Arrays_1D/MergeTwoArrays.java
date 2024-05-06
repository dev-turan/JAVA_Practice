package Arrays_1D;
import java.util.*;
public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// declaring 1st array
		System.out.print("Enter the length of 1st array: ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.print("enter the elements : ");
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		// declaring 2nd array
		System.out.print("Enter the length of 2nd array: ");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		System.out.print("enter the elements : ");
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int c = n+m;
		int ans[] = new int [c];
		
		for(int i=0;i<c/2;i++) {
			ans[++i] = arr1[i];
		}
		for(int i=c/2;i<c;i++) {
			ans[++i] = arr2[i];
		}
		
		for(int i=0;i<c;i++) {
			System.out.print(ans[i]);
		}

	}

}
