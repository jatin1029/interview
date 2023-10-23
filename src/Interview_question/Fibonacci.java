package Interview_question;
import java.util.Scanner;
 
public class Fibonacci {
	
// print n fibonacci series
     public static void nfibo(int a,int b,int n) {
    	 if(n==1) {
    		 System.out.println(a);
    	 }
    	 else {
    	   System.out.print(a+" "+b+" ");
    	       for(int i=1;i<=n-2;i++) {
    	         	int c=a+b;
    		 
    	           System.out.print(c+" ");
    	               a=b;
    	               b=c;
                                     	 }
    	       System.out.println();
    	     }
    	
    	 
     }
     
// print nth fibonacci number logic 1
	public static void nthfibo(int a,int b,int n ) {
	    int c=0;
		for(int i=1;i<=n-2;i++) {
		  c=a+b;
		    a=b;
		    b=c;
		}
	      System.out.println(c);
	}
	
//	print nth fibonacci number logic 2
	public static int  nthfibo1(int a,int b,int n ) {
	    if(n==1) {
	    	return 0;
	    }
	    else if (n==2) {
	    	return 1;
	    }
	    else {
		int c=0;
		for(int i=1;i<=n-2;i++) {
		  c=a+b;
		    a=b;
		    b=c;

		 }
		return c;
	      
	    }
	}
	
//print nth even number
	public static void ntheven(int n)
	{
	    int num=0;
		int j=0;
	for(int i=1;i<=n;i++) {
		j+=2;
		num=j;
	}
	System.out.println(num);
	
	}
	
   // sum of n fibo series
	public static void fibosum(int a,int b,int n) {
		int sum=a+b;
		for(int i=1;i<=n-2;i++) {
			int c=a+b;
			a=b;
			b=c;
			sum+=c;
		}
		System.out.println(sum);
	}
	
	// print n fibonacci number
	public static void evenfib(int a,int b,int n) {
		  
	
		for(int i=1;i<=n-2;i++) {
			int c=a+b;
			if(c%2==0) {
				System.out.print(c+" ");
			}
			a=b;
			b=c;
			
		}
	}
	
	
		public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		nthfibo(0,1,n);
//		nfibo(0,1,n);
//		ntheven(10);
//		fibosum(0,1,n);
//		System.out.println(nthfibo1(0,1,n));
//		evenfib(0,1,n);
		sc.close();
	}

}
