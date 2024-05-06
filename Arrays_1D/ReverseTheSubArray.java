package Arrays_1D;

import java.util.*;
public class ReverseTheSubArray {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Input size of array and size of subarray
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        // Input array elements
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Reverse subarray groups of size K
        for (int i = 0; i < N; i += K) {
            int left = i;
            int right = Math.min(i + K - 1, N - 1);
            while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        
        // Print the modified array
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
	}

}
