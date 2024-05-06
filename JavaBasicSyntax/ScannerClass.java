package JavaBasicSyntax;

import java.util.*;
public class ScannerClass {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String names = sc.next();   // for a single token means   a single word only
////		String names = sc.nextline(); // for multiple tokens means whole sentence
////		String names = sc.nextInt();  // for input of integer type
////		String names = sc.nextFloat();
////		String names = sc.nextDouble();
////		String names = sc.nextLong();
//
//    	System.out.print(names);

//		******practice question********
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a = sc.nextInt();
		System.out.print("b=");
		int b = sc.nextInt();
	    int sum = a+b;
	    System.out.print("sum="+ sum);
	}

}
