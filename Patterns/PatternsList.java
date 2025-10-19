package Patterns;

public class PatternsList {
	
	public static void p1(int n) {
		for(int i = 1; i <=n; i++) {
			for(int j = 1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	// TC: O(n*n), SC: O(1)
	
	public static void p2(int n) {
		for(int i = 1; i <=n; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// TC: O(n*n), SC: O(1)
	public static void p3(int n) {
		for(int i = 1; i <=n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	// TC: O(n*n), SC: O(1)
	public static void p4(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	// TC: O(n*n), SC: O(1)
	
	public static void p5(int n) {
		for(int i = 0; i < n; i++) {
				for(int j = n-i; j> 0; j--) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
	// TC: O(n*n), SC: O(1)

	
	
	public static void p6(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	// TC: O(n*n), SC: O(1)

	public static void p7(int n) {
		for(int i = 0; i < n; i++) {
			//space
			for(int j = 1; j <= n-i-1; j++) {
				System.out.print(" ");
			}
			//stars
			
			for(int k = 1; k <= 2*(i)+1; k++) {
				System.out.print("*");
			}
			
			//space
			for(int j = 1; j <= n-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	// TC: O(n*n), SC: O(1)
	
	public static void p8(int n) {
		for(int i = 0; i < n; i++) {
			
			//spaces
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			//stars
			for(int j = 2*(n-i)-1; j> 0; j-- ) {
				System.out.print("*");
			}
			
			//spaces
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
	}

	// TC: O(n*n), SC: O(1)
	
	public static void p9(int n) {
		p7(n);
		p8(n);
	}
	
	// TC: O(n*n), SC: O(1)
     
    public static void p10(int n) {
    	for(int i = 1; i <= 2*n-1; i++) {
    		int stars = i <= 2*n/2? i : 2*n -i;
    		
    		for(int j = 1; j <= stars; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }	
    
	// TC: O(n*n), SC: O(1)
  
    public static void p11(int n) {
    	for(int i = 1; i <= n; i++) {
    		int printtt = i % 2 == 0 ? 0 : 1;
    		for(int j = 1; j <= i ; j++) {
    			System.out.print(printtt);
    			printtt = 1 -printtt ;
    		}
    		System.out.println();
    	}
    }

	// TC: O(n*n), SC: O(1)

   
  public static void main(String[] args) {
            p11(10);
  }
}
