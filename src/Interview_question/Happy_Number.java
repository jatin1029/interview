package Interview_question;
import java.util.Scanner;
public class Happy_Number{ 

	
	public static int  square_sum(int n) {
		 	
		   int sum=0;
			while(n>0) {
				
				int last=n%10;
			    sum+=(last*last);
			    
			    n/=10;
			}
			return sum;
			 	}
	public static boolean happy(int n) {
		  
		 
		 if(n==1 || n==7) {
				return true;
			}
		 
		 

		 // This loop execute till we get single digit sum
		 while(n>9) {// n means sum of each digit is sigle digit
		 
		 if(square_sum(n)==1) {
			 return  true;
		 }
		 n=square_sum(n);
		
		 }
		 
		 // outside the loop
		 if(n==7) {
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
System.out.println(happy(n));
sc.close(); 
}	 
}

