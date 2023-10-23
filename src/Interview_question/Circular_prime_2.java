package Interview_question;
import java.util.Scanner;
public class Circular_prime_2 {

	
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
		
		// count number of digit
		public static int count(int n) {
		   int c=0;
			while(n>0) {
			   c++;
			   n/=10;
		   }
			return c;
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
		public static void circular(int n) {
			 
	    	  
	    	  int p=0;
	    	    int c=0;
                int num=n;
				 while(num>0) {
					  c++;
					 num/=10;
				 }
			for(int i=1;i<=count(n);i++) {
				
	             if(isprime(n)) {
	            	 p++;
	            	 System.out.println(n+ " number is prime");
	               
	         int n1=n%10;
		     int n2=n/10;
		     n=n1*pow(10,c-1)+n2;
			              }
		 else {
					 System.out.println(n+" not a prime number");
					 
					 int n1=n%10;
				     int n2=n/10;
				     n=n1*pow(10,c-1)+n2;
				}
	      }
			System.out.println("Number of digits are: "+count(n));
			System.out.println("Number of prime number: "+p);
	      
			// Checking for circular prime;--
			if(c==p) {
				System.out.println("Cicular prime");
			}
			else {
				System.out.println("not a circular prime");
			}
	    		  
	}
		public static void main(String[] args) {
		 	Scanner sc=new Scanner(System.in);
		 	System.out.println("Enter the number");
		 	int n=sc.nextInt();
	   circular(n);
			
			sc.close();
		}
	

}
