package MathsQuestions;

//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class Ques4 {
	
	public static double circumfrence(int a) {
		double cir = 2*Math.PI*a;
		
		return cir;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(circumfrence(a));
	}

}
