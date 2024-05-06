package Arrays_2D;

// 2D array in java
// Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

public class Basics1 {

	public static void main(String[] args) {
		// declaration type 1
		int arr[][] = { {1,2,3},{4,5,6}};  
		System.out.println(arr[0][1]);  // 2nd element of 1st array
		System.out.println(arr[1][2]);  // 3rd element of 2nd array
		
		// changing the element
		arr[0][1] = 9;
		System.out.println(arr[0][1]);
		
	}

}
