package Arrays_2D;

import java.util.*;
public class Basics2 {

	public static void main(String[] args) {
		
//		int arr[][] = new int [rows] [coloumns];
		
		Scanner sc = new Scanner (System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int [row][col];
		
		// input in 2D array
		// rows
		for(int i=0; i<row; i++) {
			// coloumns
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// output
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
