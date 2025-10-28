package Basic_Hashing_4;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Hashing {
	
	//TC: O(n*n), SC: O(n)
	public static int[] countFreq(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > temp) {
				temp = arr[i];
			}
		}
		
		int[] arrayy = new int[temp+1];
		
		for(int i= 0; i <arr.length;i++) {
			arrayy[arr[i]] = arrayy[arr[i]]+1;
		}
		
		return arrayy;
	}
	
	//TC: O(n), Sc: O(n)
	public static Map<Integer, Integer> countFreqqq(int[] arr){
		
		Map<Integer, Integer> m= new HashMap<>();
		for(int i =0; i<arr.length;i++) {
			m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
		}
		return m;
	}
	
	//TC: O(n), Sc: O(n)
	public static void countFreqUsingStreams(int[] arr) {
	Map<Integer, Long> maps =	Arrays.stream(arr).boxed().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
System.out.println(maps);
	}
	
	//TC: O(n), SC: O(n)
public static void countFreqElements(int[] arr){
	
		
		Map<Integer, Integer> m= new HashMap<>();
		for(int i =0; i<arr.length;i++) {
			m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
		}

		int maxFreq = 0, minFreq = arr.length;
		int maxElement = 0, minElement = 0;
		
		for(Entry<Integer,Integer> entry: m.entrySet()) {
		int element = entry.getKey();
		int count = entry.getValue();
		if(count > maxFreq) {
			maxFreq = count;
			maxElement = element;
		}
		
		if(count < minFreq) {
			minFreq = count;
			minElement = element;
		}
		}
		System.out.println("min element:"+minElement+">>>>>>"+ "min freq:"+minFreq);
		System.out.println("max element:"+maxElement+">>>>>>"+ "max freq:"+maxFreq);

		
	}

//TC:O(n), SC:O(1)
public static int[] charHashLowerCase(String s) {
	int[] arr = new int[26];
	for(int i = 0; i <s.length(); i++) {
		arr[s.charAt(i) - 'a'] = arr[s.charAt(i) -'a']+1;
	}
	return arr;
}
//TC:O(n), SC:O(1)
public static  int[] charHash(String s) {
	
	
	int[] arr = new int[255];
	
	for(int i = 0; i <s.length();i++){
		arr[s.charAt(i)] = arr[s.charAt(i)]+1;
	}
	return arr;
}


//TC:O(n), SC:O(1)
public static int particularCharHash(String s, char character) {
	
	int count = 0;
	for(int i =0; i <s.length();i++) {
		if(character == s.charAt(i)) {
			++count;
		}
	}
	
	return count;
}


public static Map<Character, Integer> countStringUsingHashMap(String s) {
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	
	for(int i = 0; i < s.length(); i++) {
		map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
	}
	return map;
}

//TC: O(n), SC: O(n)
public static Map<String, Long> charHasingUsingStreaming(String s) {
  Map<String, Long> map = Stream.of(s.split("")).collect(Collectors.groupingBy(s1->s1, Collectors.counting()));
	return map;
}

public static void main(String[] args) {
	
	System.out.println(charHasingUsingStreaming("abcABCABCabczzzz"));
	
//	Map<Character, Integer> map = countStringUsingHashMap("abcABCABCabczzzz");
	
//	for(Entry<Character, Integer> entry : map.entrySet()) {
//		if(entry.getValue() != 0) {
//			System.out.println(entry.getKey()+">>>>>>"+entry.getValue());
//		}
//	}
//	
	
//System.out.println(particularCharHash("abcabcabczABCABCABCaaaaa    123",'a'));
//
//int[] arr = charHashLowerCase("abcabcabc");
//for(int i = 0; i <arr.length;i++) {
//	if(arr[i] != 0) 
//	System.out.println((char)(i+'a')+">>>" +arr[i]);
//}

	
}

}
