package basicProgrammes;

public class EqualsvsEqual {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		String s="abc";
		String p="abc";
		
	    System.out.println(s.equals(p));
		System.out.println(s==p);

	}

}
