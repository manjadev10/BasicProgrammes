package basicProgrammes;

import java.util.Scanner;

public class CheckNumberIsPalindromeOrNot {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter a number");
			int num = sc.nextInt();
			int ref = num;
			int rev = 0;
			while (num > 0) {
				rev = rev * 10 + num % 10;
				num = num / 10;
			}

			if (ref == rev) 
				System.out.println("this is palindrome");
			else
				System.out.println("this is not palindrome");
		}

	}
}
