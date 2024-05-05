package Strings;

import java.util.*;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		
		for(int i=0; i<str.length(); i++) {
			str = str.replace(ch1, ch2);
		}
		
		System.out.print(str);
	}

}
