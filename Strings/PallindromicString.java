package Strings;
import java.util.*;

public class PallindromicString {

	public static void main(String[] args) {
		String str = "racecar";
		
	int n = str.length();
	boolean isboolean = true;
		
		int start=0;
		int end=n-1;
		
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				isboolean=false;
				break;
			}
			start++;
			end--;
		}
		if(isboolean==true) {
			System.out.print("yes");
		}else
			System.out.print("no");
		

	}

}
