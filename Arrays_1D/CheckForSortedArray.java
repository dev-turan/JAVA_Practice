package Arrays_1D;
import java.util.*;
public class CheckForSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean isboolean = true;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				isboolean = false;
				break;
			}
		}
		
		if(isboolean == false) {
			System.out.print("array is unsorted");
		}else {
			System.out.print("Array is sorted");
		}

	}

}
