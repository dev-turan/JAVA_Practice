import java.util.Scanner;

public class SwitchIndexes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 4-digit integer: ");
    int n = sc.nextInt();
    int a =0 ,b=0,c=0,d  = 0;   

    if (n > 1000 && n < 10000) {
    	 d = n % 10;              // last digit
         c = (n % 100) / 10;      // 2nd last
         b = (n % 1000) / 100;    // 3rd last
         a = n / 1000;            // 1st digit
        } 

      // print at any index you want , in any pattern
      System.out.print("Switched number: " + b + a + d + c);
    }
  }

