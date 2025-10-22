package Basic_Recursion_3;

public class BasicRecursion {

	//TC: O(n), SC: O(n)
	public static void printName(int n, String name) {
		if(n > 0) {
			System.out.println(name);
			printName(--n, name);
		}
	}
	
	//TC: O(n), SC: O(n)
	public static  void printNums(int num, int start) {
		if(start <= num) {
			System.out.print(start + " ");
			printNums(num, ++start);
		}
	}
	
	//TC, SC: O(n)
	public static void printNumsBackTrace(int num) {
		if(num > 0) {
			printNumsBackTrace(num-1);
			System.out.print(num +" ");
		}
	}
	
	//TC, SC:O(n)
	public static void printNToOne(int n) {
		if(n > 0) {
			System.out.print(n+" ");
			printNToOne(n-1);
		}
		
	}
	
	//TC, SC:O(n)
	public static void printNToOneBack(int n) {
		if(n > 0) {
			printNToOneBack(n-1);
			System.out.print(n+" ");
		}
		
	}
	
	//functional recursion
	//TC, SC: O(n)
	public static int sumOfN(int n) {
		if(n == 0) 
			return 0;
		return n+sumOfN(n-1);
			
	}
	
	//Parameterized recursion
	//TC, SC: O(n)
	public static int sumofNPara(int n, int sum) {
		if(n > 0) {
			sum = sum + n;
			sum = sumofNPara(n-1, sum);
		}
		return sum;
	}
	
	//TC, SC: O(n)
	public static int fact(int n) {
		if(n == 0)
			return 1;
		return n*fact(n-1);
		
		}
	//TC: O(n), SC: O(n)
	public static void reverseArr(int[] arr, int[] rev, int start, int end) {
		if(end >= 0) {
			rev[start] = arr[end];
		    reverseArr(arr, rev, start+1, end-1);
		}
		
	}
	
	//TC: O(n), SC: O(1)

	public static void reverseArray(int[] arr, int start, int end) {
		if(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseArray(arr, start+1, end-1);
		}
	}
	
	public static void main(String[] args) {
		int[] org = new int[] {1,2,3,4,5, 6,7, 8,9,10};
		int[] rev = new int[org.length];
	//	reverseArr(org, rev, 0, org.length-1);
		
		reverseArray(org, 0, org.length -1);
		for(int i: org) {
			System.out.print(i + " ");
		}
	}
}
