package Arrays_1D;
import java.util.*;
public class NumberOfPairsEqualToTarget {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the target value: ");
		int target = sc.nextInt();
		
		int count = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if( (arr[i]+arr[j]) == target) {
					System.out.println("(" + arr[i] + " " + arr[j] + ")" );
					count ++;
				}
			}
		}
		
		System.out.print(count);
	}

}
