
package java_class;
import java.util.*;
public class Greatest {

	
	// Greatest of three number
	int great(int a,int b, int c) {
		if(a>b && a>c) {
		 return a;
  		}
		
		else {
			if(b>c) {
				return b;
			}
			else {
				return c;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		Greatest g1=new Greatest();
		System.out.println(g1.great(a,b,c));
		sc.close();
	}
}
