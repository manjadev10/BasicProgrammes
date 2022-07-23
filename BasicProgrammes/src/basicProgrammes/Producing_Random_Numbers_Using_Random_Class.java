package basicProgrammes;

import java.util.Random;

public class Producing_Random_Numbers_Using_Random_Class {

	public static void main(String[] args) {
	
		Random Rn= new Random();
		int n=Rn.nextInt(100);   // range can be given within 999
		System.out.println(n);
	
		Random Rd= new Random();
		double d=Rd.nextDouble();    //default range is bw 0.0 to 1.0 
		System.out.println(d);
	}

}
