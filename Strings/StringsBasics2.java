package Strings;

public class StringsBasics2 {

	public static void main(String[] args) {
		// concatenation
		String name = "Dev";
		String lastname = "Turan";
		System.out.println(name + lastname);
		
		// length of string
		System.out.println(name.length());
		
		// charAt 
		for(int i=0; i<name.length(); i++) {
			System.out.print(name.charAt(i));
		}
	}

}
