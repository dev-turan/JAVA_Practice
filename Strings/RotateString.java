package Strings;
import java.util.*;
public class RotateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str = sc.next();
		int n = str.length();
		
		System.out.print("Enter the rotation value : ");
		int a = sc.nextInt();
		
		String str1 = str.substring(0,n-a);
		String str2 = str.substring(n-a,n);
		
		String str3 = str2+str1;
		
		System.out.print(str3);
		
	}

}
