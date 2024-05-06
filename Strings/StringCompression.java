package Strings;

import java.util.*;
public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringBuilder ans = new StringBuilder();
		int count = 1;
		for(int i=0; i<str.length()-1; i++){
			if(str.charAt(i)==str.charAt(i+1)) {
				count ++;
			}else {
				ans.append(str.charAt(i));
				ans.append(count);
				count = 1;
			}
		}
		  
		ans.append(str.charAt(str.length()-1));
		ans.append(count);
		
		System.out.print(ans);
	}

}
