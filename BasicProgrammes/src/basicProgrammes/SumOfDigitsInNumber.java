package basicProgrammes;

import java.util.Scanner;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int num=sc.nextInt();
			int rem = 0;
			int sum = 0;
			while (num > 0) {
				rem = num % 10;
				num = num / 10;
				sum = sum + rem;
			}
			System.out.println(sum);
		}
	}

}
