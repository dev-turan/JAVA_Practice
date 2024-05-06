package Strings;

import java.util.*;
public class ToggleTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		StringBuilder ans = new StringBuilder();
		
		for(int i=0; i<ch.length;i++) {
			if(Character.isLowerCase(ch[i])) {
				ans.append(Character.toUpperCase(ch[i]));
			}else if(Character.isUpperCase(ch[i])) {
				ans.append(Character.toLowerCase(ch[i]));
			}else {
				ans.append(ch[i]);
			}
		}
		
		System.out.print(ans);

	}

}
