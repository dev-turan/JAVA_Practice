import java.util.*;
public class ReverseAstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String str = sc.next();
		
//		for(int i=str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
		
		StringBuilder str2 = new StringBuilder ();
		for(int i=str.length()-1;i>=0;i--) {
			str2.append(str.charAt(i));
		}
		System.out.print(str2);
	}

}
