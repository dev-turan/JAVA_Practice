package Strings;

import java.util.*;

public class StringsBasics1 {

	public static void main(String[] args) {
		// string declaration
//		String name = "Dev";
//		String Fullname = "Dev Turan";
//		String para = "hi my name is Dev Turan.";		
//		System.out.println(name);
//		System.out.println(Fullname);
//		System.out.println(para);
		
		// input from user
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();     // for single word use next(); || for whole line use nextLine();
		System.out.print(name);
	}

}
