package Arrays_1D;
import java.util.*;

public class LongestCommonPrefix {
	
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String arr1[] = str.split(" ");
	int arr2[] = new int[arr1.length];
	
	for(int i=0; i<arr1.length; i++) {
		arr2[i] = Integer.parseInt(arr1[i]);
	}
}
}