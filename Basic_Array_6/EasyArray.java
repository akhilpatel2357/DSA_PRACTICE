package Basic_Array_6;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class EasyArray {

	//TC:O(n), SC:O(1)
	public static int largestEleInArr(int[] arr) {
		int maxElement = 0;
		for(int i : arr) {
			if(i > maxElement) {
				maxElement = i;
			}
		}
		return maxElement;
		
	}
	
	
	//TC: O(n), Sc: O(1)
   public static void findSecEleArr(int[] arr) {
	   
	   int firstHigh = Integer.MIN_VALUE, firstLow = Integer.MAX_VALUE;
	   int secHigh = Integer.MIN_VALUE, secLow = Integer.MAX_VALUE;
	   int thirdHigh = Integer.MIN_VALUE, thirdLow = Integer.MAX_VALUE;

	   
	   
	   
	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i] > firstHigh) {
			   thirdHigh = secHigh;
			   secHigh = firstHigh;
			   firstHigh = arr[i];
		   } 
		   else if(arr[i] > secHigh && arr[i] != firstHigh) {
			   thirdHigh = secHigh;
			   secHigh = arr[i];
		   } else if(arr[i] > thirdHigh && arr[i] != firstHigh && arr[i] != secHigh) {
			   thirdHigh = arr[i];
			   
		   }
		   
		   if(arr[i] < firstLow) {
			   secLow = firstLow;
			   firstLow = arr[i];
		   } 
		   else if(arr[i] < secLow && arr[i] != firstLow) {
			   secLow = arr[i];
		   }
		   
		   
		   
		   
	   }
	   
	   System.out.println("low:::"+firstLow+">>>"+"secLow:::"+secLow);
	   System.out.println("high:::"+firstHigh+">>>"+"secHigh:::"+secHigh+"third high"+thirdHigh);

   }
	
   //TC: O(n), SC: O(1)
   public static boolean checkArraySort(int[] arr) {
	    boolean check = true;
	   for(int i =0; i < arr.length-1; i++) {
		   if(arr[i] > arr[i+1]) {
			   check = false;
		   }
	   }
	   return check;
	   
   }
   //TC: O(n), SC: O(1)
   public static boolean checkArraySortRotated(int[] arr) {
	    int check = 0;
	   for(int i =0; i < arr.length; i++) {
		   if(arr[i] > arr[(i+1) % arr.length]) {
			   check = check+1;
		   }
	   }
	   System.out.println(check);
	   return check <= 1;
	   
  }
   //TC:O(n), SC:O(n)

   public int removeDuplicates(int[] nums) {
	   Set<Integer> sert = new LinkedHashSet();

for(int i: nums) {
   sert.add(i);
}
	 Iterator<Integer> m = sert.iterator();
	 int i = 0;
	 while(m.hasNext()) {
		 nums[i] = m.next();
   i++;
	 }


    return sert.size();
}
   
   //TC:O(n), SC:O(n)
   public static int removeDupElements(int[] arr) {
	   Set<Integer>  sert = new HashSet<Integer>();
	   int j= 0;
			   for(int i : arr) {
				   if(!sert.contains(i)) {
					   sert.add(i);
					   
					   arr[j] = i;
					   j++;
				   }
				   
			   }
			 return  sert.size();
	   
   }
   //TC:O(n), SC:O(1)
   public static int removeDupEleUsingPointers(int[] arr) {
	   int i = 0;
	   for(int j = 1; j<arr.length; j++) {
		   if(arr[j] != arr[i]) {
			   i++;
			   arr[i] = arr[j];
		   }
	   }
	return i+1;
	   
   }
   
   //TC:O(n), SC:O(n)
   public static void rightRotate(int[] arr, int k) {
	   int[] abc = new int[arr.length];
	   for(int i = 0; i < arr.length;i++) {
		   abc[(i+k)%arr.length] = arr[i];
	   }
	   for(int i : arr)
	   System.out.print(i+" ");
	   
	   
	   System.out.println();
	   for(int i : abc)
		   System.out.print(i+" ");
	   
   }
	public static void main(String[] args) {
		rightRotate(new int[] {1,2,3,4,5,6,7},3);
	}
}
