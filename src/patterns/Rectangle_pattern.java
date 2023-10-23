package patterns;
import java.util.Scanner;

public class Rectangle_pattern {
	public static void pattern_1(int n,int m) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	 
		public static void pattern_2(int n) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
	
		public static void pattern_3(int n) {
			int count=1;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(count+" ");
					count++;
				}
				System.out.println();
			}
		}
		
		
		public static void pattern_4(int n) {
		
			for(int i=1;i<=n;i++) {
				char ch='A';
				for(int j=1;j<=n;j++) {
					System.out.print(ch+" ");
					ch++;
				}
				System.out.println();
			}
		}
		
		public static void pattern_5(int n) {
			char ch='A';
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=n;j++) {
					System.out.print(ch+" ");
			
				}
				ch++;
				System.out.println();
			}
		}
		
		public static void pattern_6(int n,int m) {
			
//			for(int i=1;i<=n;i++) {
//				char ch='A';
//				for(int j=1;j<=m;j++) {
//					System.out.print(ch+" ");
//					ch++;
//				}
//				System.out.println();
//				for(int j=1;j<=m;j++) {
//					System.out.print(j+" ");
//				
//				}
//			 
//				System.out.println();
//			}
//			or
			for(int i=1;i<=n;i++) {
				char ch='A';
				for(int j=1;j<=m;j++) {
				if(i%2==0) {
					System.out.print(j+" ");
					
				            }
				 
				else {
				System.out.print(ch+" ");
				ch++;
				     }
				                       }
				System.out.println();
				}
				
			 
		}
		
	public static void pattern_7(int n,int m) {
			
		int count=1;
		char ch='A';
		for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=m;j++) {
					System.out.print(ch+" ");
					 ch++;
				}
				System.out.println();
				for(int j=1;j<=m;j++) {
					System.out.print(count+" ");
				  count++;
				}
		
				System.out.println();
			}
		}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of n and m");
   int n=sc.nextInt();
   int m=sc.nextInt();
//   pattern_1(n,m);
//   pattern_2(n);
//    pattern_4(n);
//   pattern_5(n);
   pattern_6(n,m);
//   pattern_7(n,m);
   
   sc.close();
 
}
}
