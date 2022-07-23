package basicProgrammes;

import java.util.Scanner;

public class Count_number_of_digits {

	public static void main(String[] args) 
	{
			System.out.println("Enter a Number: ");
		    try (Scanner sc = new Scanner(System.in)) {
				int num=sc.nextInt();
				int n = 0;
				while (num > 0) 
				{
					num = num / 10;
					n++;
				}
				System.out.println("the number of digits in the number are " + n);
			}
		}
	}
//this code will not count the zeroes enter at left side
