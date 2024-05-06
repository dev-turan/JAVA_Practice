package Arrays_1D;
import java.util.*;
public class LastOccurenceOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter target element :");
		int target = sc.nextInt();
		
		int index = -1;      // if element does not exit index will return -1
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				index = i;
			}
		}
		
		System.out.print(index);
		
		  

	}

}
