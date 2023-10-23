package Interview_question;
 

import java.util.Scanner;

public class Special_Number {

	public static int fac(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		return f;
	}
	
	// Special number is sum of factorial of each is equal to same number
	// logic 1 with the helper method
	public static boolean special(int n) {
		int num=n;
		int sum=0;
		while(n>0) {
			int last=n%10;
			sum+=fac(last);
			n/=10;
			
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Logic 2 without helping method 
	public static boolean special_2(int n) {
		int num=n;
		int sum=0;
		while(n>0) {
			
			int last=n%10;
			int f=1;
			for(int i=1;i<=last;i++)
			{
				f*=i;
			}
			sum+=f;
			n/=10;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number"); 
	 int n=sc.nextInt();
		System.out.println("give num is special: "+special(n));
		System.out.println("give num is special: "+special_2(n));
		sc.close();
	}
}
