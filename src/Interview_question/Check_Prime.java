package Interview_question;
import java.util.Scanner;
public class Check_Prime {
	public static boolean is_prime(int n) {
		if(n<=1) {
			return false;    
			                 
		}
		else if( n==2 || n==3) {
			return true;  // 
                          //  2 is the only even prime number
		                 // 	3 is only a prime number
		} 
		else if (n%2==0 || n%3==0) { // except 2 all even number are  non-prime number
			return false;         // for odd number is divisible by 3 is non-prime
		}                         // Time complexity of non-prime div by 3 is O(2)
	    
		for(int i=5;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false; // odd non-prime number which is not div by 3
			                 // Time complexity is O(sqrt(n))
		}
		
		return true; //  odd prime  number time complexity is O(n/2)
		            // so final time complexity is O(n/2)
	}
	
  
	// nth prime number
	public static int  nth_prime(int n) {
	  int p=0;
	  int i=2;
	 while(n>0) {
		 if(is_prime(i)) {
			 p++;
			 if(p==n) {
				 
				 break;
			 }
		 }
		 i++;
	 }
	 return i;
	 }
 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
//	System.out.println(is_prime(n));
	   System.out.println(nth_prime(n));
	sc.close();
	}

}
