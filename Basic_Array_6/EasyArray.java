package Basic_Array_6;

import java.util.Arrays;

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
   
   public static boolean checkArraySortRotated(int[] arr) {
	    int check = 0;
	   for(int i =0; i < arr.length-1; i++) {
		   if(arr[i] > arr[i+1]) {
			   check = check+1;
		   }
	   }
	   System.out.println(check);
	   return check <= 1;
	   
  }
	public static void main(String[] args) {
	System.out.println(checkArraySortRotated(new int[] {0,1,2,31,2,3,4,5,6}));	
	}
}
