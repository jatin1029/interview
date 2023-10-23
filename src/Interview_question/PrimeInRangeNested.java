package Interview_question;

import java.util.Scanner;

public class PrimeInRangeNested {
	// logic 1
	public static void primeRange(int n) {
//		int c=0;
		for(int i=1;i<=n;i++) {
			int c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(i>=2 && c==0) {
				System.out.print(i+" ");
			}
//			else {     if c=0 initialize outside the loop
//				c=0;
//			}
		
      	}
		System.out.println();
	}
	
	// Helper method 
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		else if (n==2|| n==3) {
			return true;
		}
		else if (n%2==0 || n%3==0) {
			return false;
		}
		 
		for(int i=5;i<=Math.sqrt(n);i++) {
			 if(n%i==0) 
				 return false;
		}
		
		return true;
	}
	// Logic 2
	public static void primeRange2(int n) {
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
		int n=sc.nextInt();
		primeRange(n);
		primeRange2(n);
		
		sc.close();
		
	}

}
