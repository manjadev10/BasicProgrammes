package basicProgrammes;

import java.util.Scanner;

public class Check_Number_Is_PrimeNumber 
{

	public static void main(String args[]) 
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter a number");
			int n=sc.nextInt();                       // number to be checked
		    int flag = 0;
		    if (n == 0 || n == 1) 
		    {
			System.out.println("its not a prime number");
		    } 
		    else 
		    {
			int m = n / 2;
			for (int i = 2; i <= m; i++) 
			{
				if (n % i == 0) 
				{
					System.out.println("its not a prime number");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0)
			System.out.println("its a prime number");
	}

   }
}
