package java_class;
import java.util.Scanner;

public class Series {
	
	 static void square_series(int n) {
			int a=1;
			 for (int i=1;i<=n;i++) {
				System.out.print(a*a+" ");
				a++;
			 }
		}
	// Q1 
	 public static void factors(int n) {
		 int count=0;
		 for(int i=1;i<=n;i++) {
			 if(n%i==0) {
				 System.out.print(i+" ");
				 count++;
			 }
		 }
		 System.out.println();
		 System.out.println("Count of factors "+count);
		 
	 }
	
	 //Q2
	 public static void factors1(int n) {
		 for(int i=2;i<n;i++) {
			 if(n%i==0) {
				 System.out.print(i+" ");
			 }
		 }
		 System.out.println();
	 }
	 
	 //Q3
	 
	 
	 public static int factors2(int n) {
		 int sum=0;
		 for(int i=1;i<=n;i++) {
			 if(n%i==0) {
            sum+=i;
			 }
		 }
		 return sum;
	 }
	 
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 
//	 square_series(a);
	 factors(a);
//	 factors1(a);
	 System.out.println("Sum of factors are "+factors2(a));
	 sc.close();

}
}