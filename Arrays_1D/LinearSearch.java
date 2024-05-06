package Arrays_1D;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		//input in array
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		
		// find the target
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				System.out.print(i);
			}
		}

	}

}
