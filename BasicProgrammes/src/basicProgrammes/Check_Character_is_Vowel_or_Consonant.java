package basicProgrammes;

import java.util.Scanner;

public class Check_Character_is_Vowel_or_Consonant {

	public static void main(String[] args) {
		System.out.println("Enter a Letter: ");
		try (Scanner sc = new Scanner(System.in)) 
		{
			String sh=sc.next();
			char ch=sh.toLowerCase().charAt(0);
			switch (ch) 
			{
			    case 'a':
			    case 'e':
			    case 'i':
			    case 'o':
			    case 'u':
			        System.out.println(ch + " is vowel");
			        break;
			    default:
			        System.out.println(ch + " is consonant");
			            
			}
		}
	}

}
