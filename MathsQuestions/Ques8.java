package MathsQuestions;

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;
public class Ques8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double pow = Math.pow(a, b);
		System.out.print(pow);
	}

}
