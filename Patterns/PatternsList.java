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
    
    public static void p12(int n) {
    	for(int i = 1; i <=n; i++) {
    		for(int j = 1; j<=i; j++) {
    			System.out.print(j);
    		}
    		
    	    for(int k = 1; k<=2*(n-i); k++) {
    	    	System.out.print(" ");
    	    }
    	    
    	    for(int m = i; m>0; m--) {
    	    	System.out.print(m);
    	    }
    	    System.out.println();
    	}
    }
    
	// TC: O(n*n), SC: O(1)

    public static void p13(int n) {
    	int k = 1;
    	for(int i = 1; i <=n; i++) {
    		for(int j = 1; j <=i; j++) {
    			System.out.print(k+" ");
    			k++;
    		}
    		System.out.println();
    	}
    }
	// TC: O(n*n), SC: O(1)

    public static void p14(int n) {
    	for(int i = 1; i <=n; i++) {
    		int k = 65;
    		for(int j = 1; j<=i; j++) {
    			System.out.print((char) k);
    			k++;
    		}
    		System.out.println();
    	}
    }
	// TC: O(n*n), SC: O(1)

    public static void p15(int n) {
    	for(int i = 0; i <n; i++) {
    		int k = 65;
    		for(int j = n-i; j>0; j--) {
    			System.out.print((char)k);
    			k++;
    		}
    		System.out.println();
    	}
    }
    
	// TC: O(n*n), SC: O(1)
   public static void p16(int n) {
	   int k = 65;
	   for(int i = 1; i <= n; i++) {
		   for(int j = 1; j <= i; j++) {
			   System.out.print((char) k);
		   }
		   k++;
		   System.out.println();
	   }
   }
	// TC: O(n*n), SC: O(1)

   
   public static void p17(int n) {
	   for(int i = 0; i <n; i++) {
		   for(int j = n-1-i; j>0; j--) {
			   System.out.print(" ");
		   }
		   
		   int m = 64;
		   for(int k = 0; k < 2*i+1; k++) {
			   
			   m =  k <= (2*i+1)/2  ? m+1:m-1;
			   System.out.print((char)m);
		   }
		   for(int j = n-1-i; j>0; j--) {
			   System.out.print(" ");
		   }
		   System.out.println();
	   }
   }
	// TC: O(n*n), SC: O(1)

   public static void p18(int n) {
	   int m = 65+n;
	   for(int i = 1; i <= n; i++) {
		   m = m-i;
		   for(int j = 1; j <= i; j++) {
			   System.out.print((char) m);
			   m++;
		   }
		   System.out.println();
	   }
   }
   
	// TC: O(n*n), SC: O(1)

   
   public static void p19(int n) {


	   for(int i = 0; i <n; i++) {
		   for(int j = n-i; j >0; j--) {
			   System.out.print("*");
		   }
		   for(int k = 1; k <=2*i; k++) {
			   System.out.print(" ");
		   }
		   for(int j = n-i; j >0; j--) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   
	   for(int i = 0; i <n; i++) {
		   for(int j = 0; j<= i; j++) {
			   System.out.print("*");
		   }
		   for(int j =1 ; j <= 2*(n-i-1); j++) {
			   System.out.print(" ");
		   }
		   for(int j = 0; j<= i; j++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
   
   
   public static void p20(int n) {
	   for(int i = 1; i <= 2*n-1; i++) {
		   int stars = i <= 2*n/2 ? i : (2*n)-i;
		   
		   for(int j = 1; j <= stars; j++) {
			   System.out.print("*");
		   }
		   
		   int spaces = i <= 2*n/2 ? 2*(n-i) : 2*(i-n);
		   for(int k= 1; k <= spaces; k++) {
			   System.out.print(" ");
		   }
		   for(int j = 1; j <= stars; j++) {
			   System.out.print("*");
		   }
		   System.out.println();

	   }
   }
   
	// TC: O(n*n), SC: O(1)

   public static void p21(int n) {
	   for(int i= 0; i < n; i++) {
		   for(int j = 0; j<n; j++) {
			   if(i == 0 || i == j || j == n-i-1 || i == n-1) {
				   System.out.print("*");
			   } else {
				   System.out.print(" ");
			   }
			    
		   }
		   System.out.println();
	   }
   }
	// TC: O(n*n), SC: O(1)

   public static void p22(int n) {
	   for(int i = 0; i < 2*n-1; i++) {
		   for(int j = 0; j < 2*n-1; j++) {
			   int top = j;
			   int bottom = 2*n-j-1-1;
			   int left = i;
			   int right = 2*n-i-1-1;
			   
			   int g = n-Math.min(Math.min(right, bottom), Math.min(top, left));
			   System.out.print(g);
		   }
		   System.out.println();
	   }
	   
   }
	// TC: O(n*n), SC: O(1)

  public static void main(String[] args) {
            p22(4);
  }
}
