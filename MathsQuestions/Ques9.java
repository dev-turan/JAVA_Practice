package MathsQuestions;

//Write a function that calculates the Greatest Common Divisor of 2 numbers.

import java.util.*;
public class Ques9 {
	
	public static int gcd(int a, int b) {
		while(b!=0) {
			int temp = b;
			b = a%b;
			a=temp;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print(gcd(a,b));
	}

}
