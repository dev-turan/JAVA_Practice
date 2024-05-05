package Strings;

import java.util.*;
public class RemoveAllVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String str = sc.nextLine();
		
		str = str.replaceAll("a", "");
		str = str.replaceAll("e", "");
		str = str.replaceAll("i", "");
		str = str.replaceAll("o", "");
		str = str.replaceAll("u", "");
		str = str.replaceAll("A", "");
		str = str.replaceAll("E", "");
		str = str.replaceAll("I", "");
		str = str.replaceAll("O", "");
		str = str.replaceAll("U", "");

		System.out.print(str);

	}

}
