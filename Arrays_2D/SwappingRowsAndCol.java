package Arrays_2D;

import java.util.*;
public class SwappingRowsAndCol {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int arr[][] = new int [row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				int temp = arr[i][0];
				arr[i][0] = arr[i][col-1];
				arr[i][col-1] = temp;
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
