package basicProgrammes;

import java.util.Scanner;

public class ExcludeSingleVowelInWord {

	
	static boolean isVowel(char ch) {
		return ch=='a' || ch =='A' || ch=='e' || ch =='E' || ch=='i' || ch =='I' || ch=='o' || ch =='O' || ch=='u' || ch =='U';
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		String word = new Scanner(System.in).next();
		char[] ch = word.toCharArray();
		String res = "";
		if(!isVowel(ch[0])) {
			res = res+ch[0];
		}
		
		for(int i = 1; i < ch.length; i++) {
			
			if(isVowel(ch[i]) && isVowel(ch[i-1])) {
				res=res+ch[i]+""+ch[i-1];
			}
			if(!isVowel(ch[i])) {
				res=res+ch[i];
			}
			
		}
		System.out.println(res);
	}

}
