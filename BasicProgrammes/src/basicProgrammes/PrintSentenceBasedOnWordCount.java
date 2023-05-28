package basicProgrammes;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PrintSentenceBasedOnWordCount {

	public static int countOccurrence(String word, String sentence){
		
		String sentenceArray[] = sentence.split(" ");
		int Count=0;
		for(int i =0 ; i<sentenceArray.length ; i++){
			if(word.equalsIgnoreCase(sentenceArray[i])){
				Count++;
			}
		}
		return Count;
	}	
	

	@SuppressWarnings({"resource" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String word = sc.next();
		sc.nextLine();
		String[] sentences = new String[n];
		
		for(int i=0;i<n;i++) {
			sentences[i]=sc.nextLine();
		}
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		for(int i=0;i<n;i++) {
			map.put(countOccurrence(word,sentences[i]),sentences[i]);
		}
		
		Set<Map.Entry<Integer, String>> s = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> itr = s.iterator();
		
		//Map.Entry interface in Java provides certain methods to access the entry in the Map.
		while(itr.hasNext()) {
			Map.Entry<Integer, String> m = (Entry<Integer, String>) itr.next();
			System.out.println(m.getValue());
		}
			
		
	}

}
