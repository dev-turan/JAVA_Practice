package Arrays_2D;

import java.util.*;
public class Searching_in2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int [row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int target = sc.nextInt();
		
		// search
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(arr[i][j] == target) {
					System.out.print("location is : " + i + " " + j);
				}
			}
		}

	}

}
