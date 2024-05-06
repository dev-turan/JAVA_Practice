package Strings;
import java.util.*;
public class RemoveChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int n = str.length();
		
		char ch = sc.next().charAt(0);
		
		str = str.replaceAll(str.valueOf(ch),"");
		
		System.out.print(str);
	}

}
