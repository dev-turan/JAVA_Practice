package BasicQuestions;

import java.util.*;
public class ReverseOfNtestCases {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		
//		for(int i=0; i<t ; i++) {
//			int n = sc.nextInt();
//			
//			int rev = 0;
//			while(n!=0) {
//				int temp = n%10;
//				rev = rev*10 +temp;
//				n=n/10;
//			}
//			System.out.print(rev);
//		}
		
		Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t-- >0)
		 {
		// Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int ans=0;
		 while(a>0)
		 {
		 ans = ans*10 + a%10;
		 a=a/10;
		 }
		 System.out.println(ans);
		 }

		
	}

}
