package patterns;
import java.util.Scanner;

public class Star_pattern {
public static void pattern_1(int n) {
	for(int  i=1;i<=n;i++) {
		for(int j=1;j<=i;j++){
			System.out.print
			("* ");
	}
		System.out.println();
}
	
	
}

 
public static void pattern_2(int n) {
	int count=1;
	for(int  i=1;i<=n;i++) {
		for(int j=1;j<=i;j++){
			System.out.print
			(count+ " ");
			count++;
	}
		System.out.println();
}
	
	
}

public static void pattern_3(int n) {
	 
	for(int  i=1;i<=n;i++) {
		for(int j=1;j<=i;j++){
			System.out.print
			(j+ " ");
			
	}
		System.out.println();
}
	
	
}

public static void pattern_4(int n) {
	 
	for(int  i=1;i<=n;i++) {
		for(int j=1;j<=i;j++){
			System.out.print
			(i+ " ");
			
	}
		System.out.println();
}
	
	
}

public static void pattern_5(int n) {
	 
	for(int  i=n;i>=1;i--) {
		for(int j=1;j<=i;j++){
			System.out.print("* ");
			
	}
		System.out.println();
}
	
	
}

public static void pattern_6(int n) {
	
	for(int  i=1;i<=n;i++) {
		int count=1;
		char ch='A';
		for(int j=1;j<=i;j++){
	
			 if(i%2==0) {
				 System.out.print(ch+ " ");
				 ch++;
			 }
			 else {
				 System.out.print(count+" ");
				 count++; 
			 }
			
	}
		System.out.println();
}
	
	
}


public static void pattern_7(int n) {
	
	int count=1;
	char ch='A';
	for(int  i=1;i<=n;i++) {
		
		for(int j=1;j<=i;j++){
	
			 if(i%2==0) {
				 System.out.print(ch+ " ");
				 ch++;
			 }
			 else {
				 System.out.print(count+" ");
				 count++; 
			 }
			
	}
		System.out.println();
}
	
	
}

public static void pattern_8(int n) {
	
 
	char ch='A';
	int count=1;
	for(int  i=1;i<=n;i++) {
		
		for(int j=1;j<=i;j++){
	 
		 if((i+j)%2==0) {
			 System.out.print(count+" ");
		   count++;
		 }
		 else
		 {
			 System.out.print(ch+ " ");
			 ch++;
		 }
			
	
	}
		System.out.println();
}
	
	
}

public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
//	pattern_1(n);
//	pattern_2(n);
//	pattern_3(n);
//	pattern_4(n);
//	pattern_5(n);
//	pattern_6(n);
//	pattern_7(n);
	pattern_8(n);
	
	sc.close();
}
}
