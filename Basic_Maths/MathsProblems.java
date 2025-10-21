package Basic_Maths;

public class MathsProblems {
 
	
	//counting numbers Brute Force
	//TC: O(Log10(n)+1)  ,SC: O(1)
	public static int countNums(int n) {
		int temp = n;
		int counter = 0;
		while(temp > 0) {
			temp = temp/10;
			++counter;
		}
		return counter;
	}
	
	//Counting numbers Optimal Approach
	//TC: O(1), SC: O(1)
	public static int countNumsOptimal(int n) {
		return (int)Math.log10(n) +1;
	}
	
	//Reversing Number
	//TC: O(log10(n)+1), SC: O(1)
	public static int reversingNum(int n) {
		int temp = n;
		int reverseNum = 0;
		while(temp > 0) {
			int ld = temp%10;
			temp/=10;
			reverseNum = reverseNum*10+ld;
		}
		return reverseNum;
	}
	
	public static String reverseNum(int n) {
		return new StringBuffer(String.valueOf(n)).reverse().toString();
	}
	
	//TC: O(log10(n) +1), SC:O(1)
	public static int reverseNumbering(int n) {
		int temp = n;
		long reverseNum = 0;
		int maxNum= Integer.MAX_VALUE;
		int minNum = Integer.MIN_VALUE;
		while(temp != 0) {
			int ld = temp%10;
			temp/=10;
			reverseNum = reverseNum*10+ld;
			if(reverseNum > maxNum || reverseNum < minNum) {
				return 0;
			}
		}
		return (int) reverseNum;
	}
	
	
	//TC: O(log10(n+1)), SC:O(1)
	public static boolean checkpalindrome(int n) {
		int temp = n;
		int rev = 0;
		while(temp > 0) {
			int ld = temp%10;
			temp/=10;
			rev = rev*10+ld;
		}
		return n == rev;
	}
	
	//TC:O(Math.min(m,n)), SC:O(1)
	public static int findGCD(int m, int n) {
		int max = 0;
		for(int i = 1; i <= Math.min(m,n); i++) {
			if(m % i == 0 && n % i == 0) {
				max = i;
			}
		}
		return max;
	}
	
	//TC:O(Math.min(m,n)), SC:O(1)
	public static int findGCDNum(int m, int n) {
		for(int i = Math.min(m, n); i> 0;i--) {
			if(m % i == 0 && n % i == 0) {
				return i;
			} 
		}
		return 1;
	}
	
	//TC: O(log10(n)+1), SC: O(1)
	public static boolean armstrongNum(int n) {
		int temp = n;
		int counter = (int) Math.log10(temp)+1;
		int sum = 0;
		while(temp > 0) {
			int ld = temp%10;
			sum = sum + (int)Math.pow(ld, counter);
			temp/=10;
		}
		return sum == n;
		
	}
	
	//TC: O(n), SC: O(N)
	public static void printDivisors(int n) {
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				 System.out.print(i + " ");
			}
		}
	}
	
	
	//TC: O(sqrt(n)), SC: O(2*sqrt(n))
	public static void printDivisorsOptiomal(int n) {
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
				if(n/i != i) {
					System.out.print(n/i + " ");
				}
			}
		}
	}
	
	
	
	//TC: O(n), SC: O(1)
	public static  boolean checkPrime(int n) {
		int counter= 0;
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				counter++;
			}
		}
		return counter ==2;
	}
	
	//TC: O(sqrt(n)), SC: O(1)
	public static boolean checkPrimeNum(int n) {
		int counter = 0;
		for(int i = 1; i <= Math.sqrt(n);i++) {
			if(n%i == 0) {
				counter++;
				if(n/i != i) {
					counter++;
				}
			}
		}
		return counter == 2;
	}
 	public static void main(String[] args) {
 		for(int i = 1; i < 100; i++) {
 			if(checkPrimeNum(i)) {
 		 		System.out.println(i);
 			}
 		}
	}
}
