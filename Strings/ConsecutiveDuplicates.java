package Strings;
import java.util.*;
public class ConsecutiveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		
		StringBuilder str2 = new StringBuilder();
		str2.append(str.charAt(0));
		
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i)!=str.charAt(i-1)) {
				str2.append(str.charAt(i));
			}
		}

		System.out.print(str2);
	}

}
