package MathsQuestions;

//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class Ques1 {
	
	public static int average(int a, int b, int c) {
		int avg =(a+b+c)/3;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.print(average(a,b,c));

	}

}
