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
	
	
	public static boolean checkStringPalindrome(String s) {
		return s.equals(new StringBuffer(s).reverse().toString());
		
	}
	
	//TC:O(n), SC: O(1)
	public static boolean checkSPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i < j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}
	
	//TC: O(n), SC: O(1)
	public static boolean checkStringPalin(String s) {
		  int l = 0;
			int h = s.length() -1;
			
			while(l <= h) {
	            char first = s.charAt(l);
	            char last = s.charAt(h);
				if(!Character.isLetterOrDigit(first)) {
					l++;
				} else if(!Character.isLetterOrDigit(last)) {
					h--;
				} else if(Character.toLowerCase(first) != Character.toLowerCase(last)) {
					return false;
				} else {
					l++;
					h--;
				}
			}
		
			return true;
	}
	
	//TC: O(n), SC: O(n) ignore recursion stack means Sc: O(1)
	public static boolean checkPalinRecur(String s, int l, int h) {
		
		boolean result = true;
		if(l <= h) {
            char first = s.charAt(l);
            char last = s.charAt(h);
			if(!Character.isLetterOrDigit(first)) {
				l++;
			} else if(!Character.isLetterOrDigit(last)) {
				h--;
			} else if(Character.toLowerCase(first) != Character.toLowerCase(last)) {
				return false;
			} else {
				l++;
				h--;
			}
			result = checkPalinRecur(s,l,h);
		}
		return result;
	}
	
	//TC: O(2^n), SC: O(n)
	public static int f(int i) {
		if(i == 0) 
			return 0;
		if(i == 1)
			return 1;
		return f(i-2) +f(i-1);
		
	}
	
	//TC: O(n), SC: O(1)
	public static void fibonacci(int n) {
        int start = 0;
        int nextStart = 1;
        int temp = 0;
    	System.out.print(temp + " ");
        for(int i = 1; i <=n; i++) {
        	System.out.print(nextStart+" ");

        	temp = start+nextStart;
        	start = nextStart;
        	nextStart = temp;
        }
        
	}

	//TC: O(n)+O(n) for calculating and printing, SC: O(n)
	public static void fibUsingArr(int n)  {
		int[] arr = new int[n+1];
		
		 arr[0] = 0;
		 arr[1] = 1;
		 
		 for(int i = 2; i <= n; i++) {
			 arr[i] = arr[i-2] +arr[i-1];
		 }
		 for(int i : arr) {
			 System.out.print(i + " ");
		 }
		
	}
		
	
	//TC: O(n), SC: O(1)
	public static void fibnocciSeriesDekh(int n) {
		int start = 0;
		int nextStart = 1;
		if(n == 0) {
			System.out.print(start + " ");
			return;
		}
		System.out.print(start+" "+nextStart+" ");
		for(int i = 2; i <=n; i++) {
			int current = start + nextStart;
			start = nextStart;
			nextStart= current;
			System.out.print(current+" ");
		}
	}
	public static void main(String[] args) {
		
		
		int n = 6;
		fibnocciSeriesDekh(n);
}
}