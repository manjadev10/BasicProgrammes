package basicProgrammes;

import java.util.Scanner;

public class Print_Prime_number_upto_n {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		if(n==0 || n==1)
		{
			System.out.println("No Prime Number is available");
		}
		else
		{
			System.out.println("Prime Number/s available upto  "+n+"  are:");
		}
		for (int i=1; i<=n; i++) 
		{ 
		  int p=0; 
		  for (int j=1; j<=i; j++) 
		  { 
			if(i%j==0) 
			{ 
				p++; 
			} 
		  } 
		  if (p==2) 
		  { 
		  System.out.print("  "+i); 
		  } 
		}

	}

 }
}