package Basic_Array_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediumArray {
	
	
	
	//TC: O(n*n*n), SC: O(1)
	  public static int subarraySum2(int[] nums, int k) {
	        int count = 0; 
	        for(int i = 0; i < nums.length; i++) {
	            long sum = 0;
	            for(int j = i; j< nums.length; j++) {
	            	for(int m = i; m<=j; m++) {
		                sum += nums[m];
	            	}
	                if(sum == k) {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	  
	//TC: O(n*n), SC: O(1)
	  public static int subarraySum(int[] nums, int k) {
	        int count = 0; 
	        for(int i = 0; i < nums.length; i++) {
	            long sum = 0;
	            for(int j = i; j< nums.length; j++) {
	                sum += nums[j];
	                if(sum == k) {
	                    count++;
	                }
	            }
	        }
	        return count;
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
	   
	   //TC: O(n), SC:O(n)
	   public static int[] twoSumUsingHashMap(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap();
	        for(int i = 0; i < nums.length; i++) {
	            int rem = target - nums[i];

	            if(map.containsKey(rem)) {
	            	//return "yes";
	                return new int[]{map.get(rem), i};
	            }

	            map.put(nums[i], i);
	        }
	       return new int[]{-1,-1};
	      // return "no";
	    }
	   
	   //TC: O(n*n), SC: O(1)
	   public static int[] twoSumBruteForce(int[] nums, int target) {
		   for(int i =0; i < nums.length; i++) {
			   for(int j = i+1; j< nums.length; j++) {
				   int rem = nums[i] + nums[j];
				   if(rem == target) {
					   return new int[] {i, j};
					   //return "yes";
				   }
			   }
		   }
		   return new int[] {-1,-1};
		   //return "no";
	   }
	   
	   
	   //TC:O(2n), SC:O(1)
	   public static void sortOnesTwosProb(int[] arr) {
		   
		   int oneCount = 0;
		   int twoCOunt = 0;
		   int zeroCount = 0;
		   
		   for(int i :arr) {
			   if(i == 0) {zeroCount++;
				   
			   } else if(i == 1) {
				   oneCount++;
			   }  else {
				   twoCOunt++;
			   }
		   }
		   
		   
		   for(int i = 0; i< zeroCount ;i++) {
			   arr[i] = 0;
		   }
		   
		   for(int j = zeroCount; j<zeroCount+oneCount; j++) {
			   arr[j] = 1;
		   }
		   
		   for(int z =zeroCount+oneCount; z< arr.length; z++) {
			   arr[z] = 2;
		   }
	   }
	   
	   
	   
	   
	   //sort an array of 0s,1s and 2s
	   //Merge Sort Implementation
	   
	   //TC: O(nlogn), SC: O(n)
	   public static void zeroOneSort(int[] arr, int low, int high) {
		  if(low <high) {
			  int mid = (low+high)/2;
			   zeroOneSort(arr, 0, mid);
			   zeroOneSort(arr, mid+1, high);
			   sorting(arr, low, mid, high);
		  }
	   }
	   
	   public static void sorting(int[] arr, int low, int mid, int high) {
		   int left = low;
		   int right = mid+1;
		   
		   List<Integer> list = new ArrayList<Integer>();
		   
		   while(left <= mid && right <= high) {
			   
			   if(arr[left] <= arr[right]) {
				   list.add(arr[left]);
				   left++;
			   } else {
				   list.add(arr[right]);
				   right++;
			   }  
		   }
		   
		   while(left <= mid) {
			   list.add(arr[left]);
			   left++;
		   }
		   
		   while(right <= high) {
			   list.add(arr[right]);
			   right++;
		   }
		   
		   
		   for(int i = low; i <= high; i++) {
			   arr[i] = list.get(i-low);
		   }
	   }
	   
	   //TC: O(2n), SC:O(1)
	   public static void zeroOneCounterMethods(int[] arr) {
		   int zeroCounter = 0;
		   int oneCounter = 0;
	//	   int twoCounter = 0;
		   
		   for(int i : arr) {
			   if(i == 0) {
				   zeroCounter++;
			   } else if(i == 1) {
				   oneCounter++;
			   }
//			   } else {
//				   twoCounter++;
//			   }
		   }
		   
		   
		   for(int i = 0; i < zeroCounter; i++) {
			   arr[i] = 0;
		   }
		   
		   for(int i = zeroCounter; i < zeroCounter +oneCounter ; i++) {
			   arr[i] = 1;
		   }
		   
		   for(int i = zeroCounter +oneCounter; i < arr.length ; i++) {
			   arr[i] = 2;
		   }
		   
	   }	   
	   
	   
	   //TC: O(n), Sc: O(1)
	   //DNF =  Dutch national flag
	   // 0 - low-1 -> 0,0,.....
	   // low - mid-1 -> 1,1,1....
	   // mid - high -> 0,1,2,2,1,0... random
	   // high+1 - n-1 -> 2,2,2......
	   public static void zeroOneSortOptimal(int[] arr) {
		   
		   int low = 0;
		   int mid = 0;
		   int high = arr.length -1;
		   
		   
		   while(mid <= high) {
		   if(arr[mid] == 0) {
			   int temp = arr[mid];
			   arr[mid] = arr[low];
			   arr[low] = temp;
			   low++; mid++;
		   } else if(arr[mid] == 1) {
			   mid++;
		   } else {
			   int temp = arr[mid];
			   arr[mid] = arr[high];
			   arr[high] = temp;
			   high--;
		   }
		   
		   }
		   
	   }
	   
	   //TC: O(n*n), SC:O(1)
	   public static int findMajorityNaiveApproach(int[] arr) {
		   int n = arr.length;
		   for(int i= 0; i < n; i++) {
			   int count = 0;
			   for(int j = 0; j< n; j++) {
				    if(arr[j] == arr[i]) {
				    	count++;
				    }
				   if(count > n/2) 
					   return arr[i];
				   
			   }
		   }
		   return -1;
	   }
	   
	   //TC: O(n), SC: O(n)
	   public static int findMajorityElement(int[] arr) {
		   Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		   int n = arr.length;
		   
		   for(int i : arr) {
			   map.put(i, map.getOrDefault(i, 0) +1);
		   }
		   
		   for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			   int key = e.getKey();
			   int value = e.getValue();
			   if(value > n/2) {
				   return key;
			   }
			   
		   }
		   return -1;
	   }
	   
	   
	  
	   
	   
public static void main(String[] args) {
	int[] arr = {4,4,2,4,3,4,4,3,2,4};
	System.out.println(findMajorityNaiveApproach(arr));
	
}
}
