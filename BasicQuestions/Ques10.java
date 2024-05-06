package BasicQuestions;

//Write a program to print Fibonacci series of n terms where n is input by user.

import java.util.*;
public class Ques10 {
	
	public static int FibSeries(int n) {
		
		if(n==1) {
			return 0;
		 }
		 else if (n==2 || n==3) {
			return 1;
		 }else {
			return FibSeries(n-1)+FibSeries(n-2);
		 }
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(FibSeries(i));
		}

	}

}
