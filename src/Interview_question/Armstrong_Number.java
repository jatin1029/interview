package Interview_question;
import java.util.Scanner;
public class Armstrong_Number {
// logic 1 with Math.pow(last,3) method
	public static boolean Armstrong(int n) {
		int num=n;
		int sum=0;
		while(n>0) {
			int last=n%10;
			sum+=Math.pow(last,3);		 
			n/=10; // This is most important
		}
	
        	if(sum==num) 
	          	return true;
	
     		else
			  return false;
	}

	
	// logic 2 for helper method
	
	public static int power(int n,int m) {
		int pow=1;
		for(int i=1;i<=m;i++) {
			pow*=n;
		}
		return pow;
	}
	
	public static boolean Armstrong_2(int n) {
		int original=n;
		int sum=0;
		while(n>0) {
			int last=n%10;
		  sum+=power(last,3);
	   n/=10;
	}
		if(sum==original)
			return true;
		else 
			return false;
		
}
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter the number");
   int n=sc.nextInt();

		 
		System.out.println(Armstrong(n));
		System.out.println(Armstrong_2(n));
	sc.close();
		
		
	}
}
