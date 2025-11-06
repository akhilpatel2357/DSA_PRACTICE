package Basic_Array_6;

import java.util.HashMap;
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
public static void main(String[] args) {
	int[] arr = {0,1,2,1,0,2,0,1,2,0,1,2};
	sortOnesTwosProb(arr);
	for(int i : arr) {
		System.out.print(i+" ");
	}
	
}
}
