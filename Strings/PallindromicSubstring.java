package Strings;

import java.util.*;
public class PallindromicSubstring {
	
	public static boolean ispallindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			end --;
			start ++;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		int count =0;
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				if(ispallindrome(str.substring(i,j))) {
					count ++;
				}
			}
		}
		
		System.out.print(count);
		
	}

}
