package BasicQuestions;

import java.util.*;
public class JavaProgramme1 {
	
	public static void minmax(int arr[]) {
        Arrays.sort(arr);
		
		System.out.println("min value:" + arr[0]);
		System.out.println("max value:" + arr[arr.length-1]);

	}
	
	public static int subsum(int arr[]) {
		
		int maxval = Integer.MIN_VALUE;
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
		   temp+=arr[i]-arr[i+1];
		}
		if( maxval < temp) {
			maxval = temp;
		}
		
		return maxval;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		minmax(arr);
		if(subsum(arr) < 0) {
		   System.out.println(subsum(arr));
		   System.out.println("negative sum");
		}else {
			System.out.println(subsum(arr));
			System.out.println("positive sum");
		}
		
		
	}

}
