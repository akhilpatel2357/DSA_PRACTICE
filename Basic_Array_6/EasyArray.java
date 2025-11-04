package Basic_Array_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
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
   
   //TC:O(n), SC:O(1)
   public static int findElementIndex(int[] arr, int num) {
	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i] == num) {
			   return i;
		   }
	   }
	   
	   return -1;
   }
   
   //TC: (m+n), SC: O(m+n)
   public static Set<Integer> unionOfArrays(int[] arr, int[] sec) {
	   
	   
	   
	   printArr(arr);
	   printArr(sec);
        Set<Integer> list = new LinkedHashSet<Integer>();	   
	   int arrHigh= arr.length -1;
	   
	   int secHigh = sec.length -1;
	   
	   int left = 0, right = 0;
	   while(left <= arrHigh && right <= secHigh) {
		   
		   if(arr[left] <= sec[right]) {
			   list.add(arr[left]);
			   left++;
		   } else  {
			   list.add(sec[right]);
    		   right++;
		   } 
		   
	   }
	   
	   while(left <= arrHigh) {
			 list.add(arr[left]);
		 left++;
	   }
	   
	   while(right <= secHigh) {
		   list.add(sec[right]);
		   right++;

	   }
	   
	   return list;
   }
   
   //TC:O(n*n), SC:O(1)
   public static int findMissingNum(int[] arr) {

      for(int k =0; k<= arr.length; k++) {
    	  boolean notPresent = true;
    	  for(int i = 0; i < arr.length; i++) {
    		  if(k == arr[i]) {
    			  notPresent = false;
    			  break;
    		  }
    	  }
    	  if(notPresent) {
    		  return k;
    	  }
    	  
    	  
      }
      return -1;
}
   
   
   
   
   //TC:O(n), SC:O(1)
   public static int findMissingNumUsingFormula(int[] arr) {
	   int n = arr.length;
	   int actualSum = n*(n+2)/2;
	   int sum = 0;
	   for(int i : arr) {
		   sum+=i;
	   }
	   return actualSum- sum;
	   
   }
//TC:O(n), SC: O(1)
   public static int maxConsecutiveOnes(int[] arr) {
	   int count = 0;
	   int maxCount = 0;
	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i] ==1) {
			   count++;
			   maxCount = Math.max(maxCount, count);
		   } else {
			   count = 0;
		   }
	   }
	   return maxCount;
   }
   
   //TC: O(nlogm)+O(m), SC: O(n) m = size of map, m= n/2 +1 where n = size of array
   public static int NumAppearsOnce(int[] arr) {
	   
	   Map<Integer, Integer> map = new HashMap();
	   for(int i : arr) {
		   map.put(i, map.getOrDefault(i, 0) +1);
	   }
	   
	   for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
		   if(entry.getValue() == 1) {
			   return entry.getKey();
		   }
	   }
	   return -1;
   }
   
   
   
   
   //TC: O(n*n), SC; O(1)
   public static int NumAppearsOnceBrute(int[] arr) {
	   
	   for(int i = 0; i < arr.length; i++) {
		   int ele = arr[i];
		   int count = 0;
		   for(int j = 0; j < arr.length; j++) {
			   if(ele == arr[j]) {
				   count++;
			   }
		   }
		   if(count == 1)
			   return ele;
	   }
	   
	  return -1;
   }
  
   //TC: O(n) +O(n)+O(m) ~O(n), Sc: O(n+1)
   public static int NumAppearsOnceArrayHashing(int[] arr) {
	   int max=0;
	   for(int i : arr) {
		   max = Math.max(max, i);
	   }
	   
	   int[] res = new int[max+1];
	   
	   
	   for(int i: arr) {
		   res[i]++;
	   }
	   
	   for(int i = 0; i < res.length; i++) {
		   if(res[i] == 1) {
			   return i;
		   }
	   }
	   
	   return -1;
	   
   }
   
   //TC:O(n), SC:O(1)
   public static int numAppearingOnceUsingXor(int[] arr) {
	   
	   int xor = 0;
	   for(int i : arr) {
		   xor = xor^i;
	   }
	   return xor;
   }
   
   //TC: O(n*n*n), SC: O(1)
   public static int longestSubArrayLengthBr1(int[] arr, int k) {
	   int maxLength = 0; 
	   for(int i = 0; i < arr.length; i++) {
		   for(int j = i; j< arr.length; j++) {
			   int sum = 0;
			   for(int m = i; m <= j; m++) {
				   sum+=arr[m];
			   }
			   if(sum == k) {
				   maxLength = Math.max(maxLength, j-i+1);
			   }
		   }
	   }
	   return maxLength;
   }
   
   //TC: O(n*n), SC: O(1)
   public static int longestSubArrayLengthBr2(int[] arr, int k) {
	   int maxLength = 0; 
	   for(int i = 0; i < arr.length; i++) {
		   int sum = 0;
		   for(int j = i; j< arr.length; j++) {
				   sum+=arr[j];
			   
			   if(sum == k) {
				   maxLength = Math.max(maxLength, j-i+1);
			   }
		   }
	   }
	   return maxLength;
   }
   
   //Its for both positives and negatives 
	   //TC: O(n), SC: O(n)
	   public static int longestSubArrayLengthUsingHasing(int[] arr, int k) {
		   long sum = 0;int maxLength = 0;
		   Map<Long, Integer> map = new HashMap();
		   for(int i = 0; i < arr.length; i++) {
			         sum += arr[i];
			   
			   if(sum == k) {
				   maxLength = Math.max(maxLength, i+1);
			   }
			   
			   long rem = sum - k;
			   
			   //reverse Engineering
		        // If (sum - k) seen before, we found a subarray with sum k
			   if(map.containsKey(rem)) {
				   maxLength = Math.max(maxLength, i - map.get(rem)+1);
			   }
			   
		        // Store the first occurrence of this sum

			   if(!map.containsKey(sum)) {
				   map.put(sum, i);
			   }
			   
			   
		   }
		   
		   return maxLength;
	   }
	   
   //TC: O(n), SC: O(1)
	   // Its only for positives
   public static int longestSubArrUsingSlidingWindow(int[] arr, int k) {
	   int sum = 0, maxLen = 0; int j = 0; int i = 0;
	  
		  while(j < arr.length)     {
			  sum += arr[j];
			   
			   while(sum> k && i<=j){
			    	 sum-= arr[i];
			    	 i++;
			     }

			   if(sum == k) {
			    	 maxLen = Math.max(maxLen, j-i+1);
			    	 j++;
			     } 
			   if(sum < k) {
				   j++;
			     } 
			
					  }
	   return maxLen;
	   
   }
   
   
   //Counting number of subarrays
   //TC:O(n), SC:O(n)
   public static int subarraySumUsingSlidingWindow(int[] nums, int k) {
	    long sum = 0;
	    int count = 0;

	    Map<Long, Integer> map = new HashMap<Long, Integer>();
	    for(int i  = 0; i < nums.length; i++) {
	        sum += nums[i];


	        if(sum == k) {
	            count++;
	        }


	     long rem = sum - k;

	     if(map.containsKey(rem)) {
	        count+= map.get(rem);
	     }

	        map.put(sum, map.getOrDefault(sum, 0)+1);

	    }
	return count;
	    }
   
  	public static void main(String[] args) {
  		int[] arr1= {1};
  		int[] arr2 = {2,3,5};
          System.out.println(subarraySumUsingSlidingWindow(arr1, 0));
		 
		// printArr(arr1);
	}
}
