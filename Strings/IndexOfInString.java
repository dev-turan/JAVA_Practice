package Strings;
import java.util.*;
public class IndexOfInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		int index=-1;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				index=i;
				break;
			}
			
		}
		System.out.print(index);
		
		

	}

}
