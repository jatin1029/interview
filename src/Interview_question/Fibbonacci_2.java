package Interview_question;
import java.util.Scanner;
public class Fibbonacci_2 {
// print n fibbonaci
	public static void fibo_1(int n) {
		int n1=0;
		int n2=1;
		
		System.out.print(n1+" "+n2+" ");
		for(int i=1;i<=n-2;i++) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
	}
	
	//print nth fibbonacci
	public static int fibo_2(int n) {
		int n1=0;
		int  n2=1;
		if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		int p=2;
		int n3=0;
	 while(n>0) {
		 n3=n1+n2;
		 p++;
		 if(p==n) {
		 break;
		 }
		 n1=n2;
		 n2=n3;
		}
	 return n3;
	 
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
//		fibo_1(n);
		System.out.println(fibo_2(n));
		sc.close();
	}
}
