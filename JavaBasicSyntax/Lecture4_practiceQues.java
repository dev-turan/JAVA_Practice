package JavaBasicSyntax;

import java.util.*;
public class Lecture4_practiceQues {

	public static void main(String[] args) {
		
//		Ques : print the sum of n natural numbers ?
		
//		Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        for(int i=0;i<=n;i++) {
//        	sum=sum+i;
//        }
//    	System.out.print(sum);
		
//		Ques : print the table of a number input by the user?
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<11 ;i++) {
			System.out.println(i*n);
		}
		
	}

}
