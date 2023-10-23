package java_class;
import java.util.*;
// here we questions of finding of power of number 
// and we another we find factorial of number



public class facto {
	// int is only work upto n=12
	// long is only work uptp n=20
	public static int facto1(int n) {
 
		int fac=1;
		for(int i=1;i<=n;i++)
		{
		fac*=i;	
		
		}
		
		// Another logic to decrement the loop
//		for(int i=n;i>=1;i--) {
//			fac=fac*i;
//		}
		
		return fac;
	}
	
	
	// power of number
	public static int pow(int a,int n) {
	 
		int p=1;
		for(int i=1;i<=n;i++) {
			p=p*a;
		}
		return p;
	}
	
	
	// factors of given number
	public static void factor(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the value of n");
//	int n=sc.nextInt();
//    System.out.println(facto1(n));
    
	
//    System.out.println("Enter the value of a");
//    int a=sc.nextInt();
//    System.out.println("Enter the value of b");

	        
//    int b=sc.nextInt();
//    System.out.println(pow(a,b));
	
	System.err.println("Enter the value of n");
	int n=sc.nextInt();
	factor(n);
	sc.close();
}
}
