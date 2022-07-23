package basicProgrammes;

import java.util.Scanner;

public class Swap_Two_Numbers_Without_temp {

	public static void main(String[] args) {
		
		System.out.println("Enter Two Numbers: ");
		try (Scanner sc = new Scanner(System.in)) 
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			System.out.println("Before Swap: x= "+x+" y= "+y);
			
			x=x+y;
			y=x-y;
			x=x-y;
			
			System.out.println("After Swap: x= "+x+" y= "+y);
		}
		
		/*     a=a*b;                           
               b=a/b;
               a=a/b;

                a=a+b;
                b=a-b;
                a=a-b;           */	
	}

}
