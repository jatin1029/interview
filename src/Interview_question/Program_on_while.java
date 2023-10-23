package Interview_question;

import java.util.Scanner;

public class Program_on_while {

	//Q1. Product of digits
	public static int product(int n) {
		int pro=1;
		while(n>0) {
			int last=n%10;
			pro*=last;
			n/=10;
		}
		return pro;
	}
	
	//Q2. Sum of even digits
	public static int sum_even(int n) {
		int sum=0;
		while(n>0) {
			int last=n%10;
		  if(last%2==0) {
			  sum+=last;
		  }
			n/=10;
		}
		return sum;
	}
	

	//Q.3 print even digits
	public static void odd_digits(int n) {
	 
		while(n>0) {
			int last=n%10;
		  if(last%2!=0) {
			  System.out.print(last+" ");
		  }
			n/=10;
		}
	
	}
	
	//Q.SPY number sum of digits are equals to product of digits
	public static boolean spy(int n) {
		int pro=1;
		int sum=0;
		while(n>0) {
			int last=n%10;
			pro*=last;
			sum+=last;
			n/=10;
		}
		if(sum==pro)
			return true;
		
		else 
			return false;
		
	}
	
//	Q5. count even number and odd number
	
	public static void count_even_odd(int n) {
		int even=0;
		int odd=0;
		while(n>0) {
			int last=n%10;
			 if(last%2==0)
				 even++;
			 else
				 odd++;
			n/=10;
		}
		System.out.println("count of even is: "+even+" and count of odd is: "+odd);
		 
		
	}
	 // Q6. Reverse a number
	public static int reverse(int n) {
		int rev=0;
		while(n>0) {
			int last=n%10;
			rev= (rev*10) + last;
			
			n/=10;
		}
		return rev;
	}
	
//	Q7 count even and odd but 0 is not takes as even and odd
	
	
	public static void count_even_odd_2(int n) {
		int even=0;
		int odd=0;
		while(n>0) {
			int last=n%10;
			 if(last%2==0 && last!=0) 
				 even++;
			 else {
			
			 if(last!=0) {
				 odd++;

			 }				 }
			n/=10;
		}
		System.out.println("count of even is: "+even+" and count of odd is: "+odd);
		 
		
	}
	
	//Q8 particular nu comes in how many number of time in given range
	// ex for 1-30   how many number time 2 occurs
	// 2,12,20,21,22,23,24,25,26,27,28,29 =13
	// for 3: 3,13,23,30 =4
	public static void count_2(int n,int key)
	{
		int c=0;
		for(int i=1;i<=n;i++) {
		 
		
	     if ((i%10==key) &&(i/10==key)) {
				 c+=2;
			 }
      		else if(i%10==key || i/10==key) {
			 c++;
		 }
		        		
		}
		System.out.println(c);
		
	}
	
	// Q9 how to add number in right side n=123,m=45
	// that means new number is 12345
	
	public static int number(int n,int m) {
		int c=0;
		int newnum=m;
		while(m>0) {
	       
			c++;
			m/=10;
		}
		newnum=(n)*(int)(Math.pow(10,c))+newnum ;
		return newnum;
	}
	
	
	 // Q10. palindrome
		public static  boolean palindrome(int n) {
			int num=n;
			int rev=0;
			while(n>0) {
				int last=n%10;
				rev= (rev*10) + last;
				
				n/=10;
			}
			if(num==rev)
				return true;
			else
				return false;
		}
		// 11 find the power
		public static int pow(int b,int p) {
			int result=1;
			for(int i=1;i<=p;i++) {
				result*=b;
			}
			return result;
		}
		
		// 12. Rotation number
		
		public static int rotation(int n) {
	          int c=0;
	          int num=n;
			while(n>0) {
	            c++;  
				n/=10;
			 }
			int n1=num%10;
			 int n2=num/10;
			 return n1*pow(10,c-1)+n2;
		}
		
		// 13  nth rotation
		public static int nrotation(int n,int r) {
			for(int i=1;i<=r;i++) {
				 int c=0;
		          int num=n;
				while(num>0) {
		            c++;  
					num/=10;
				 }
				int n1=n%10;
				 int n2=n/10;
				 n=n1*pow(10,c-1)+n2;
			}
			return n;
		}
		
		// 14 n rotation
		public static void nthrotation(int n) {
		int c=0;
		int num1=n;
	
			while(num1>0) {
				c++;
				num1/=10;
			}
			for(int i=1;i<=c;i++) {
				int count=0;
				int num2=n;
				while(num2>0) {
					count++;
					num2/=10;
				}
				int n1=n%10;
				int n2=n/10;
				n=n1*pow(10,count-1)+n2;
				System.out.println(n);
				
				
			}
		}
		
		// checking prime number
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
			 
			for(int i=5;i<=Math.sqrt(n);i+=2) {
				 if(n%i==0) 
					 return false;
			}
			
			return true;
		}
		
		//15 Circular prime
		public static boolean  circularPrime(int n) {
			int c=0;
			int num1=n;
		
				while(num1>0) {
					c++;
					num1/=10;
				}
				for(int i=1;i<=c;i++) {
					int count=0;
					int num2=n;
					while(num2>0) {
						count++;
						num2/=10;
					}
					int n1=n%10;
					int n2=n/10;
					n=n1*pow(10,count-1)+n2;
					 if(isPrime(n)==false)
					 {
						return false; 
					 }
					
				}
				return  true;
			}
			
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the digits");
		int n=sc.nextInt();
		
		System.out.println(product(n));
//		System.out.println(sum_even(n));
//         odd_digits(n);		
//		System.out.println(spy(n));
//		count_even_odd(n);
//	  System.out.println(reverse(n));
//		count_even_odd_2(n);
//		int key=sc.nextInt();	
//			count_2(n,key);
//		System.out.println(number(13,576));
//		System.out.println(palindrome(n));
//		System.out.println(rotation(n));
		
		
//		System.out.println(nrotation(1234,2));
//		nthrotation(1234);	
		
		System.out.println(circularPrime(1931));
		sc.close();
	} 
}
