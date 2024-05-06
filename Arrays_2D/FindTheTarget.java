package Arrays_2D;

import java.util.*;
public class FindTheTarget {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// declaring row and col
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		// declaring 2D array
		int arr[][] = new int [row][col];
		
		// taking input in matrix
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		// taking target value
		int target = sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j] == target) {
					System.out.print( "(" + i + " " + j + ")");
				}
			}
		}

	}

}
