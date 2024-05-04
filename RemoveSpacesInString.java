import java.util.*;
public class RemoveSpacesInString {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 String str = sc.nextLine();
	 
//	 for(int i=0; i<str.length(); i++) {
//		 str = str.replaceAll(" ", "");
//	 }
	 
	 str=str.replaceAll(" ", "");
	 
	 System.out.print(str);
	}

}
