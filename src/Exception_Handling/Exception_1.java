package Exception_Handling;
import java.util.*;

public class Exception_1 {
	
 void divide(int a,int b) {
	 try {
			System.out.println("try");
			 int div=a/b;
			 System.out.println(div);
			 
			 System.out.println("Catch block dont execute");
			 
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
			System.out.println("Denominator is always greater than zero");
			
		}
 }
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a and b");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.println("Start");
	Exception_1 e1=new Exception_1();
	 e1.divide(a, b);
	 System.out.println("end");
	 sc.close();
	
}
}
