import java.util.*;
public class OccuranceOfAnElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the target value : ");
		int target = sc.nextInt();
		
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				count ++;
			}
		}
		
		System.out.print(count);

	}

}
