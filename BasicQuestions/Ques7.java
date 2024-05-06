package BasicQuestions;

//Q:Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
//After each input you ask the user and if user replies a 'Yes' you take another input and if 'No' then you print the counts.

import java.util.*;
public class Ques7 {

	public static void main(String[] args) {

				        Scanner sc = new Scanner(System.in);

				        int positiveCount = 0;
				        int negativeCount = 0;
				        int zeroCount = 0;

				        String userChoice;

				        do {
				            System.out.print("Enter a number: ");
				            double num = sc.nextDouble();

				            if (num > 0) {
				                positiveCount++;
				            } else if (num < 0) {
				                negativeCount++;
				            } else {
				                zeroCount++;
				            }

				            System.out.print("Do you want to enter another number? (Yes/No): ");
				            userChoice = sc.next();

				        } while (userChoice.equalsIgnoreCase("Yes"));

				        System.out.println("Positive numbers: " + positiveCount);
				        System.out.println("Negative numbers: " + negativeCount);
				        System.out.println("Zeros entered: " + zeroCount);
		

	}

}
