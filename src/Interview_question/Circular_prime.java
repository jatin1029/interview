package Interview_question;

import java.util.Scanner;

public class Circular_prime {
	
	// count number of digit
		public static int count(int n) {
		   int c=0;
			while(n>0) {
			   c++;
			   n/=10;
		   }
			return c;
		}

	// checking prime number
	public static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		else if(n==2 || n==3) {
			return true;
			}
		else if(n%2==0 || n%3==0) {
			return false;
		}
		
		for(int i=5;i<=Math.sqrt(n);i+=2) {
			if(n%i==0) {
				return false;
			}
			
		}
		 return true;
		
	}
	
	
	
	// calculate power
	public static int pow (int b,int p) {
		int result=1;
		for(int i=1;i<=p;i++) {
		  result*=b;
		}
		return result;

	}
	// circular prime;
	public static boolean circular(int n) {
		 
    	   
    	  
		for(int i=1;i<=count(n);i++) {
			
//			 
			int c=0;
		     
			int num=n;  // If we count this outside the loop that time also 
			           // it work
			while(num>0) {
				c++;
				num/=10;
			}
	 if(isprime(n)) {
		
	    int n1=n%10;
	     int n2=n/10;
	     n=n1*pow(10,c-1)+n2;
		              }
	 else {
				return false;
			}
      }
		return true;
      
    		  
}
	public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter the number");
	 	int n=sc.nextInt();
		System.out.println(circular(n));
//	 	System.out.println(pow(10,3));
		
		sc.close();
	}
}