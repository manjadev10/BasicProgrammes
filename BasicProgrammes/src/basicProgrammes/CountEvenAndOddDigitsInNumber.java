package basicProgrammes;

public class CountEvenAndOddDigitsInNumber {

	public static void main(String[] args) {
		int num = 1234555;
		int res;
		int even = 0;
		int odd = 0;
		while (num > 0) {
			res = num % 10;
			num = num / 10;
			if (res % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("the number of even digits " + even);
		System.out.println("the number of odd digits " + odd);

	}

}
