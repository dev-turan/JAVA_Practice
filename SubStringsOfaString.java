import java.util.*;
public class SubStringsOfaString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String str = sc.next();
		
		int n = str.length();
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<=n; j++) {
				String Substring = str.substring(i,j);
				System.out.println(Substring);
			}
		}
		

	}

}
