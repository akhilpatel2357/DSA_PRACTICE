package Basic_Hashing_4;
import java.util.*;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.stream.Collectors;
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
public static void main(String[] args) {
	countFreqElements(new int[] {1,1,2,2,2,2,2,2,3,4,5,56,7,7,88,9,9,10000000});

	
}

}
