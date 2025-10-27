package Sorting_5;

import java.util.ArrayList;
import java.util.List;

public class SortingTechniques {

	//Best : O(n), avg, worst case : O(n^2), SC: O(1)
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			boolean shift = false;
			for(int j = 0; j < arr.length -1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					shift = true;
				}
			}
			if(shift == false) {
				System.out.println(i+"  >>> ");
				break;
			}
		}
		
	}
	
	//Best, avg, worst case : O(n^2), SC: O(1)

	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			int lowIndex = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[lowIndex]) {
					lowIndex = j;
				}
			}
			int temp = arr[lowIndex];
			arr[lowIndex] = arr[i];
			arr[i] = temp;
		}
		
	}
	
	//Worst TC/Avg TC: O(n^2), Best : O(n), SC: O(1)
	public static void insertionSort(int[] arr) {
	for(int i = 0; i < arr.length; i++) {
		int j =i;
		while(j > 0 && arr[j-1] > arr[j]) {
			int temp = arr[j];
			arr[j]  = arr[j-1];
			arr[j-1] = temp;
			j--;
		}
		
	
	}
	}
	
	//TC: nlog(n) SC: O(n)
	public static void mergeSort(int[] arr, int low, int high) {
		if(low < high) {
			int mid = (low+high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			sorting(arr, low, mid, high); 
			
		}
	}
	public static void sorting(int[] arr, int low, int mid, int high) {
		int left = low, right = mid+1;
		List<Integer> list = new ArrayList();
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				list.add(arr[left]);
				left++;
			}
			else  {
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
		
		for(int i = low; i<=high; i++) {
			arr[i] = list.get(i - low);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,4,3,2,1,6,1,2,3,4,5,5,1,9,110,3,2,3,111,1,1,1};
		mergeSort(arr, 0, arr.length-1);
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}
}
