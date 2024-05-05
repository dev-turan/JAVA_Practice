package Strings;

import java.util.*;

public class AnagramStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		boolean ans = true;
		
		int n = str1.length();
		int b = str2.length();
		
		if(n!=b) {
			 ans = false;
		}
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0; i<n; i++) {
			if(ch1[i]!= ch2[i]) {
				ans = false;
			}
		}
		
		System.out.print(ans);
	}

}
