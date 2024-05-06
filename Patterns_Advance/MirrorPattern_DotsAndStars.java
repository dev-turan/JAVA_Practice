package Patterns_Advance;

import java.util.*;
public class MirrorPattern_DotsAndStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		
		 // Upper half
        for (int i = 0; i < N; i++) {
            // Print dots
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(".");
            }
            
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // Lower half
        for (int i = N - 1; i >= 0; i--) {
            // Print dots
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(".");
            }
            
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

	}

}
