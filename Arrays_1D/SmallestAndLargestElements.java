package Arrays_1D;
import java.util.*;
public class SmallestAndLargestElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		// normal output
		System.out.println(arr[0] + " " + arr[arr.length-1]);
		
		int result[] = new int[2];
		result[0] = arr[0];
		result[1] = arr[arr.length-1];
		
		// output in an array
		System.out.print(Arrays.toString(result));

	}

}
