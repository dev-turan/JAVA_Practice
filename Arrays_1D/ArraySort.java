package Arrays_1D;
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,4,2};
		
		Arrays.sort(arr);
		
		for(int i=1; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
		}

	}

}
