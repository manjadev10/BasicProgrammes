package basicProgrammes;

import java.util.Scanner;

public class checkIfPrime {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("is the give number is prime? "+IfPrime(input));
		

	}
	
	public static boolean IfPrime(int input) {
		if(input == 0 || input == 1) {
			return true;
		}
		
		for(int i =2; i<=input/2;i++) {
			if(input%i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
