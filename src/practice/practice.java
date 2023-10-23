package practice;

public class practice {
	
	//Q1 circular prime number
 public static int count(int n) {
	 
	 int c=0;
	 while(n>0) {
	   c++;
	   n/=10;
	 }
	 return c;
 }
 
 public static int pow(int b,int p) {
	 int res=1;
	 for(int i=1;i<=p;i++) {
		 res*=b;
	 }
	 return res;
 }
 
 public static boolean is_prime(int n) {
	 if(n<=1)
		 return false;
	 
	 else if (n==2 || n==3)
		 return true;
	 
	 else if(n%2==0 || n%3==0)
		 return false;
	 
	 for(int i=5;i<=Math.sqrt(n);i++) {
		 if(n%i==0)
			 return false;
	 }
	 return true;
 }
 
 public static boolean circular_prime(int n) {
	int c=0;
	int num=n;
	while(num>0) {
		c++;
		num/=10;
	}
	 for(int i=1;i<=count(n);i++) {
		 if(is_prime(n)) {
			 
			 int n1=n%10;
			 
			 int n2=n/10;
			 n=n1*pow(10,c-1)+n2;
		 }
		 else {
			 return false;
		 }
	 }
	 return true;
 }
 
 //Q2 Reverse number
 public static int reverse(int n) {
	 int rev=0;
	 
	 while(n>0) {
		 int last=n%10;
		 rev=(rev*10)+last;
		 n/=10;
	 }
	 return rev;
 }
 
 //Q3 Armstrong number
 public static boolean Armstrong_number(int n) {
	 int sum=0;
	 int num=n;
	 while(num>0) {
		 int last=num%10;
		 sum+=pow(last,3);
		 num/=10;
	 }
	 System.out.println(sum);
	 if(sum==n) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
 //Q4 GCD
 public static int GCD(int a,int b) {
	 int hcf=1;
	 for(int i=1;i<=a&& i<=b;i++) {
		 if(a%i==0 && b%i==0) {
			 hcf=i;
		 }
	 }
	 return hcf;
 }
 
 //Q5 LCM
 public static int LCM(int a,int b) {
	 int lcm=a>b?a:b;
	 while(true) {
		 if(lcm%a==0 && lcm%b==0) {
			 break;
		 }
		 else {
			 lcm++;
		 }
	 }
	 return lcm;
 }
 // Q6 Happy number
 public static int square_digit(int n) {
	int sum=0;  
	 while(n>0) {
		  int last=n%10;
				sum+=last*last; 
				n/=10;
	  }
	 return sum;
 }
 public static boolean Happy(int n) {
	if(n==1 || n==7) {
		return true;
		}
	while(n>9) {
		if(square_digit(n)==1) {
			return true;
		}
		else {
			n=square_digit(n);
		}
	}
      if(n==7) {
    	  return true;
      }
      else {
    	  return false;
      }
 }
 
 public static void main(String[] args) {
//	System.out.println(circular_prime(1190));
//	 System.out.println(reverse(1234));
//	 System.out.println(Armstrong_number(153));
//	 System.out.println(GCD(24,36));
//	 System.out.println(LCM(15,25));
	 System.out.println(Happy(25));
}
}
