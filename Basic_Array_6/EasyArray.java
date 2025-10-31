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
   
 //TC:O(n), SC:O(1)
   public static void printArr(int[] arr) {
	   for(int i = 0; i < arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
	   System.out.println();
   }
   
   //TC: O(n), SC: O(1)
   public static void leftRotateByOnePlace(int[] arr) {
	   printArr(arr);
	   int temp = arr[0];
	   for(int i = 1; i< arr.length;i++) {
		   arr[i-1] = arr[i];
		   }
	   arr[arr.length -1] = temp;
	   printArr(arr);
	   }
   
   //TC: O(k*n), SC:O(1)
   public static void leftRotateByKPlaces(int[] arr, int k) {
	    k = k%arr.length;
	   while(k >0) {
		   leftRotateByOnePlace(arr);
		   k--;
	   }
   }
   
   //TC: O(2n)~O(n), SC:O(1)
   public static void leftRotateByKPlacesRev(int[] arr, int k) {
	   printArr(arr);

	   reverseArray(arr, 0, k-1);             //TC:O(k)
	   reverseArray(arr, k, arr.length-1);    //TC:O(n-k)
	   reverseArray(arr, 0, arr.length-1);    //TC:O(n)
	   
	   printArr(arr);

	   
   }
   
   
   //TC: O(n/2)~O(n), Sc: O(1)
   public static void reverseArray(int[] arr, int low, int high) {
	   while(low <= high) {
		   int temp = arr[low];
		   arr[low] = arr[high];
		   arr[high]= temp;
		   low++;
		   high--;
		   }
	   
   }

   
   //TC:O(n), SC:O(1)
   public static void rightRotateByOnePlace(int[] arr) {
	   printArr(arr);
	   int temp = arr[arr.length - 1]; // Save last element
	    for (int i = arr.length - 1; i > 0; i--) {
	        arr[i] = arr[i - 1]; // Shift elements to the right
	    }
	    arr[0] = temp; // Place last element at the start
	   printArr(arr);

   }
   
   //TC:O(k*n), SC:O(1)
   public static void rightRotateByKPlaces(int[] arr, int k) {
	   k = k%arr.length;
	   while(k > 0) {
		   rightRotateByOnePlace(arr);
		   k--;
	   }
   }
   
   //TC:O(2n) ~ O(n), SC:O(1)
   public static void rightRotateByKPlacesRev(int[] arr, int k) {
	   printArr(arr);
	   k = k%arr.length;
	   reverseArray(arr, 0, arr.length-1); //O(n)
	   reverseArray(arr, 0, k-1);          //O(k) 
	   reverseArray(arr, k, arr.length-1);  //O(n-k)
	   printArr(arr);
   }
   
   //For Left and right shift by k places in array. 
   //The order of reversing the entire array is slightly different.
   //Observe that.
   
   //TC:O(n), SC:O(n)
   public static int[] moveZerosToEnd(int[] arr) {
	   printArr(arr);
	   int[] res = new int[arr.length];
	   int j = 0;
	  for(int i = 0; i < arr.length; i++) {
		  if(arr[i] != 0) {
			  res[j] = arr[i];
			  j++;
		  }
		  
	  }
	  return res;
   }
   
   //TC: O(n), SC:O(1)
   public static void moveZeroes(int[] nums) {
       
	  int i = 0, j =0;
	  while(j < nums.length) {
		  if(nums[j] != 0) {
			  int temp = nums[j];
			  nums[j] = nums[i];
			  nums[i] = temp;
			  i++;
			  j++;
		  } else {
			  j++;
		  }
	  }
	 
 
   }
   
   
   
	public static void main(String[] args) {
		int[] arr = new int[] {0,0,1,0};
		moveZeroes(arr);
		 printArr(arr);
	}
}
