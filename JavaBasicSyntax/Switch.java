package JavaBasicSyntax;

import java.util.*;
public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		
		switch(button) {
		case 1: System.out.print("1");
		break;
		case 2: System.out.print("2");
		break;
		case 3: System.out.print("3");
		break;
		default:System.out.print("Invalid");
		
		}

	}

}
