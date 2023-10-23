package java_class;
import java.util.Scanner;
public class Electricity_Bill {
 
	
	// Logic 1 with if else condition
	 static int Bill (int unit) {
		int b=0;
		if(unit>=101 && unit<=200) {
			
		  b= (unit-100)	*5;
		}
		if(unit>200) {
		
			b=(unit-200)*10 + (100 * 5);
		}
              return b;
	}
	 
	 // Logic 2 with loops 
	 static int Bill2(int unit) {
		 int a=0;
		 int b=0;
		 int count=1;
		 int count2=1;
		 for(int i=101;i<=unit;i++) {
			 
			 if(i>=101 && i<=200) {
			   a=count*5;
			   count++;
			 }
			 else 
			 {
				 b=count2*10;
				 count2++;
			 }
		 
			 
		 
		 }
		 return a+b;
	 }
	
	
	public static void main(String[] args) {
		int unit;
		 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the unit of unit consume");
		 unit =sc.nextInt();
		System.out.println("The Bill of "+unit+" unit is "+Bill(unit)+" rupees");
//		System.out.println("The Bill of "+unit+" unit is "+Bill2(unit)+" rupees"); 
		 sc.close();
	}
}
